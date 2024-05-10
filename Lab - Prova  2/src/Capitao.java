public class Capitao extends Pirata implements Comandar{

    private int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    public void conquistarNovoSeguidor(Pirata pirata){

        if(pirata.getPoder() > this.getPoder()){
            numeroDeSeguidores++;
        }else{
            System.out.println("poder insuficiente");
        }

        System.out.println("numero de seguidores atualizados: " + numeroDeSeguidores);

    }

    @Override
    public void mudarRota() {
        System.out.println("O capitao esta mudando a rota");
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitao esta ordenando X tripulantes");
    }
}
