package  com.scripts.controller.scripts.service;

import java.util.List;

import java.util.Optional;

import com.scripts.controller.scripts.model.cokies;



public interface cokiesServiceInterface {
	Optional<cokies> findById(Long id);
	cokies findByOrderLimit1();
	String deleteById(Long id);
	cokies findByName(String cokiesName);
	String insert(cokies cokies);
	List<String> insertAll(List<cokies> cokiesList);
	List<cokies> findAll();
	void truncateTable();
}
