import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<ProdutoCarrinho> produtos;
    private int numProdutos;

    public CarrinhoDeCompras(int numProdutos)
    { 
        this.numProdutos = numProdutos;
        this.produtos = new ArrayList<ProdutoCarrinho>();
    }

    public void adicionar(String nome, double preco, int qtd)
    {
        Produto p = new Produto(nome, preco);
        ProdutoCarrinho pc = new ProdutoCarrinho(p, qtd);

        this.produtos.add(pc);
    }

    public void imprimeConteudo()
    {
        List<ProdutoCarrinho> produtos = this.produtos;
        Locale localeUS = new Locale("en", "US");

        double valorTotal = 0.0;

        System.out.println("No carrinho:");
        for (ProdutoCarrinho pc : produtos)
        {
            System.out.printf("* ");

            Produto p = pc.getProduto();

            System.out.printf("%dx ", pc.getQtdProduto());
            System.out.printf("%s = ", p.getNome());
            System.out.printf(localeUS, "R$ %.2f\n", pc.getPrecoTotal());
            valorTotal += pc.getPrecoTotal();
        }

        System.out.printf(localeUS, "Total: R$ %.2f\n", valorTotal);
    }
}
