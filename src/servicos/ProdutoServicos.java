
package servicos;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProdutoVO;

/**
 *
 * @author cralves
 */
public class ProdutoServicos {
    
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);
    }//fim do métoso cadastrarProduto
    
    public ArrayList<ProdutoVO> buscarProduto() throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.buscarProduto();
    }//fim do método buscarProduto
    
    public ArrayList<ProdutoVO> filtrarProduto(String query) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.filtrarProduto(query);
    }//fim do método filtrarProduto
    
    public void deletarProduto( long idproduto) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.deletarProduto(idproduto);
    }//fim do método deletarProduto
    
    public void alterarProduto(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.alterarProduto(pVO);
    }//fim do método alterarProduto
    
    
    
    
    
}//fecha a classe ProdutoServicos
