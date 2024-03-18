
package servicos;

/**
 *
 * @author cralves
 */
public class ServicosFactory {
    private static ProdutoServicos produtoServicos = new ProdutoServicos();
    private static ColaboradorServicos colaboradorServicos = new ColaboradorServicos();
    private static ClientesServicos clientesServicos = new ClientesServicos();
    private static LoginServicos loginServicos = new LoginServicos();
    
    public static ProdutoServicos getProdutoServicos(){
        return produtoServicos;
    }//fim do método getProdutoServicos
    
    public static ColaboradorServicos getColaboradorServicos(){
        return colaboradorServicos;
    }
    
    public static ClientesServicos getClientesServicos(){
        return clientesServicos;
    }
    
    public static LoginServicos getLoginServicos(){
        return loginServicos;
    }
    
    
    
}//fecha a classe ServicosFactory
