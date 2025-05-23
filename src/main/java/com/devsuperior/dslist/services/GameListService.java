package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.DTO.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

// se trabalha nessa camada, após o DTO.

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	//precisa ser injetado no service por ser uma camada acima.
	
	
	//garante que o acesso ao banco de dados seja transacional e que vá acontecer,
	//garantindo que ela seja consistente, durável, isolada, atônica.

	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
