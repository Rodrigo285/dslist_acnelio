package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    public GameRepository gameRepository;
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> game = gameRepository.findAll();
        return game.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return  new GameDTO(result);

    }




}
