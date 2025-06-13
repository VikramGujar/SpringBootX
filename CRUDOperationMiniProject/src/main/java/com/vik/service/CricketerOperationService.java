package com.vik.service;

import java.util.List;

import com.vik.entity.Players;

public interface CricketerOperationService {

	public List<Players> allPlayers();
	public String addPlayer(Players pl);
	public Players getPlayerById(int id);
}
