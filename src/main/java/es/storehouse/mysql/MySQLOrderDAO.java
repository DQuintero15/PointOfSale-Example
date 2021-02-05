package es.storehouse.mysql;

import es.storehouse.dao.OrderDAO;
import es.storehouse.models.Connect;
import es.storehouse.models.Order;
import es.storehouse.models.Product;
import es.storehouse.models.StoreException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLOrderDAO implements OrderDAO {

    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    Connect Conn = new Connect();
    StringBuilder generateOrder = new StringBuilder()
            .append("INSERT INTO storehosue.order (product_id,amount,price,date) ")
            .append("VALUES (?,?,?,?)");

    @Override
    public void insert(Order a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void generateOrder(Order o) throws StoreException {
        try {

            Conn.getConnection();
            ps = Conn.conn.prepareStatement(generateOrder.toString());
            ps.setInt(1, o.getProductId());
            ps.setInt(2, o.getAmount());
            ps.setDouble(3, o.getPrice());
            ps.setDate(4, o.getDate());

            if (ps.executeUpdate() > 0) {
                StringBuilder updateStock = new StringBuilder()
                        .append("UPDATE product ")
                        .append("SET amount = product.amount + ? ")
                        .append("WHERE product_id = ?");
                ps = Conn.conn.prepareStatement(updateStock.toString());
                ps.setInt(1, o.getAmount());
                ps.setInt(2, o.getProductId());
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

    @Override
    public void delete(Order a) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Order a) {
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
    public boolean login(String pass, String pass0) {
        return false;
    }

}
