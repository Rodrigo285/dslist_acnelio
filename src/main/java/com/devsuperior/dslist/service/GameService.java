package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    public GameRepository gameRepository;
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public List<GameMinDTO> findAll(){
        List<Game> game = gameRepository.findAll();
        return game.stream().map(GameMinDTO::new).toList();
    }


}
