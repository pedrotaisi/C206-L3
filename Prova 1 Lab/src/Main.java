
public class Main {
    public static void main(String[] args) {

        Robo robo_one = new Robo(100,"livia", 40);
        Robo robo_two = new Robo(40,"robson",60);

        Camera camera_one = new Camera(0);
        Camera camera_two = new Camera(1);

        BracoArticulado bracoArticulado_one = new BracoArticulado(40, "direito",50, camera_one, 5);
        BracoArticulado bracoArticulado_two = new BracoArticulado(50,"esquerdo", 70, camera_two,6);

        Empilhador empilhador = new Empilhador(30, "pedro", 40,20);

        System.out.println("parametros da classe robo: ");
        System.out.println();

        System.out.println("função trabalhar: ");
        robo_one.trabalhar();

        System.out.println();

        System.out.println("função recarregar: ");
        robo_two.recarregar(10);

        System.out.println();

        System.out.println("função trocar energia: ");
        robo_one.trocarEnergia(robo_two);

        System.out.println("-------------------");
        System.out.println();

        System.out.println("parametros da classe braco articulado: ");
        System.out.println();

        System.out.println("função trabalhar: ");
        System.out.println("braço 1: ");
        bracoArticulado_one.trabalhar();
        System.out.println();
        System.out.println("braço 2: ");
        bracoArticulado_two.trabalhar();

        System.out.println("-------------");
        System.out.println();

        System.out.println("parametros da classe empilhador: ");
        System.out.println();

        System.out.println("função adicionar pacotes: ");
        empilhador.adicionarPacote(6);

        System.out.println();

        System.out.println("função listar pacotes: ");
        empilhador.mostraPacotes();

        System.out.println();

        System.out.println("função remover pacotes: ");
        empilhador.removePacote(0);
    }
}