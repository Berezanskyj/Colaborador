
package servicos;

/**
 *
 * @author cralves
 */
public class ServicosFactory {
    private static ProdutoServicos produtoServicos = new ProdutoServicos();
    private static ColaboradorServicos colaboradorServicos = new ColaboradorServicos();
    private static ClientesServicos clientesServicos = new ClientesServicos();
    
    public static ProdutoServicos getProdutoServicos(){
        return produtoServicos;
    }//fim do método getProdutoServicos
    
    public static ColaboradorServicos getColaboradorServicos(){
        return colaboradorServicos;
    }
    
    public static ClientesServicos getClientesServicos(){
        return clientesServicos;
    }
    
    
    
}//fecha a classe ServicosFactory
