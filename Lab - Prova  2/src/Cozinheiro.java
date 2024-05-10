import java.util.ArrayList;
import java.util.List;

public class Cozinheiro extends Pirata{

    private List<Receita> LivroDeReceita = new ArrayList<>();

    public Cozinheiro(String nome, String comidaFavorita, int poder,String nome_receita, int dificuldade) {
        super(nome, comidaFavorita, poder);

        Receita receita = new Receita(nome_receita, dificuldade);
        LivroDeReceita.add(receita);
    }

    public String prepararPrato(int index){

        try{
            if(index >= 0 && index < LivroDeReceita.size()){
                return LivroDeReceita.get(index).getNome();
            }else{
                System.out.println("indice invalido, tente novamente");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e);
        }
        return "Operacao nao concluida";
    }

    public void mostrarReceitas(){

        for (Receita receita : LivroDeReceita) {
            try{
                System.out.println("Nome: " + receita.getNome() + " ------- " + "Dificuldade: " + receita.getDificuldade());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: " + e);
            }
        }
    }



}
