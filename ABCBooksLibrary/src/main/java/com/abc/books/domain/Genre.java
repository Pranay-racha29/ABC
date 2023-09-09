package com.abc.books.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "GENRE")
public class Genre {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer GenreId;

	  @Column
	  private String genreType;

	public Integer getGenreId() {
		return GenreId;
	}

	public void setGenreId(Integer genreId) {
		GenreId = genreId;
	}

	public String getGenreType() {
		return genreType;
	}

	public void setGenreType(String genreType) {
		this.genreType = genreType;
	}
	  
	  
}
