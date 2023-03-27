public class Produto {
    public int codigoProduto; // cadastro interno do produto
    public String nomeProduto; // nome do produto
    public String descricao; // descrição do produto e marca
    public double preco; // preço atual do produto

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(3.0);
        produto.setCodigoProduto(4235);
        produto.setNomeProduto("Sabonete Fox");
        produto.setDescricao("Sabonete Fox para o rosto");
        System.out.println(produto.codigoProduto);
        System.out.println(produto.getNomeProduto());
        System.out.println(produto.getDescricao());
        System.out.println(produto.getPreco());
    }
}