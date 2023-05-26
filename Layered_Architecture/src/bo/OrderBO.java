package bo;

import model.OrderDTO;

import java.sql.SQLException;

public interface OrderBO {

    public boolean addOrder(OrderDTO dto) throws SQLException, ClassNotFoundException;

    public boolean existOrder(String id) throws SQLException, ClassNotFoundException ;

    public String generateNewOrderId() throws SQLException, ClassNotFoundException;

}
