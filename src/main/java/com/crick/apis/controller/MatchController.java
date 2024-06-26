package com.crick.apis.controller;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }


    //API to get Live Matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){

        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllmatches(){

        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

    @GetMapping("/points-table")
    public ResponseEntity<?> getPointsTable(){

        return new ResponseEntity<>(this.matchService.getPointsTable(),HttpStatus.OK);

    }
}
