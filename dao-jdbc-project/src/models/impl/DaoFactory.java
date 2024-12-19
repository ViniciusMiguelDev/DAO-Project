package models.impl;

import db.DB;
import models.dao.Seller_Dao;

public class DaoFactory {
    public static Seller_Dao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
