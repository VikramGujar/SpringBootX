package com.vik.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Players {


	@Id
	@SequenceGenerator(name = "gen", sequenceName = "CRICK_PLAYERS_SEQ", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "gen", strategy = GenerationType.SEQUENCE)
	private Integer Id;
	
	@NonNull
	@Column(length = 20)
	private String name;
	
	@NonNull
	@Column(length = 20)
	private String contry;
	
	@NonNull
	@Column(length = 20)
	private String iplTeam;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime insertDate;
	
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime updateDate;
	
	@Version
	private Integer updateCount;

	@Override
	public String toString() {
		return "Players [Id=" + Id + ", name=" + name + ", contry=" + contry + ", iplTeam=" + iplTeam + "]";
	}
	
	
	
}
