package dao;

import db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public class OrderDAOImpl implements OrderDAO{

    @Override
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {

        ResultSet resultSet = SQLUtil.execute("SELECT oid FROM `Orders` WHERE oid=?",orderId);

        return resultSet.next();
    }

    @Override
    public boolean makeOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)",orderId, Date.valueOf(orderDate),customerId);


    }

    @Override
    public String generateNewOrderId() throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";

    }
}
