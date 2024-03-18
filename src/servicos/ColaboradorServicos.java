/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.ColaboradorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ColaboradorVO;

/**
 *
 * @author berez
 */
public class ColaboradorServicos {
    
    public void cadastrarColaborador (ColaboradorVO cVO) throws SQLException {
        ColaboradorDAO cDAO = DAOFactory.getColaboradorDAO();
        cDAO.cadastrarColaborador(cVO);
    }// cadastrar colaborador
    
    public ArrayList<ColaboradorVO> buscarColaborador() throws SQLException{
        ColaboradorDAO cDAO = DAOFactory.getColaboradorDAO();
        return cDAO.buscarColaborador();
    }// buscar colaborador
    
    public ArrayList<ColaboradorVO> filtrarColaborador(String query) throws SQLException{
        ColaboradorDAO cDAO = DAOFactory.getColaboradorDAO();
        return cDAO.filtrarColaborador(query);
    }// filtrar colaborador
    
    public void deletarColaborador( long idColaborador) throws SQLException{
        ColaboradorDAO cDAO = DAOFactory.getColaboradorDAO();
        cDAO.deletarColaborador(idColaborador);
    }// deletar colaborador
    
    public void alterarColaborador(ColaboradorVO cVO) throws SQLException{
        ColaboradorDAO cDAO = DAOFactory.getColaboradorDAO();
        cDAO.alterarColaborador(cVO);
    }// alterar colaborador
}
