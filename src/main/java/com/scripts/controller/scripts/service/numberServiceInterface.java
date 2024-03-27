package com.scripts.controller.scripts.service;
import java.util.List;
import com.scripts.controller.scripts.model.Number;
import java.util.Optional;

public interface numberServiceInterface {

	Optional<Number> findById(Long id);
	Number findByOrderLimit1();
	String deleteById(Long id);
	Number findByName(String numberName);
	String insert(Number number);
	List<String> insertAll(List<Number> numbersList);
	List<Number> findAll();
	void truncateTable();
	
}
