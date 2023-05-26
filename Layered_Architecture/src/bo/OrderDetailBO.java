package bo;

import model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailBO {

    public boolean addOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;

}
