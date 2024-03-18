
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.LoginVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author cralves
 */
public class LoginDAO {
   //Variável global
    Connection con;
    
    public ResultSet autenticarLogin(LoginVO lVO) throws SQLException {
        //Buscar a conexão com o banco de dados
        con = new ConexaoBanco().getConexao();
        
        //Criar um objeto que seja capas de Executar instruções SQL
        //no Banco de Dados
        try {
            //String que receberá a instrução SQL
            String sql;
            //Montando a instrução SELECT para buscar um objeto lVO no Banco mysql
            sql = "select * from login where login=? and senha=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, lVO.getLogin() );
            pstm.setString(2, lVO.getSenha() );
            
            //Executando o SQL
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "LoginDAO! " + se);
            return null;
        }
    }//fecha o método autenticarLogin
    
    
    public void cadastrar(LoginVO lVO) throws SQLException {
        con = new ConexaoBanco().getConexao();
        
        try{
            String sql;
            sql = "insert into login values (null, ?, ?, ?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, lVO.getLogin() );
            pstm.setString(2, lVO.getSenha() );
            pstm.setString(3, lVO.getSenhaNovamente() );
            
            pstm.execute();
            pstm.close();
        } catch (SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage());
        } finally {
            con.close();
        }
    }
    
    
}//fecha a classe DAO
