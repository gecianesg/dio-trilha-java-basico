import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número inteiro:");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int interactions = num2 - num1;

            for (int i = 0; i <= interactions; i++) {
                System.out.println(num1 + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

