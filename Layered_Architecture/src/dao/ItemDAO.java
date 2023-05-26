package dao;

import db.DBConnection;
import model.ItemDTO;
import view.tdm.ItemTM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO extends CrudDAO<ItemDTO,String>{

}
