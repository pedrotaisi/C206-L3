public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){

        String comidaFavorita = cozinheiro.prepararPrato(index);

        if(comidaFavorita == this.comidaFavorita){
            this.poder += 2*10;
        }else if (comidaFavorita != "Operacao nao concluida") {
            this.poder += 10;
        }else{
            System.out.println(comidaFavorita);
        }

        System.out.println("Poder atualizado: " + this.poder);

    }

    public Pirata lutar(Pirata pirata){

        if(this.getPoder() > pirata.getPoder()){
            return Pirata.this;
        } else if (this.getPoder() < pirata.getPoder()){
            return pirata;
        }else{
            return null;
        }
    }
}
