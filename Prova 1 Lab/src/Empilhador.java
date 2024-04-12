public class Empilhador extends Robo{


    private Pacote []pacote = new Pacote[5];
    private int pesoMaximo;

    public Empilhador(int energia, String nome, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public void adicionarPacote(int peso){

        if(peso > pesoMaximo){
            System.out.println("peso maximo ultrapassso, não foi possivel adicionar o pacote");
        }
        else{
            Pacote pacotes = new Pacote(peso);

            for (int i = 0; i < pacote.length; i++) {

                if(pacote[i] == null){
                    pacote[i] = pacotes;
                    break;
                }
            }

            System.out.println("pacote adicionado com sucesso");
        }
    }

    public void removePacote(int posicao){
        pacote[posicao] = null;
        System.out.println("Pacote removido com sucesso");
    }

    public void mostraPacotes(){

        System.out.println("Mostrando contudo dos pacotes: ");

        for (Pacote value : pacote) {

            if (value != null)
                System.out.println(value.getPeso());

        }
    }
}
