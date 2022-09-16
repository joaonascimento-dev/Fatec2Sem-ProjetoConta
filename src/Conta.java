import java.util.Scanner;

public class Conta {
    private String conta;
    private String agencia;
    private  double saldo;
    private  String nomeCliente;

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    Scanner sc = new Scanner(System.in);

    public int sacar(double valor){
        if (saldo > 0 && valor <= saldo) {
            saldo = saldo - valor;
            return 1;
        }
        return 0;

    }

    public void depositar(double valor){
        valor = Double.parseDouble(sc.nextLine());
        setSaldo(saldo + valor);
    }
    public  void imprimir(){
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
    }
}
