package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modal.bean.Material;

public class MaterialDao {
    
     public void create(Material m){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO materiais(descricao, preco, tipo) VALUES (?, ?, ?)");
            stmt.setString(1, m.getDescricao());
            stmt.setFloat(2, m.getPreco());
            stmt.setString(3, m.getTipo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Material> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Material> materiais = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM materiais");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Material material = new Material();
                
                material.setId(rs.getInt("id"));
                material.setDescricao(rs.getString("descricao"));
                material.setPreco(rs.getFloat("preco"));
                material.setTipo(rs.getString("tipo"));
                materiais.add(material);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return materiais;
        
    }
    
    
    public void update(Material m){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE materiais SET descricao=?, preco=?, tipo=? WHERE id=?");
            stmt.setString(1, m.getDescricao());
            stmt.setFloat(2, m.getPreco());
            stmt.setString(3, m.getTipo());
            stmt.setInt(4, m.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!"+ex);
        } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Material m){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM materiais WHERE id=?");
            stmt.setInt(1, m.getId());
            
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!"+ex);
        } finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
