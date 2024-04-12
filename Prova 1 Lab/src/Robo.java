public class Robo {
    private int energia;
    private  String nome;
    static private int totalDeRobos = 0;
    private int energiaMaxima;

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
        totalDeRobos++;
    }

    public void trabalhar(){

        System.out.println("robo " + this.nome + " esta trabalahndo");
        this.energia -= 15;

        if(this.energia <= 0)
            System.out.println("energia esgotada");
        else
            System.out.println("pode continuar trabalhando");

        System.out.println("robos ainda disponives para a trabalhar: " + totalDeRobos);
    }

    public void trocarEnergia(Robo roboAlvo){

        roboAlvo.energia = 100 + roboAlvo.energia;
        this.energia = this.energia - 100;

        if(roboAlvo.energia > roboAlvo.energiaMaxima)
            System.out.println("nao é possivel realizar a transferencia, capacidade maxima exedida");
        else if(this.energia <= 0)
            System.out.println("nao é possivel realizar, energia baixa de mais");
        else{
            System.out.println("troca concluida com sucesso");
        }

    }

    public void recarregar(int horas){

        this.energia += horas;

        if(this.energia >= energiaMaxima)
            System.out.println("capacidade maxima atingida");
        else
            System.out.println("recarga feita com sucesso");

    }

}
