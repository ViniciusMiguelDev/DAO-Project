package models.dao;

import java.util.List;

import models.entities.Department;
import models.entities.Seller;

public interface Seller_Dao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}
