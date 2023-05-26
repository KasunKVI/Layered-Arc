package bo;

import dao.custom.impl.OrderDetailDAOImpl;
import model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailBOImpl implements OrderDetailBO{

    OrderDetailDAOImpl orderDetailDAO = new OrderDetailDAOImpl();

    @Override
    public boolean addOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {

        return orderDetailDAO.add(dto);
    }
}
