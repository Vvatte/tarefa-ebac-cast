import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        System.out.println("Digite seu Cpf");
        Scanner cpf = new Scanner(System.in);

        System.out.println("Digite seu Rg");
        Scanner rg = new Scanner(System.in);

        System.out.println("Digite sua idade");
        Scanner idade = new Scanner(System.in);

        System.out.println("Seu Cpf:" + cpf + ", seu Rg:" + rg + ",sua idade:" + idade);
    }
}
