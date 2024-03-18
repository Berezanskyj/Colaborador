package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author cralves
 */
public class ProdutoDAO {

    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "INSERT INTO produto VALUES (null, ?, ?, ? )";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pVO.getNome());
            pstm.setDouble(2, pVO.getValorCusto());
            pstm.setInt(3, pVO.getQuantidade());

            pstm.execute();
            pstm.close();

        } catch (SQLException se) {
            throw new SQLException("Erro no Cadastro!");
        } finally {
            con.close();
        }//fim do try catch finally

    }//fim do método cadastrarProduto

    public ArrayList<ProdutoVO> buscarProduto() throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "Select * from produto";
            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            ArrayList<ProdutoVO> pro = new ArrayList<>();

            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO();

                pVO.setIdProduto(rs.getLong("idproduto"));
                pVO.setNome(rs.getString("nome"));
                pVO.setValorCusto(rs.getDouble("valorCusto"));
                pVO.setQuantidade(rs.getInt("quantidade"));

                pro.add(pVO);
            }//fim do while
            pstm.close();

            return pro;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar Produto! " + se.getMessage());
        } finally {
            con.close();
        }
    }//fim do método buscarProduto

    public ArrayList<ProdutoVO> filtrarProduto(String query) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "select * from produto " + query;
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            ArrayList<ProdutoVO> pro = new ArrayList<>();

            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO();

                pVO.setIdProduto(rs.getLong("idproduto"));
                pVO.setNome(rs.getString("nome"));
                pVO.setValorCusto(rs.getDouble("valorcusto"));
                pVO.setQuantidade(rs.getInt("quantidade"));

                pro.add(pVO);
            }//fim do while

            pstm.close();

            return pro;

        } catch (SQLException se) {
            throw new SQLException("Erro ao filtrar produto! " + se.getMessage());
        } finally {
            con.close();
        }//fim da finally        
    }//fim do método filtrarProduto

    public void deletarProduto(long idproduto) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql = "delete from produto where idproduto = ?";
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setLong(1, idproduto);
            pstm.execute();
            pstm.close();
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar produto! ProdutoDAO " + se.getMessage());
        } finally {
            con.close();
        }//fim da finally
    }//fecha o método detelarProduto

    public void alterarProduto(ProdutoVO pVO) throws SQLException {
        Connection con = new ConexaoBanco().getConexao();

        try {
            String sql;
            sql = "Update produto set "
                    + "nome = ' " + pVO.getNome() + " ', "
                    + "valorcusto = " + pVO.getValorCusto() + ", "
                    + "quantidade = " + pVO.getQuantidade() + " "
                    + " where idproduto = " + pVO.getIdProduto() + " ";

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();

        } catch (SQLException se) {
            throw new SQLException("Erro ao Alterar Produto! " + se.getMessage());
        } finally {
            con.close();
        }//fim do Try catch finally
    }//fecha o método alterarProduto

}//fecha a classe ProdutoDAO
