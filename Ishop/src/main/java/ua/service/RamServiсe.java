package ua.service;

import java.util.List;

import ua.entity.Ram;


public interface RamServiņe {

	void save(int ramGb);
	
	void delete(int ramGb);
	
	List<Ram> findAll();

	void deleteId(int id);
}