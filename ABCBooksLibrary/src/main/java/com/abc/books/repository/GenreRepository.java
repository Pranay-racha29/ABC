package com.abc.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.books.domain.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
