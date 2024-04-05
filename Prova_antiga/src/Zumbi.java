public class Zumbi extends Monstro {

    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos) {
        super(idade, vida, energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }

    public void atacarComMordida(Monstro monstroAlvo){

        System.out.println("minha energia: " + this.energia);
        System.out.println("energia monstro alvo: " + monstroAlvo.getEnergia());

        if(this.energia < monstroAlvo.getEnergia()){
            System.out.println("atacar falhou");
        }
        else {
            numeroDeCerebrosComidos++;
            System.out.println("numero de cerebros comidos: " + numeroDeCerebrosComidos);
            System.out.println("Mordida efetua com sucesso");
        }

    }
}
