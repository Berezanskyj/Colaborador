/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ClientesVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 832000223
 */

public class ClientesDAO {
    
    public void cadastrarClientes(ClientesVO cVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        try {
            String sql = "insert into clientes (id, nome, sobrenome, cpf, email, fone, endereco, cep, bairro, uf) values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cVO.getNome());
            pstm.setString(2, cVO.getSobrenome());
            pstm.setString(3, cVO.getCpf());
            pstm.setString(4, cVO.getEmail());
            pstm.setString(5, cVO.getFone());
            pstm.setString(6, cVO.getEndereco());
            pstm.setString(7, cVO.getCEP());
            pstm.setString(8, cVO.getBairro());
            pstm.setString(9, cVO.getUF());
            
            
            pstm.execute();
            pstm.close();                                            
                    
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro ClientesDAO " + se);
        } finally {
            con.close();
        }
    }
    
}
