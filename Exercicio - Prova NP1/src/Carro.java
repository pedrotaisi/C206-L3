public class Carro {

    private Motor motor;
    private int tipoDePneu;

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void correr(){
        System.out.println("o carro esta pronto para a corrida");
    }

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        motor = new Motor(potencia, turbo);
        this.tipoDePneu = tipoDePneu;
    }

    @Override
    public String toString() {
        return "\n" +
                "Detalhes do motor: " + motor +
                "\n tipoDePne: " + tipoDePneu;
    }
}
