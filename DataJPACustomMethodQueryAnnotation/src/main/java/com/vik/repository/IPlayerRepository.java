package com.vik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vik.entity.Player;

public interface IPlayerRepository extends JpaRepository<Player, Integer> {

	@Query("FROM Player")
	public List<Player> getAllPlayers();
}
