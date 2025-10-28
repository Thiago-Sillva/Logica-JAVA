import java.util.Random;
import java.util.Scanner;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();



        System.out.println("=== GERADOR DE SENHAS === :) ! ");

        System.out.println("Qual o seu nome ? : ");
       String nome = scanner.nextLine();



        System.out.print("Digite o comprimento da senha: ");
        int tamanho = scanner.nextInt();

        // todos os caracteres que é possivel usar nisso
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";

        StringBuilder senha = new StringBuilder();

        //aqui vai gerar a senha
        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println(nome  +  " Sua senha gerada é: " + senha.toString());
        System.out.println("Obrigado por usar o gerador de senhass feito por mim obrigado: " + nome + "!");

        scanner.close();
    }
}
