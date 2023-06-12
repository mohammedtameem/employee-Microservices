package com.dell.repository;

import com.dell.dto.UserAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<UserAssignment,Integer> {


}
