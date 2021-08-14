package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Facade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public Facade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> getCompanies(String partOfCompanyName){
        return companyDao.getCompanyByAny3Chars(partOfCompanyName);
    }

    public List<Employee> getEmployees(String partOfLastname){
        return employeeDao.getEmployeeByAnyPartOfLastname(partOfLastname);
    }
}