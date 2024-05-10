
public class Main {
    public static void main(String[] args) {

        Pirata pirata = new Pirata("Jorge", "Frango", 15);
        Pirata espadachim = new Pirata("claudio", "Macarrao", 30);
        Capitao capitao = new Capitao("pedro","Arroz", 10, 5);
        Cozinheiro cozinheiro = new Cozinheiro("julio","Carne",11,"Frango", 2);
        Cozinheiro auxiliar = new Cozinheiro("mateus", "Linguica", 9, "Arroz", 3);
        Espadachim espadachim_1 = new Espadachim("robson", "tomate",50, "matadoura");

        //função comer sendo a comida favorita
        pirata.comer(cozinheiro, 0);

        //função comer nao sendo a comida favorita
        capitao.comer(cozinheiro, 0);

        //teste de verifivação de erro(caso invalido)
        pirata.comer(auxiliar, 5);

        //função lutar caso teste
        Pirata result = pirata.lutar(espadachim);

        if(result != null){
            System.out.println(result.getNome());
        }else{
            System.out.println("Empate");
        }

        //funçao novosSeguidores
        capitao.conquistarNovoSeguidor(espadachim);

        //funções mudarDeRota e darOrdens (capitão)
        capitao.darOrdens();
        capitao.mudarRota();

        //funções mudarDeRota e darOrdens (espadachim)
        espadachim_1.darOrdens();
        espadachim_1.mudarRota();

        //nome da espada do espadachim
        System.out.println(espadachim_1.getNomeDaEspada());

        //mostrando as receitas
        cozinheiro.mostrarReceitas();


    }
}