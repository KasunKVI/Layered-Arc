package bo.custom.impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.ItemDAO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.List;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public List<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException {

        return itemDAO.load();

    }

    @Override
    public boolean addItem(ItemDTO dto) throws SQLException, ClassNotFoundException {

        return itemDAO.add(dto);

    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {

        return itemDAO.update(dto);

    }

    @Override
    public boolean existItem(String id) throws SQLException, ClassNotFoundException {

        return itemDAO.exist(id);

    }

    @Override
    public boolean deleteItem(String id) throws SQLException, ClassNotFoundException {

        return itemDAO.delete(id);

    }

    @Override
    public String generateNewItemId() throws SQLException, ClassNotFoundException {

        return itemDAO.generateNewId();

    }
}
