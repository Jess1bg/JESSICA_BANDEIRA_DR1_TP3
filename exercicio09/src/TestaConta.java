public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Jasmine de Freitas", 78596, "859-8", "10/02/2023");

        minhaConta.deposita(1000.0);

        System.out.println("Saldo Inicial");
        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.printf("Saldo: R$%.2f\n", minhaConta.getSaldo());

        System.out.println("\nOperação de Saque");
        System.out.println("Sacando R$300.00...");
        minhaConta.saca(300.0);
        System.out.printf("Saldo após saque: R$%.2f\n", minhaConta.getSaldo());

        System.out.println("\nOperação de Depósito");
        System.out.println("Depositando R$500.00...");
        minhaConta.deposita(500.0);
        System.out.printf("Saldo após depósito: R$%.2f\n", minhaConta.getSaldo());

        System.out.println("\nRendimentos");
        double rendimento = minhaConta.calculaRendimento();
        System.out.printf("Rendimento mensal (10%%): R$%.2f\n", rendimento);
        System.out.printf("Saldo atual: R$%.2f\n", minhaConta.getSaldo());
    }
}