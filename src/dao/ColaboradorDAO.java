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
            String sql = "INSERT INTO colaborador VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, cVO.getClt());
            pstm.setString(2, cVO.getPonto());
            pstm.setString(3, cVO.getAtivo());
            pstm.setString(4, cVO.getTipoMoradia());
            pstm.setString(5, cVO.getPrimeiroNome());
            pstm.setString(6, cVO.getSobrenome());
            pstm.setString(7, cVO.getCpf());
            pstm.setString(8, cVO.getSalario());
            pstm.setString(9, cVO.getCep());
            pstm.setString(10, cVO.getBairro());
            pstm.setString(11, cVO.getRua());
            pstm.setString(12, cVO.getNumeroRua());
            
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
                cVO.setClt(rs.getString("clt"));
                cVO.setPonto(rs.getString("ponto"));
                cVO.setAtivo(rs.getString("ativo"));
                cVO.setTipoMoradia(rs.getString("tipoMoradia"));
                cVO.setPrimeiroNome(rs.getString("primeiroNome"));
                cVO.setSobrenome(rs.getString("sobrenome"));
                cVO.setCpf(rs.getString("cpf"));
                cVO.setSalario(rs.getString("salario"));
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
                cVO.setClt(rs.getString("clt"));
                cVO.setPonto(rs.getString("ponto"));
                cVO.setAtivo(rs.getString("ativo"));
                cVO.setTipoMoradia(rs.getString("tipoMoradia"));
                cVO.setPrimeiroNome(rs.getString("primeiroNome"));
                cVO.setSobrenome(rs.getString("sobrenome"));
                cVO.setCpf(rs.getString("cpf"));
                cVO.setSalario(rs.getString("salario"));
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
                    + "clt = ' " + cVO.getClt() + "' , "
                    + "ponto = ' " + cVO.getPonto() + "' , "
                    + "ativo = ' " + cVO.getAtivo() + "' , "
                    + "tipoMoradia = ' " + cVO.getTipoMoradia() + "' , "
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
