
package dao;

/**
 *
 * @author cralves
 */
public class DAOFactory {
    //Instanciando o objeto a classe ProdutoDAO
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    private static ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
    private static ClientesDAO clientesDAO = new ClientesDAO();
    private static LoginDAO loginDAO = new LoginDAO();
    //Fazendo uma cópia dos métodos da classe ProdutoDAO e 
    //disponibilizar para a classe que solicitar
    public static ProdutoDAO getProdutoDAO(){
        return produtoDAO;
    }//fim do método getProdutoDAO
    
    public static ColaboradorDAO getColaboradorDAO(){
        return colaboradorDAO;
    }
    
    public static ClientesDAO getClientesDAO(){
        return clientesDAO;
    }
    
    public static LoginDAO getLoginDAO(){
        return loginDAO;
    }
}//fecha a classe DAOFactory
