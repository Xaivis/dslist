package com.devsuperior.dslist.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.DTO.GameListDTO;
import com.devsuperior.dslist.DTO.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

// porta de entrada para a API
@RestController
@RequestMapping(value = "/lists") // indica qual caminho irei acessar na minha API
public class GameListController {
	
	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

		
	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}
		
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		return gameService.findByList(listId);
		
	}
	
	
	
}
