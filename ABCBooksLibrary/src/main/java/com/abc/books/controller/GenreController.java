package com.abc.books.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.books.domain.Genre;
import com.abc.books.repository.GenreRepository;



@RestController
@RequestMapping("/api")
public class GenreController {
	@Autowired
  private GenreRepository repo;
	 @GetMapping(value = "/Employees", produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<Genre> getAllEmployees() {
		 List<Genre> gen = repo.findAll();
		 System.out.println("Data is"+gen.get(0).getGenreType());
		 
		 return gen;
	 }

}
