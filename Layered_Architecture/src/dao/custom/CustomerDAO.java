package dao.custom;

import dao.CrudDAO;
import db.DBConnection;
import model.CustomerDTO;
import view.tdm.CustomerTM;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface CustomerDAO extends CrudDAO<CustomerDTO,String> {

}
