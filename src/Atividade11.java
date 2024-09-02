import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double valorBruto=0;
        System.out.println("Digite o valor do bruto: ");
        valorBruto = sc.nextDouble();

        double anosTrabalhados =0;
        System.out.println("Digite o numeros de anos trabalhados: ");
        anosTrabalhados = sc.nextDouble();

        // variaveis para bonus e impostos

        double bonus =0;
        double percentualDesconto=0;
        double impostos = 0;

        // regras bonus

        if (anosTrabalhados >10){
            bonus = valorBruto * 0.10;
        } else if (anosTrabalhados >=5 && anosTrabalhados <=10) {
            bonus = valorBruto * 0.05;
        }else{
        bonus =0;}

        //regras impostos

        if(valorBruto >5000){
            impostos = 27.0;
        }else if(valorBruto >=3000 && valorBruto <=4999.99){
            impostos = 18.0;
        }else {
            impostos =10.0;
        }

        //calcular valor do imposto

        impostos = valorBruto * impostos /100;

        //calcular valor liquido
        double salarioLiquido =valorBruto + bonus - impostos;

        System.out.println("Salario Bruto: "+valorBruto);
        System.out.println("Bonus recebido: "+bonus);
        System.out.println("Impostos: "+impostos);
        System.out.println("Salario Liquido: "+salarioLiquido);

        }
    }
