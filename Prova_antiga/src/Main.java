
public class Main {
    public static void main(String[] args) {

        Monstro monstro = new Monstro(100, 120, 60);
        Zumbi zumbi = new Zumbi(200,120,40,0);
        Vampiro vampiro = new Vampiro(500, 200, 50, 35,false);
        Bruxa bruxa = new Bruxa(300,250,400);

        System.out.println("parametros da Classe monstro");

        System.out.println();

        System.out.println("funçao assustar: ");
        monstro.assustar(zumbi);

        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("parametros da classe Zumbi");

        System.out.println();

        System.out.println("função atacar com mordida: ");
        zumbi.atacarComMordida(monstro);

        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("parametros da classe vampiro");

        System.out.println("função transformar: ");
        vampiro.transformar();

        System.out.println();

        System.out.println("função recuperar vida: ");
        vampiro.recuperarVida();

        System.out.println();

        System.out.println("função atacar com mordida: ");
        vampiro.atacarComMordida(bruxa);

        System.out.println();
        System.out.println("-------------------------------");

        System.out.println("parametros da classe bruxa");

        System.out.println();

        System.out.println("funçao aprender feitiço: ");
        boolean verify = bruxa.aprenderFeitico("bola de fogo", 20);

        if(verify)
            System.out.println("sucesso na aprendizagem");
        else
            System.out.println("a aprendizagem falhou");

        System.out.println();

        System.out.println("função listar feitiço: ");
        bruxa.listarFeiticos();

        System.out.println();

        System.out.println("função lançar fetiço: ");
        bruxa.lancarFeitico(zumbi,0);

        System.out.println();

        System.out.println("função esquecer feitiço: ");
        bruxa.esquecerFeitico(0);

        System.out.println();


    }
}