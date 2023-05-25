package dao;

import db.DBConnection;
import model.CustomerDTO;
import view.tdm.CustomerTM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CrudDAO<CustomerDTO,String>{

    @Override
    public List<CustomerDTO> load() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        List<CustomerDTO> lst = new ArrayList<>();

        while (rst.next()) {

            lst.add(new CustomerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3)
            ));

        }
        return lst;
    }

    @Override
    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",dto.getId(),dto.getName(),dto.getAddress());

    }

    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {

       return SQLUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());

    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {

        ResultSet resultSet = SQLUtil.execute("SELECT id FROM Customer WHERE id=?",s);
        return resultSet.next();

    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("DELETE FROM Customer WHERE id=?",s);

    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {


        ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }

    }

    @Override
    public CustomerDTO search(String newValue) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",newValue+"");
        rst.next();
        return new CustomerDTO(newValue + "", rst.getString("name"), rst.getString("address"));

    }

}
