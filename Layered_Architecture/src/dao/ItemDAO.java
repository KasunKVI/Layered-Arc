package dao;

import db.DBConnection;
import model.ItemDTO;
import view.tdm.ItemTM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO {

    public List<ItemTM> loadItems() throws SQLException, ClassNotFoundException ;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public void addNewItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean exitItem(String code) throws SQLException, ClassNotFoundException ;

    public String generateNewId() throws SQLException, ClassNotFoundException ;

    public ItemDTO getItem(String newItemCode) throws SQLException, ClassNotFoundException ;
}
