package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestsuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    public void getEmployeesByPartOfTheName() {
        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("ASas", "asdas");


        Company company1 = new Company("aaa");
        Company company2 = new Company("aaaaa");

        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee1);

        employee1.getCompanies().add(company2);
        employee2.getCompanies().add(company1);


        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();

        List<Employee> employees = facade.getEmployees("Smi");
        System.out.println(employees);
        assertEquals(1, employees.size());

        //CleanUp
        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    @Test
    public void fetchCompaniesByPartOfTheName() {
        //Given
        Employee employee1 = new Employee("aaa", "sss");
        Employee employee2 = new Employee("aaa", "sss");


        Company company1 = new Company("comp1");
        Company company2 = new Company("dfsdfsdv");

        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee1);

        employee1.getCompanies().add(company2);
        employee2.getCompanies().add(company1);


        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();

        List<Company> companies = facade.getCompanies("omp");

        assertEquals(1, companies.size());

        //CleanUp
        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
