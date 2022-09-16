import java.util.Scanner;

public class ContaTeste {

    static Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            construirMenu();
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    execCadastrar();
                    break;
                case 2:
                    execDepositar();
                    break;
                case 3:
                    execSacar();
                    break;
                case 4:
                    execConsultar();
                    break;
                case 9:
                    System.out.println("FIM");
                default:
                    System.out.println("Opção Inválida");
            }
        } while(opcao !=9);
    }

    private static void construirMenu() {
        System.out.println("CAIXA");
        System.out.println("1. Cadastrar");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Consultar");
        System.out.println("9. SAIR/ENCERRAR");
        System.out.println("Escolha sua opção");
    }

    public static void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Digite a sua conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Digite a sua agência: ");
        cc.setAgencia(sc.nextLine());
    }

    public static void execConsultar() {
        cc.imprimir();
    }

    public static void execSacar() {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: ");
        valor = Double.parseDouble(sc.nextLine());
        int x = cc.sacar(valor);

        if (x == 1) {
            System.out.println("Saque realizado!");
        }
        else {
            System.out.println("Saque não realizado!");
        }
    }

    public static void execDepositar() {
        double valor;
        valor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser Depositado: ");
        cc.depositar(valor);
    }

}