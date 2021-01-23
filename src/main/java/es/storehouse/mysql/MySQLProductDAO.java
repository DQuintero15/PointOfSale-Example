package es.storehouse.mysql;

import es.storehouse.dao.ProductDAO;
import es.storehouse.models.Connect;
import es.storehouse.models.Product;
import es.storehouse.models.StoreException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MySQLProductDAO implements ProductDAO {

    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    Connect Conn = new Connect();

    ResultSetMetaData meta;
    String selectAll = "SELECT *  FROM product";
    String INSERT = "INSERT INTO product(name,amount,buy_price,sell_price,provider) VALUES (?,?,?,?,?)";
    String DELETE = "DELETE FROM product WHERE product_id = ?";
    String UPDATE = "UPDATE product SET name=?,amount=?,buy_price=?,sell_price=?,provider=? WHERE product_id  = ?";
    String selectProvider = "SELECT provider from product";
    String serchProduct = "SELECT product.product_id,product.name,product.provider,product.amount,product.sell_price FROM product WHERE product.name LIKE ?";

    /**
     *
     * @param a
     * @throws StoreException
     */
    @Override
    public void insert(Product a) throws StoreException {
        Conn.getConnection();

        try {

            ps = Conn.conn.prepareStatement(INSERT);
            ps.setString(1, a.getName());
            ps.setInt(2, a.getAmount());
            ps.setBigDecimal(3, a.getBuyPrice());
            ps.setBigDecimal(4, a.getSellPrice());
            ps.setString(5, a.getProvider());

            int check = ps.executeUpdate();

            if (check > 0) {
                throw new StoreException("Producto Insertado Correctamente");
            }

        } catch (SQLException ex) {
            throw new StoreException("Error SQL: " + ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    throw new StoreException("SQL Error: " + ex);
                }
            }
        }
    }

    /**
     *
     * @param a
     * @throws StoreException
     */
    @Override
    public void delete(Product a) throws StoreException {
        Conn.getConnection();

        try {

            ps = Conn.conn.prepareStatement(DELETE);
            ps.setInt(1, a.getProductId());

            int check = ps.executeUpdate();

            if (check > 0) {
                throw new StoreException("Producto Elimiado Correctamente");
            }

        } catch (SQLException ex) {
            throw new StoreException("Error SQL: " + ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    throw new StoreException("Error SQL: " + ex);
                }
            }
        }
    }

    /**
     *
     * @param a
     * @throws StoreException
     */
    @Override
    public void update(Product a) throws StoreException {
        try {

            Conn.getConnection();

            ps = Conn.conn.prepareStatement(UPDATE);
            ps.setString(1, a.getName());
            ps.setInt(2, a.getAmount());
            ps.setBigDecimal(3, a.getBuyPrice());
            ps.setBigDecimal(4, a.getSellPrice());
            ps.setString(5, a.getProvider());
            ps.setInt(6, a.getProductId());

            int check = ps.executeUpdate();

            if (check > 0) {
                throw new StoreException("Datos del Producto Actualizados Correctamente");
            }

        } catch (SQLException ex) {
            throw new StoreException("Erro SQL: " + ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    throw new StoreException("Error SQL: " + ex);
                }
            }
        }
    }

    /**
     * Method to obtain all database records
     *
     * @return ArrayList<Object[]>
     * @throws StoreException
     */
    @Override
    public ArrayList<Object[]> obtainAll() throws StoreException {

        ArrayList<Object[]> data = new ArrayList<>();

        // Connect to DB
        Conn.getConnection();

        try {

            ps = Conn.conn.prepareStatement(selectAll);

            rs = ps.executeQuery();
            meta = rs.getMetaData();

            while (rs.next()) {
                Object[] row = new Object[meta.getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                data.add(row);

            }

        } catch (SQLException ex) {

            throw new StoreException("SQL Error: " + ex);

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new StoreException("SQL error" + e);
                }
            }
        }

        return data;

    }

    @Override
    public Product obtain(Long id) {
        return null;
    }

    public Product searchProduct(String productName) throws StoreException {

        Product p = new Product(productName);

        try {

            Conn.getConnection();

            ps = Conn.conn.prepareStatement(serchProduct);

            ps.setString(1, "%"+productName+"%");

            rs = ps.executeQuery();

            if (rs.next()) {
                p.setProductId(rs.getInt("product_id"));
                p.setName(rs.getString("name"));
                p.setProvider(rs.getString("provider"));
                p.setAmount(rs.getInt("amount"));
                p.setSellPrice(rs.getBigDecimal("sell_price"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }

        } catch (SQLException ex) {
            throw new StoreException("Error SQL: " + ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {

                }
            }
        }

        return p;
    }

    @Override
    public boolean login(String user, String password) throws StoreException {
        return false;
    }

}
