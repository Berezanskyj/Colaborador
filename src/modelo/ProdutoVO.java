
package modelo;

/**
 *
 * @author cralves
 */
public class ProdutoVO {
    //Atributos
    private long idProduto;
    private String nome;
    private double valorCusto;
    private int quantidade;
    
    //Métodos Acessores

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}//fecha a classe ProdutoVO
