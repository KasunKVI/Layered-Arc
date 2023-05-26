package bo;

import dao.custom.impl.OrderDAOImpl;
import model.OrderDTO;

import java.sql.SQLException;

public class OrderBOImpl implements OrderBO{

    OrderDAOImpl orderDAO = new OrderDAOImpl();

    @Override
    public boolean addOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {

        return orderDAO.add(dto);

    }

    @Override
    public boolean existOrder(String id) throws SQLException, ClassNotFoundException {

        return orderDAO.exist(id);

    }

    @Override
    public String generateNewOrderId() throws SQLException, ClassNotFoundException {

        return orderDAO.generateNewId();

    }
}
