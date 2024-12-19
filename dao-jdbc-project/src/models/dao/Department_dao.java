package models.dao;

import java.util.List;

import models.entities.Department;

public interface Department_dao {
    void insert(Department obj);

    void update(Department obj);

    void deleteById(Department obj);

    Department findById(Integer id);

    List<Department> findByAll();
}
