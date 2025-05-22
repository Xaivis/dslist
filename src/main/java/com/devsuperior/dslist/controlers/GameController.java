package com.devsuperior.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

// porta de entrada para a API
@RestController
@RequestMapping(value = "/games") // indica qual caminho irei acessar na minha API
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		return gameService.findById(id);
		
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		return gameService.findAll();
		
	}
	
	
	
}
