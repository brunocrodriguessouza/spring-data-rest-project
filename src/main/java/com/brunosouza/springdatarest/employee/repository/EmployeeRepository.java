package com.brunosouza.springdatarest.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.brunosouza.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
