public class BracoArticulado extends Robo{

    static int numeroDeArticulacoes = 0;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int energiaMaxima, Camera camera, int pressao) {
        super(energia, nome, energiaMaxima);
        this.garra = new Garra(pressao);
        this.camera = camera;
        numeroDeArticulacoes++;
    }

    @Override
    public void trabalhar(){

        if(camera.getQuantidade() == 0){
            System.out.println("nao ha camera neste braço");
        }
        else{

            System.out.println("retorno da função acharPecas: " + camera.acharPecas());
            garra.agarrarPeca();
        }

        System.out.println("numero de articulaçoes disponiveis: " + BracoArticulado.numeroDeArticulacoes);



    }

}
