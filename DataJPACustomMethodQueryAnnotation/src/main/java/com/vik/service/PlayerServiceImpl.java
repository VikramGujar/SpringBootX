package com.vik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.Player;
import com.vik.repository.IPlayerRepository;

@Service
public class PlayerServiceImpl implements IPlayerDBService {

	@Autowired
	IPlayerRepository ply;

	@Override
	public void insertAllPlayers(Iterable<Player> playes) {
		
		Iterable<Player> plys = ply.saveAll(playes);
		System.out.println("Records saved to DB are :: ");
		plys.forEach(System.out::println);

	}

	@Override
	public List<Player> getAllPlayers() {
		return ply.getAllPlayers();
	}
	
	
}
