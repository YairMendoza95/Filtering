package com.indra.bbva.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.indra.bbva.models.Banca;

public interface BancaRepository extends CrudRepository<Banca, Integer> {
	Optional<Banca> findByDivision(String division);

	@Query("from Banca b where b.division like :division")
	List<Banca> getByDivision(@Param("division") String division);
}
