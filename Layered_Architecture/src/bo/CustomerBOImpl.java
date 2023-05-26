package bo;

import dao.custom.CustomerDAO;
import dao.custom.impl.CustomerDAOImpl;
import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerBOImpl implements CustomerBO{

    CustomerDAOImpl customerDAO = new CustomerDAOImpl();

    @Override
    public List<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException {

        return customerDAO.load();
    }

    @Override
    public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return customerDAO.add(dto);
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return customerDAO.update(dto);

    }

    @Override
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {

        return customerDAO.exist(id);

    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {

        return customerDAO.delete(id);

    }

    @Override
    public String generateNewCustomerId() throws SQLException, ClassNotFoundException {

        return customerDAO.generateNewId();

    }

    @Override
    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException {

        return customerDAO.search(newValue);

    }
}
