public class ProdutoCarrinho {

    private Produto produto;
    private int qtdProduto;

    public ProdutoCarrinho(Produto produto, int qtdProduto)
    {
        this.produto = produto;
        this.qtdProduto = qtdProduto;
    }

    public Produto getProduto()
    {
        return this.produto;
    }

    public int getQtdProduto()
    {
        return this.qtdProduto;
    }

    public double getPrecoTotal()
    {
        Produto p = this.getProduto();
        double preco = p.getPreco();

        return (preco * this.qtdProduto);
    }
}
