package bo.custom;

import bo.SuperBO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.List;

public interface ItemBO extends SuperBO {

    public List<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;

    public boolean addItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean existItem(String id) throws SQLException, ClassNotFoundException ;

    public  boolean deleteItem(String id) throws SQLException, ClassNotFoundException ;

    public String generateNewItemId() throws SQLException, ClassNotFoundException;

}
