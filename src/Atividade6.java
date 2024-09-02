import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    Integer media =0;

        System.out.println("Insira sua media final : ");
        media = sc.nextInt();

        if (media >=7 ){
            System.out.println("Aprovado!");
        } else if (media >=5 && media < 7){
            System.out.println("Recuperação!");
        }else if (media <5){
            System.out.println("Reprovado!");
        }
        sc.close();
    }
}
