public class Espadachim extends Pirata implements Comandar{

    private String nomeDaEspada;

    public Espadachim(String nome, String comidaFavorita, int poder, String nomeDaEspada) {
        super(nome, comidaFavorita, poder);
        this.nomeDaEspada = nomeDaEspada;
    }

    public String getNomeDaEspada() {
        return nomeDaEspada;
    }

    @Override
    public void mudarRota() {
        System.out.println("O imediato esta mudando a rota");
    }

    @Override
    public void darOrdens() {
        System.out.println("O imediato esta ordenando os tripulantes");
    }
}
