public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {

        Produto feijao = new Produto("Feijão Preto", 6.90, 30);

        feijao.exibirInformacoes();
    }
}