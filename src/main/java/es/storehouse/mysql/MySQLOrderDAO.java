package es.storehouse.mysql;

import es.storehouse.dao.OrderDAO;
import es.storehouse.models.Order;
import es.storehouse.models.Product;
import es.storehouse.models.User;
import java.util.ArrayList;
import java.util.List;

public class MySQLOrderDAO implements OrderDAO {

    @Override
    public void insert(Order a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Order a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Order a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object[]> obtainAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product obtain(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(String pass, String pass0) {
        return false;
    }


}
