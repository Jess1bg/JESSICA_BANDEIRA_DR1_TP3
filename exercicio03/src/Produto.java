public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}