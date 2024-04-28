import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main (String [] args){

        Scanner money = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta");
        int numeroConta = money.nextInt();

        System.out.println("Por favor, digite o número da sua agência");
        String agencia = money.next();

        System.out.println("Por favor, digite o seu nome");
        String nome = money.next();

        double saldo = 237.48;

        System.out.println("Olá" +nome + " ,obrigado por criar uma conta em nosso banco, sua agencia é " +agencia + " conta "+ numeroConta + " e seu saldo " + saldo+ " já está disponivel para saque");

        money.close();
    }

}