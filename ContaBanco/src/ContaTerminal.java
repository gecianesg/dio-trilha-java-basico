import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o usuário

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o número da sua conta");
            int numero = scanner.nextInt();

            System.out.println("Digite o número da agência com o dígito");
            String agencia = scanner.next();

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite o saldo");
            Double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome +  " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "  +  numero +  " e seu saldo " + saldo +  " já está disponível para saque.");
        }








    }
}
