package es.storehouse.mysql;

import es.storehouse.dao.SaleDAO;
import es.storehouse.models.Connect;
import es.storehouse.models.Product;
import es.storehouse.models.Provider;
import es.storehouse.models.Sale;
import es.storehouse.models.StoreException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLSaleDAO implements SaleDAO {

    Connect Conn = new Connect();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    StringBuilder generatePurchase = new StringBuilder()
            .append("INSERT INTO sale(product_id,amount,price,date) ")
            .append("VALUES (?,?,?,?)");

    @Override
    public void insert(Sale a) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Sale a) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Sale a) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object[]> obtainAll() {
        return null;
    }

    @Override
    public Product obtain(Long id) {
        return null;
    }

    @Override
    public boolean login(String user, String password) throws StoreException {
        return false;
    }

    public void generateSale(Sale s) throws StoreException {
        try {

            Conn.getConnection();
            ps = Conn.conn.prepareStatement(generatePurchase.toString());
            ps.setInt(1, s.getProductId());
            ps.setInt(2, s.getAmount());
            ps.setDouble(3, s.getPrice());
            ps.setDate(4, s.getDate());

            if (ps.executeUpdate() > 0) {
                StringBuilder updateStock = new StringBuilder()
                        .append("UPDATE product ")
                        .append("SET amount = product.amount - ? ")
                        .append("WHERE product_id = ?");
                ps = Conn.conn.prepareStatement(updateStock.toString());
                ps.setInt(1, s.getAmount());
                ps.setInt(2, s.getProductId());
                ps.executeUpdate();
            }

        } catch (SQLException ex) {

            throw new StoreException("SQL Error: " + ex);

        } finally {

            if (ps != null) {
                try {

                    ps.close();

                } catch (SQLException e) {

                }
            }
        }
    }

}
