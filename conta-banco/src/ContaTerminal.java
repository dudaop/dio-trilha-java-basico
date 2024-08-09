import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()

        System.out.println("Por favor, digite o número da Conta:");
        String conta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem inicial
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta + ", conta " + agencia + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Menu de operações
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSelecione uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso. Seu saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. Seu saldo atual é: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Obrigado por usar nosso serviço. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
