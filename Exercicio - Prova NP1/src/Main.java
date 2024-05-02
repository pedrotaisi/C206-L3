
public class Main {
    public static void main(String[] args) {

        Equipe equipe =  new Equipe("Porche");

        Piloto piloto_1 = new Piloto("cleison", 21, "japao");
        Piloto piloto_2 = new Piloto("robson", 31, "Egito");
        Piloto piloto_3 = new Piloto("jorge", 25, "Laos");
        Piloto piloto_4 = new Piloto("jobson", 27, "Micronesia");
        Piloto piloto_5 = new Piloto("rodrigo", 30, "Botao");

        equipe.constroiCarro(3, 200,true);

        //caso especial, onde nenhum piloto foi cadastrado
        System.out.println("teste funcao pitStop: ");
        equipe.pitStop(4, 1);

        System.out.println();

        //cadastrando o os pilotos
        System.out.println("adiciocinando pilotos de 1 a 4 (casos validos):");
        System.out.println(equipe.adicionarPiloto(piloto_1) ? "sucesso" : "fracasso");
        System.out.println(equipe.adicionarPiloto(piloto_2) ? "sucesso" : "fracasso");
        System.out.println(equipe.adicionarPiloto(piloto_3) ? "sucesso" : "fracasso");
        System.out.println(equipe.adicionarPiloto(piloto_4) ? "sucesso" : "fracasso");

        equipe.setPilotoAtual(piloto_3);

        System.out.println();

        //testando caso onde todos os 4 pilotos ja forma cadastrados
        System.out.println("piloto 5 para testar as condicoes de erro");
        System.out.println(equipe.adicionarPiloto(piloto_5) ? "sucesso" : "fracasso");

        System.out.println();

        //verificando a a funcao retirarPiloto para uma posicao existente
        System.out.println("retirando piloto valido o piloto 2");
        System.out.println(equipe.retirarPiloto(2) ? "sucesso" : "fracasso");

        System.out.println();

        //verificando a para um posicao invalida
        System.out.println("retirando piloto invalido");
        System.out.println(equipe.retirarPiloto(7) ? "sucesso" : "fracasso");

        System.out.println();


        //testando todos os possiveis casos( validos e nao validos) da funcao pitStop
        System.out.println("casos validos para pitStop: ");
        equipe.pitStop(5,1);

        System.out.println();

        System.out.println("casos invalidos para pitStop: ");
        equipe.pitStop(7, 2);
        System.out.println();
        equipe.pitStop(8, 8);

        System.out.println();


        //mostrando configuracoes do carro e se o carro esta pronto para a corrida
       piloto_1.correr(equipe.getCarro());

        System.out.println();

        //Mostrando todas as informacoes
        System.out.println("Mostrando as informacoes: ");

        System.out.println(equipe);
        

    }
}