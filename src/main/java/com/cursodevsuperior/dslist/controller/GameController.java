package com.cursodevsuperior.dslist.controller;

import com.cursodevsuperior.dslist.dto.GameDTO;
import com.cursodevsuperior.dslist.dto.GameMinDTO;
import com.cursodevsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value= "/{id}")
    public GameDTO fidAll(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> fidAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
