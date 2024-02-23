
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrace = new Scanner(System.in);
        int n = entrace.nextInt();
        int result;

        result = Fatorial(n);
        System.out.println("o fatorial de " + n);
        System.out.println(result);

        System.out.println();

        System.out.println("numeros pares entre 0 e " + n);
        MostrarNmerosPares(n);

    }

    public static int Fatorial(int number) {

        if (number == 1)
            return 1;
        else
            return number*Fatorial(number - 1);
    }

    public static void MostrarNmerosPares(int number){

        for(int i = 0; i <= number; i++){

            if(i % 2 == 0)
                System.out.print( i + " ");
        }
    }
}
