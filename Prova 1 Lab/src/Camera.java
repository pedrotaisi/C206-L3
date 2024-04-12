public class Camera {

    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public Camera(int quantidade) {
        this.quantidade = quantidade;
    }

    public int acharPecas(){
        return ((int) (Math.random() * 9) + 1);
    }
}
