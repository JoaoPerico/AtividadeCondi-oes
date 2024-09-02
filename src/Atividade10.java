import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        //acima 500 - 20%
        //200 a 500 - 10%
        //100 a 199.99 - 5%
        //abaixo de 100 - zero

        Scanner sc = new Scanner(System.in);

        //armazena os valores
        double valor =0;
        double percentualDesconto = 0d;
        double desconto = 0d;

            System.out.println("Insira o valor do produto: ");
        valor = sc.nextDouble();


        //calcula a porcentagem do desconto
        if (valor > 500){
            percentualDesconto = 20.0;
        } else if (valor >=200 && valor <= 500) {
            percentualDesconto = 10.0;
        } else if (valor >=100 && valor < 200) {
            percentualDesconto = 5.0;
        }else  {
            percentualDesconto = 0.0;
        }

        //calcular desconto
        desconto = (valor * percentualDesconto) /100;

        //valor apos desconto
        double valorFinal = valor - desconto;

        // resultados
        System.out.println("Valor do produto: "+valor);
        System.out.println("Percentual de desconto: "+percentualDesconto + "%");
        System.out.println("Desconto: "+desconto);
        System.out.println("Valor final: "+valorFinal);

        sc.close();

    }
}
