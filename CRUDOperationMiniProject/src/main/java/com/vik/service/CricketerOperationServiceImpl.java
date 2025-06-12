package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Players;
import com.vik.repository.CricketerOperationRepository;

@Service
public class CricketerOperationServiceImpl implements CricketerOperationService {

	@Autowired
	CricketerOperationRepository cric;
	
	@Override
	public List<Players> allPlayers() {
		List<Players> list = cric.findAll();
		return list;
	}

	@Override
	public String addPlayer(Players pl) {
		cric.save(pl);
		int id = pl.getId();
		return "Player Inserted with ID "+id;
	}

}
