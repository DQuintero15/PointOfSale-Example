package es.storehouse.mysql;

import es.storehouse.dao.ProviderDAO;
import es.storehouse.models.Connect;
import es.storehouse.models.Product;
import es.storehouse.models.Provider;
import es.storehouse.models.StoreException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MySQLProviderDAO implements ProviderDAO {

    Connect Conn = new Connect();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    String getProvider = "SELECT name from provider";
    String UPDATE = "UPDATE provider SET name = ? WHERE provider_id = ?";
    String INSERT = "INSERT INTO provider(name) VALUES (?)";
    String DELETE = "DELETE FROM provider WHERE provider_id = ?";
    String getAll = "SELECT * FROM provider";
    ResultSetMetaData meta;

    @Override
    public void insert(Provider a) throws StoreException {
        Conn.getConnection();

        try {

            ps = Conn.conn.prepareStatement(INSERT);
            ps.setString(1, a.getName());

            int check = ps.executeUpdate();

            if (check > 0) {
                throw new StoreException("Proveedor Insertado Correctamente");
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

    @Override
    public void delete(Provider a) throws StoreException {
        Conn.getConnection();

        try {

            ps = Conn.conn.prepareStatement(DELETE);
            ps.setInt(1, a.getProviderId());

            int check = ps.executeUpdate();

            if (check > 0) {
                throw new StoreException("Proveedor Elimiado Correctamente");
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

    @Override
    public void update(Provider a) throws StoreException {
        try {

            Conn.getConnection();

            ps = Conn.conn.prepareStatement(UPDATE);
            ps.setString(1, a.getName());
            ps.setInt(2, a.getProviderId());

            int check = ps.executeUpdate();

            if (check > 0) {
                throw new StoreException("Datos del Proveedor Actualizados Correctamente");
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

    @Override
    public ArrayList<Object[]> obtainAll() throws StoreException {

        ArrayList<Object[]> data = new ArrayList<>();

        Conn.getConnection();

        try {

            ps = Conn.conn.prepareStatement(getAll);

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

    public ArrayList<String> getList() throws StoreException {

        ArrayList<String> list = new ArrayList<>();

        try {
            Conn.getConnection();

            ps = Conn.conn.prepareStatement(getProvider);

            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }

        } catch (SQLException ex) {
            throw new StoreException("Error SQL: " + ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new StoreException("Error SQL: " + e);
                }
            }
        }

        return list;
    }

    @Override
    public Product obtain(Long id) {
        return null;
    }

    @Override
    public boolean login(String user, String password) throws StoreException {
        return false;
    }

}
