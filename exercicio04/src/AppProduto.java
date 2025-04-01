public class AppProduto {
    public static void main(String[] args) {
        Produto nescauCereal = new Produto("Nescau Cereal", 18.50, 100);

        nescauCereal.alterarPreco(20.50);
        nescauCereal.alterarQuantidade(85);

        nescauCereal.exibirInformacoes();
    }
}
