public class Vampiro extends Monstro {

    private int medidorDeSangue;
    private boolean formaDeMocergo;

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMocergo) {
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMocergo = formaDeMocergo;
    }

    public void transformar() {

        if (formaDeMocergo) {
            System.out.println("transformação ja ativada");
        } else {
            formaDeMocergo = true;
            System.out.println("transformação efetuada");
        }

    }

    public void recuperarVida() {

        if (medidorDeSangue > 0) {
            System.out.println("vida recuperada com sucesso");
        } else {
            System.out.println("voce morreu");
        }

    }

    public void atacarComMordida(Monstro monstroAlvo) {

        System.out.println("medidor de sangue atual: " + this.medidorDeSangue);
        System.out.println("minha energia: " + this.energia);
        System.out.println("energia monstro alvo: " + monstroAlvo.getEnergia());

        if (this.energia < monstroAlvo.getEnergia()) {
            System.out.println("atacar falhou");
        } else {
            System.out.println("medidor de sangue : " + this.medidorDeSangue + 80);
            System.out.println("Mordida efetua com sucesso");

        }
    }
}
