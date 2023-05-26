package bo.custom;

import model.ItemDTO;

import java.sql.SQLException;
import java.util.List;

public interface ItemBO {

    public List<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;

    public boolean addItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean existItem(String id) throws SQLException, ClassNotFoundException ;

    public  boolean deleteItem(String id) throws SQLException, ClassNotFoundException ;

    public String generateNewItemId() throws SQLException, ClassNotFoundException;

}
