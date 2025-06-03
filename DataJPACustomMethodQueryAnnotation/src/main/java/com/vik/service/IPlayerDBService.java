package com.vik.service;

import java.util.List;

import com.vik.entity.Player;

public interface IPlayerDBService {

	public void insertAllPlayers(Iterable<Player> playes);
	public List<Player> getAllPlayers();
}
