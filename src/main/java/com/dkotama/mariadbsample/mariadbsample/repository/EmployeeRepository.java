package com.dkotama.mariadbsample.mariadbsample.repository;

import com.dkotama.mariadbsample.mariadbsample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByFirstName(String name);
    Employee findByLastName(String name);
}
