package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    List<Employee> getEmployeeByName(@Param("NAME") String name);
    List<Employee> getEmployeeByAnyPartOfLastname(@Param("ARG") String name);

}
