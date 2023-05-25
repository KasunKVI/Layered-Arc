package dao;

import db.DBConnection;
import model.CustomerDTO;
import view.tdm.CustomerTM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface CustomerDAO {

    public List<CustomerTM> loadCustomers() throws SQLException, ClassNotFoundException;

    public void addNewCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException ;

    public  void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public String generateNewId() throws SQLException, ClassNotFoundException;

    public CustomerDTO getCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
