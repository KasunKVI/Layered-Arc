package dao;

import model.CustomerDTO;
import view.tdm.CustomerTM;

import java.sql.SQLException;
import java.util.List;

public interface CrudDAO<T,ID> {

    public List<T> load() throws SQLException, ClassNotFoundException;

    public boolean add(T dto) throws SQLException, ClassNotFoundException;

    public boolean update(T dto) throws SQLException, ClassNotFoundException;

    public boolean exist(ID id) throws SQLException, ClassNotFoundException ;

    public  boolean delete(ID id) throws SQLException, ClassNotFoundException ;

    public String generateNewId() throws SQLException, ClassNotFoundException;

    public T search(ID newValue) throws SQLException, ClassNotFoundException;

}
