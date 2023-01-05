package com.central.stores.employees.model.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private long offset;
	private int pageSize;
	private int pageNumber;
	private int totalPages;
	private long totalElements;
	private Boolean moreElements;
}
