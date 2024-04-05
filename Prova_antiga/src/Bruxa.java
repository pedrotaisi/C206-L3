public class Bruxa extends Monstro{

    private Feitico []feiticos = new Feitico[4];


    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public boolean aprenderFeitico(String nome, int poder){

        for (int i = 0; i < feiticos.length; i++) {

            if(feiticos[i] == null){
                feiticos[i] = new Feitico(nome, poder);
                return true;
            }
        }
        return false;
    }

    public void listarFeiticos(){
        for (Feitico feitico : feiticos) {
            if (feitico != null)
                System.out.println("nome do feitico: " + feitico.getNome());
        }
    }

    public  void esquecerFeitico(int posicao){
        feiticos[posicao] = null;
        System.out.println("feitiço apagado com sucesso");
    }

    public void lancarFeitico(Monstro montroAlvo, int posicao){
        int dano = feiticos[posicao].getPoder();
        int new_vida = montroAlvo.getVida() - dano;
        System.out.println("dano aflingido: " + dano);
        System.out.println("vida do monstro restante: " + new_vida);
    }
}
