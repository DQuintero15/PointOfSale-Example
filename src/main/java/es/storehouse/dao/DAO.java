package es.storehouse.dao;

import es.storehouse.models.Product;
import es.storehouse.models.StoreException;
import java.util.ArrayList;

public interface DAO<T, K> {

    void insert(T a) throws StoreException;

    void delete(T a) throws StoreException;

    void update(T a) throws StoreException;

    ArrayList<Object[]> obtainAll() throws StoreException;

    Product obtain(K id) throws StoreException;

    public boolean login(String user, String password) throws StoreException;

}
