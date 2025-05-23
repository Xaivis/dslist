package com.devsuperior.dslist.DTO;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	// primeiro se trabalha no DTO
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList entity) {
		// BeanUtils.copyProperties(entity, this);
		// por ser pequeno, pode ser criado as instâncias e como não utilizei esse método
		// eu posso usar apenas os GETTERS.
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
		
}
