import java.util.Scanner;

public class numerosnumeros {

    public static void main (String[] args){

            Scanner leia = new Scanner(System.in); //dei o nome de leia porque e mais facil de entender o scannner

            System.out.println("Bem vindo ao programa de numeros, digite dois numeros para sabermos qual o maior:");

            System.out.println("Digite o primeiro numero: ");

            int num1 = leia.nextInt();

            System.out.println("Digite o segundo numero: ");

            int num2 = leia.nextInt();

            if (num1 > num2){
                System.out.println("O numero: " + num1 + " e maior que o " + num2);

            }else if (num1 == num2){
                System.out.println("Os numeros são iguais!!!");

            } else {
                System.out.println("O numero: " + num2 + " E maior que o " + num1);
            }
    }
}
