/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;


import dao.DAOFactory;
import dao.LoginDAO;
import java.sql.SQLException;
import modelo.LoginVO;


/**
 *
 * @author berez
 */
public class LoginServicos {
    public void cadastrar (LoginVO lVO) throws SQLException {
        LoginDAO lDAO = DAOFactory.getLoginDAO();
        lDAO.cadastrar(lVO);
    }// cadastrar colaborador
}
