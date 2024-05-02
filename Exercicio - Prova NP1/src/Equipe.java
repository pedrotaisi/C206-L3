import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String nome;
    private Carro carro;

    private List<Piloto> pilotoList = new ArrayList<>();
    private Piloto pilotoAtual;

    public void setPilotoAtual(Piloto pilotoAtual) {
        this.pilotoAtual = pilotoAtual;
    }

    public Carro getCarro() {
        return carro;
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    private boolean trocarPilotoAtual(int new_pilotoAtual) {
        if (new_pilotoAtual < 0 || new_pilotoAtual >= pilotoList.size()) {
            System.out.println("Índice inválido - piloto não encontrado");
            return false;
        }
        this.pilotoAtual = pilotoList.get(new_pilotoAtual);
        return true;
    }


    private boolean trocarPneu(int tipoDePneu) {

        if (tipoDePneu >= 1 && tipoDePneu <= 5) {
            carro.setTipoDePneu(tipoDePneu);
            return true;
        }
        return false;
    }

    public void pitStop(int tipoDePneu, int piloto_old) {

        if (trocarPilotoAtual(piloto_old))
            System.out.println("a operacao de troca de pilotos foi um sucesso");
        else
            System.out.println("erro ao realizar a troca de pilotos");

        if (trocarPneu(tipoDePneu))
            System.out.println("a troca de pneu foi um sucesso");
        else
            System.out.println("tipo de pneu invalido");
    }

    public boolean adicionarPiloto(Piloto piloto) {

        if(pilotoList.size() < 4){
            pilotoList.add(piloto);
            return true;
        }else{
            System.out.println("capacidae maxima de pilotos atingida");
            return false;
        }

    }

    public boolean retirarPiloto(int piloto_old) {
        try {
            if (piloto_old < 0 || piloto_old >= pilotoList.size()) {
                System.out.println("Índice inválido - piloto não encontrado");
                return false;
            }

            pilotoList.remove(piloto_old);
            return true;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Operação inválida - índice fora dos limites");
            return false;
        }
    }


    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo) {
        carro = new Carro(tipoDePneu, potencia, turbo);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nome da equipe: ").append(nome);
        builder.append("\n\nInfo carro: ").append(carro);
        builder.append("\n\nPilotos:\n");

        for (Piloto piloto : pilotoList) {
            if (piloto != null) {
                builder.append(piloto).append("\n");
            }
        }

        builder.append("\nPiloto atual: ").append(pilotoAtual).append("\n\n");

        return builder.toString();
    }



}



