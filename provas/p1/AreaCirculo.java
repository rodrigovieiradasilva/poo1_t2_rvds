import java.util.Scanner;

public class AreaCirculo {

    public static void main(String args[]){

        Scanner inicio = new Scanner(System.in);


        System.out.print("Por favor agora digite qual eh o Raio? ");
        double raio = inicio.nextDouble();


                double area = Math.PI * Math.pow(raio,2.0);

        System.out.printf("area = %.2f ",area);
        System.out.printf("prova concluida de poo");

    }
}