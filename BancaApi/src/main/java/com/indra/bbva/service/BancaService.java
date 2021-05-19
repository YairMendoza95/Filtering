package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.models.Banca;

public interface BancaService {
	List<Banca> getAllBanca();

	Banca findBancaById(Banca banca);

	Banca findBancaByDivision(Banca banca);

	void insertBanca(Banca banca);

	void updateBanca(Banca banca);

	void deleteBanca(Banca banca);

}
