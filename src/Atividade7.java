import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 //solicitar numeros
        System.out.println("Digite um numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite outro numero: ");
        double numero2 = sc.nextDouble();

        //opçoes de operaçoes
        System.out.println("Escolha a operação");
        System.out.println("1 - adição (+)");
        System.out.println("2 - subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 divisão (/)");

        System.out.println("Digite o numera da operação desejada: ");
int operacao = sc.nextInt();
double resultado =0;

// contas
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
                break;
                    default:
                    System.out.println("Operação invalida");
        }
        sc.close();


    }
}
