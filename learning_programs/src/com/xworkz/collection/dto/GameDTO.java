package com.xworkz.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class GameDTO implements Serializable,Comparable<GameDTO>{

	
	private Integer id;
	private String name;
	private Integer participants;
	private Integer points;
	private LocalDate eventDate;
	private Boolean winner;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParticipants() {
		return participants;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public Boolean getWinner() {
		return winner;
	}

	public void setWinner(Boolean winner) {
		this.winner = winner;
	}

	public GameDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventDate, id, name, participants, points, winner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDTO other = (GameDTO) obj;
		return Objects.equals(eventDate, other.eventDate) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(participants, other.participants)
				&& Objects.equals(points, other.points) && Objects.equals(winner, other.winner);
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", points=" + points
				+ ", eventDate=" + eventDate + ", winner=" + winner + "]";
	}

	public GameDTO(Integer id, String name, Integer participants, Integer points, LocalDate eventDate, Boolean winner) {
		super();
		this.id = id;
		this.name = name;
		this.participants = participants;
		this.points = points;
		this.eventDate = eventDate;
		this.winner = winner;
	}

	
	@Override
	public int compareTo(GameDTO arguement) {
		return this.name.compareTo(arguement.name);
	}
	
	

	
	
}
