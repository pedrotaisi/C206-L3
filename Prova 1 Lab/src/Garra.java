public class Garra {
    private int pressao;

    public Garra(int pressao) {
        this.pressao = pressao;
    }

    public void agarrarPeca(){
        System.out.println("agarrando peça padrão com pressao: " + pressao);
    }

    public void agarrarPeca(int posicao){
        System.out.println("agarrando peca na posição: " + posicao + "com a pressao: " + pressao);
    }
}
