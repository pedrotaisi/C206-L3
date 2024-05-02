public class Motor {

    private int potencia;
    private boolean turbo;

    public int getPotencia() {
        return potencia;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public Motor(int potencia, boolean turbo) {
        this.potencia = potencia;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return
                " \n potencia: " + potencia +
                "\n turbo: " + turbo ;
    }
}
