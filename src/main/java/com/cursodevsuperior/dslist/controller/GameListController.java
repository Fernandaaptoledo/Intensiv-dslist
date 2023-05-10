package com.cursodevsuperior.dslist.controller;

import com.cursodevsuperior.dslist.dto.GameListDTO;
import com.cursodevsuperior.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/lists")
public class GameListController {
    
        @Autowired
        private GameListService gameListService;

        @GetMapping
        public List<GameListDTO> fidAll() {
            List<GameListDTO> result = gameListService.findAll();
            return result;
        }
}
