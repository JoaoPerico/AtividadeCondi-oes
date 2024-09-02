import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeCorreto ="joao";
        String senhaCorreta = "1234";

        System.out.println("Digite seu nome: ");
     String nome = sc.next();
        System.out.println("Digite seu senha: ");
     String senha = sc.next();

// verificar nome e senha
        if (nome.equals(nomeCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem sucedido!");
        }else {
            System.out.println("Usuario ou senha incorreto!");
        }
        sc.close();

    }
}
