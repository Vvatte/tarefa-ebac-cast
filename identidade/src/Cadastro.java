import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner cpf = new Scanner(System.in);
        Integer cpf;
        System.out.println("Digite seu Cpf");
        cpf.nextInt();

        System.out.println("Seu Cpf:" + cpf);

        cpf.close();
    }
}
