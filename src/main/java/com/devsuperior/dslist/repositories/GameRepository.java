package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;


// pode-se copiar e colar, mudando o nome para se obter outras cópias dessa interface.
public interface GameRepository extends JpaRepository <Game, Long> {
	
	

}
