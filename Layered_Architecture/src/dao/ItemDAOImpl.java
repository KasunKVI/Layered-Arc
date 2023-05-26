package dao;

import db.DBConnection;
import model.ItemDTO;
import view.tdm.ItemTM;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {

    @Override
    public List<ItemDTO> load() throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Item");

        List<ItemDTO> lst = new ArrayList<>();

        while (rst.next()){

            lst.add(new ItemDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getBigDecimal(3),
                    rst.getInt(4)
            ));
        }
        return lst;
    }

    @Override
    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)",dto.getCode(),dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand());

    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand(),dto.getCode());

    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {

        ResultSet ret = SQLUtil.execute("SELECT code FROM Item WHERE code=?",s);

        return ret.next();

    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("DELETE FROM Item WHERE code=?",s);

    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");

        if (rst.next()) {
            String id = rst.getString("code");
            int newItemId = Integer.parseInt(id.replace("I00-", "")) + 1;
            return String.format("I00-%03d", newItemId);
        } else {
            return "I00-001";
        }

    }

    @Override
    public ItemDTO search(String newValue) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Item WHERE code=?",newValue+"");
        rst.next();
        return new ItemDTO(newValue + "", rst.getString("description"), rst.getBigDecimal("unitPrice"), rst.getInt("qtyOnHand"));

    }

}
