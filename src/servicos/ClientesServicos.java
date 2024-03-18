/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.ClientesDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.ClientesVO;

/**
 *
 * @author 832000223
 */
public class ClientesServicos {
    public void cadastrarCliente(ClientesVO cVO) throws SQLException{
        ClientesDAO cDAO = DAOFactory.getClientesDAO();
        cDAO.cadastrarClientes(cVO);
    }
}
