public class Piloto {

    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral = 1;
    private int id;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

        this.id = idGeral;
        idGeral++;
    }

    public void correr(Carro carro) {
        System.out.println("Informacoes sobre o carro de corrida: ");
        System.out.println("tipo de pneu: " + carro.getTipoDePneu());
        System.out.println("potencia do motor: " + carro.getMotor().getPotencia());
        System.out.println("turbo: " + ((carro.getMotor().isTurbo()) ? "sim" : "nao"));

        System.out.println();

        System.out.println("estado do carro: ");
        carro.correr();
    }

    @Override
    public String toString() {
        return
                "\n   nome: " + nome  +
                "\n   idade: " + idade +
                "\n   nacionalidade: " + nacionalidade +
                "\n   id: " + id +
                "\n\n";
    }

}
