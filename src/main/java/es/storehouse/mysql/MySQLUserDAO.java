package es.storehouse.mysql;

import es.storehouse.dao.UserDAO;
import es.storehouse.models.Connect;
import es.storehouse.models.Product;
import es.storehouse.models.StoreException;
import es.storehouse.models.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLUserDAO implements UserDAO {

    Connect Conn = new Connect();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    String LOGIN = "SELECT user,password "
            + "FROM user "
            + "WHERE user = ? AND password = SHA1(?)";

    @Override
    public void insert(User a) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User a) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User a) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object[]> obtainAll() {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product obtain(Long id) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(String user, String password) throws StoreException {
        boolean success = false;
        try {

            Conn.getConnection();

            ps = Conn.conn.prepareStatement(LOGIN);

            ps.setString(1, user);
            ps.setString(2, password);

            rs = ps.executeQuery();

            success = rs.next();

        } catch (SQLException ex) {

            throw new StoreException("SQL Error: " + ex);

        } finally {

            try {

                if (ps != null) {
                    ps.close();

                }

            } catch (SQLException ex) {

                throw new StoreException("SQL Error: " + ex);
            }

        }
        return success;
    }

}
