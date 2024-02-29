import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int cpf;
        System.out.println("Digite seu Cpf");
        cpf = num.nextInt();

        Integer n = cpf;
        System.out.println("Seu Cpf:" + n);

    }
}
