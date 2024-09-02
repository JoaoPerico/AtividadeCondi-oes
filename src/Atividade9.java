import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// pedir numero
        double numero =0;

        System.out.println("Digite um numero: ");
        numero = sc.nextDouble();

// dizer se é positivo ou negativo

        if (numero >0){
            System.out.println("É positivo!");
        } else if (numero <0) {
            System.out.println("É negativo!");
        }else {
            System.out.println("zero");
        }
sc.close();

    }
}
