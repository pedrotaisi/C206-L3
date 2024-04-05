public class Monstro {

    protected int idade;
    protected int vida;
    protected int energia;

    public Monstro(int idade, int vida, int energia) {
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void assustar(Monstro monstroAlvo){

        System.out.println("minha energia: " + this.energia);
        System.out.println("energia monstro alvo: " + monstroAlvo.getEnergia());

        if(this.energia < monstroAlvo.getEnergia()){
            System.out.println("nao foi possivel assustar");
        }
        else{
            System.out.println("susto feito com sucesso");
        }
    }
}
