package com.central.stores.employees.model.dto;

import java.io.Serializable;
import java.util.List;

import com.central.stores.employees.model.Employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListEmployees implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pagination pagination;
	private List<Employee> content;
}
