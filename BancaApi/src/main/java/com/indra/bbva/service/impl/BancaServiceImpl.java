package com.indra.bbva.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.models.Banca;
import com.indra.bbva.repository.BancaRepository;
import com.indra.bbva.service.BancaService;

@Service
public class BancaServiceImpl implements BancaService {
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(BancaServiceImpl.class);
	@Autowired
	BancaRepository bancaRepository;

	@Override
	public List<Banca> getAllBanca() {
		try {
			return (List<Banca>) bancaRepository.findAll();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public Banca findBancaById(Banca banca) {
		try {
			return bancaRepository.findById(banca.getIdBanca()).get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public Banca findBancaByDivision(Banca banca) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBanca(Banca banca) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBanca(Banca banca) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBanca(Banca banca) {
		// TODO Auto-generated method stub

	}
}
