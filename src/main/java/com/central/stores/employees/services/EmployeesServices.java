package com.central.stores.employees.services;

import java.util.List;
import java.util.UUID;

import com.central.stores.employees.model.Employee;
import com.central.stores.employees.model.dto.ListEmployees;
import com.central.stores.employees.model.dto.RequestEmployeeDTO;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmployeesServices {
	public ListEmployees findAll(Pageable pageable);
	public Employee findByCpf(String employeeCpf);
	public List<Employee> findByNeighborhood(String neighborhood);
	public ResponseEntity<Object> create(RequestEmployeeDTO requestEmployeeDTO);
	public ResponseEntity<Object> update(RequestEmployeeDTO requestEmployeeDTO, UUID employeeId);
	public Employee delete(UUID employeeId);
}
