import java.text.DecimalFormat;
import java.util.Scanner; //importa a classe Scanner do pacote java.util

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //objetos
        Scanner scanner = new Scanner(System.in); //cria um objeto (scanner) usando a classe Scanner;
        DecimalFormat formatador = new DecimalFormat("#0.00"); //cria um objeto (formatador) usando a classe DecimalFormat;
        
        //entrada e processamento
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine(); //recebe um valor String do usuário, e armazena na variável nomeCliente
        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.nextLine(); //recebe um valor String do usuário, e armazena na variável numeroAgencia
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt(); //recebe um valor int do usuário, e armazena na variável numeroConta;
        System.out.println("Digite o seu saldo: ");
        double saldoConta = scanner.nextDouble(); //recebe um valor double do usuário, e armazena na variável saldoConta;

        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é ".concat(numeroAgencia) + ", e o número da sua conta " + numeroConta + ".");
        System.out.println("Seu saldo atual, R$" + formatador.format(saldoConta) + ", já está disponível para saque.");

        scanner.close();

    }
}
