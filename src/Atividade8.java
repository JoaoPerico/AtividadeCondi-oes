import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        //pedir temperatura
        Scanner sc = new Scanner(System.in);

        double graus =0;

        System.out.println("Insira a temperatura em graus celsius: ");
        graus = sc.nextDouble();

        //temperaturas
        if (graus >30){
            System.out.println("Esta quente!");
        } else if (graus >=15) {
            System.out.println("Esta agradavel!");
        } else if (graus <15) {
            System.out.println("Esta frio!");
        }
sc.close();
    }
}
