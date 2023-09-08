import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String name;
        int agency;
        double initial;

        Scanner scanner = new Scanner(System.in);

        // Gera um número de conta aleatório de no mínimo 5 digitos
        Random number = new Random();
        int accountNumber = 10000 + number.nextInt(90000);

        // Cadastro de conta no banco
        System.out.println("Cadastro de novo cliente");
        System.out.print("Digite o nome do cliente: ");
        name = scanner.nextLine();

        System.out.print("Digite o número da Agência: ");
        agency = scanner.nextInt();

        System.out.print("Digite um valor inicial para conta: ");
        initial = scanner.nextDouble();

        // Criação de uma instância da classe Account com os dados inseridos pelo usuário
        Account myAccount = new Account(name, agency, accountNumber, initial);

        // Exibição de uma mensagem de boas vindas com os detalhes da conta
        System.out.println("Bem vindo " + name + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                + agency + ", conta: " + accountNumber + " e seu saldo atual é: " + initial);
    }
}
