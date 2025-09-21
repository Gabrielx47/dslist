package com.project.backend.services;

import com.project.backend.dto.GameDTO;
import com.project.backend.dto.GameMinDTO;
import com.project.backend.entities.Game;
import com.project.backend.projections.GameMinProjection;
import com.project.backend.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id) {
        List<GameMinProjection> result = gameRepository.searchByList(id);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
