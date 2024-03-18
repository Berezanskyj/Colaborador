/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ColaboradorVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author berez
 */
public class ColaboradorDAO {
    
    public void cadastrarColaborador(ColaboradorVO cVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "INSERT INTO colaborador VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setBoolean(1, cVO.isClt());
            pstm.setBoolean(2, cVO.isPonto());
            pstm.setBoolean(3, cVO.isAtivo());
            pstm.setBoolean(4, cVO.isCasa());
            pstm.setBoolean(5, cVO.isApartamento());
            pstm.setString(6, cVO.getPrimeiroNome());
            pstm.setString(7, cVO.getSobrenome());
            pstm.setString(8, cVO.getCpf());
            pstm.setDouble(9, cVO.getSalario());
            pstm.setString(10, cVO.getCep());
            pstm.setString(11, cVO.getBairro());
            pstm.setString(12, cVO.getRua());
            pstm.setString(13, cVO.getNumeroRua());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (SQLException se){
            throw new SQLException("Erro no cadastro do colaborador!");
            
        } finally {
            con.close();
        }
        
        
    } // end of cadastrar
    
    public ArrayList<ColaboradorVO> buscarColaborador() throws SQLException {
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "Select * from colaborador";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            ArrayList<ColaboradorVO> procura = new ArrayList<>();
            
            while (rs.next()){
                ColaboradorVO cVO = new ColaboradorVO();
                
                cVO.setIdColaborador(rs.getLong("idcolaborador"));
                cVO.setClt(rs.getBoolean("clt"));
                cVO.setPonto(rs.getBoolean("ponto"));
                cVO.setAtivo(rs.getBoolean("ativo"));
                cVO.setCasa(rs.getBoolean("casa"));
                cVO.setApartamento(rs.getBoolean("apartamento"));
                cVO.setPrimeiroNome(rs.getString("primeiroNome"));
                cVO.setSobrenome(rs.getString("sobrenome"));
                cVO.setCpf(rs.getString("cpf"));
                cVO.setSalario(rs.getDouble("salario"));
                cVO.setCep(rs.getString("cep"));
                cVO.setBairro(rs.getString("Bairro"));
                cVO.setRua(rs.getString("rua"));
                cVO.setNumeroRua(rs.getString("numeroRua"));
                
                procura.add(cVO);
            }// fim while
            pstm.close();
            
            return procura;
            
        } catch (SQLException se){
            throw new SQLException("Erro ao buscar Produto! " + se.getMessage());
        } finally {
            con.close();
        }
    } // end of buscarColaborador
    
    public ArrayList<ColaboradorVO> filtrarColaborador(String query) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql = "Select * from colaborador " + query;
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<ColaboradorVO> colab = new ArrayList<>();
            
            while (rs.next()){
                ColaboradorVO cVO = new ColaboradorVO();
                
                cVO.setIdColaborador(rs.getLong("idcolaborador"));
                cVO.setClt(rs.getBoolean("clt"));
                cVO.setPonto(rs.getBoolean("ponto"));
                cVO.setAtivo(rs.getBoolean("ativo"));
                cVO.setCasa(rs.getBoolean("casa"));
                cVO.setApartamento(rs.getBoolean("apartamento"));
                cVO.setPrimeiroNome(rs.getString("primeiroNome"));
                cVO.setSobrenome(rs.getString("sobrenome"));
                cVO.setCpf(rs.getString("cpf"));
                cVO.setSalario(rs.getDouble("salario"));
                cVO.setCep(rs.getString("cep"));
                cVO.setBairro(rs.getString("Bairro"));
                cVO.setRua(rs.getString("rua"));
                cVO.setNumeroRua(rs.getString("numeroRua"));
                
                colab.add(cVO);
            }
            
            pstm.close();
            
            return colab;
        } catch (SQLException se){
            throw new SQLException("Erro ao filtrar colaborador! " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void deletarColaborador(long idcolaborador) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try{
            String sql = "delete from colaborador where idcolaborador = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            
            pstm.setLong(1, idcolaborador);
            pstm.execute();
            pstm.close();
        } catch (SQLException se){
            throw new SQLException("Erro ao deletar colaborador! ColaboradorDAO " + se.getMessage());
        } finally{
            con.close();
        }
    }
    
    public void alterarColaborador(ColaboradorVO cVO) throws SQLException{
        Connection con = new ConexaoBanco().getConexao();
        
        try {
            String sql;
            sql = "Update colaborador " 
                    + " set "
                    + "idcolaborador = ' " + cVO.getIdColaborador() + " ', "
                    + "clt =  " + cVO.isClt() + " , "
                    + "ponto =  " + cVO.isPonto() + " , "
                    + "ativo =  " + cVO.isAtivo() + " , "
                    + "casa =  " + cVO.isCasa() + " , "
                    + "apartamento =  " + cVO.isApartamento() + " , "   
                    + "primeiroNome = ' " + cVO.getPrimeiroNome() + " ', "
                    + "sobrenome = ' " + cVO.getSobrenome() + " ', "
                    + "cpf = ' " + cVO.getCpf() + " ', "
                    + "salario = ' " + cVO.getSalario() + " ', "
                    + "cep = ' " + cVO.getCep() + " ', "
                    + "Bairro = ' " + cVO.getBairro() + " ', "
                    + "rua = ' " + cVO.getRua() + " ', "
                    + "numeroRua = ' " + cVO.getNumeroRua() + " ' "
                    + "where idcolaborador = " + cVO.getIdColaborador() + " ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch(SQLException se){
            throw new SQLException("Erro ao alterar colaborador!" + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    
}
