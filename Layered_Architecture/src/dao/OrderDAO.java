package dao;

import db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {


    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException ;

    public boolean makeOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;

    public String generateNewOrderId() throws SQLException, ClassNotFoundException ;

}
