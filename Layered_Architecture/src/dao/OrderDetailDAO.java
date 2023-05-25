package dao;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface OrderDetailDAO {

    public boolean addOrderDetails(String orderId, String itemCode, BigDecimal unitPrice, int qty) throws SQLException, ClassNotFoundException;

}
