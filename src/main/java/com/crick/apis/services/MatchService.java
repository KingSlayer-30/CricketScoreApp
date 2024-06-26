package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;

public interface MatchService {

    //get all matches
    //get live matches
    //get points table

    List<Match> getAllMatches();
    List<Match> getLiveMatches();

    List<List<String>> getPointsTable();
}
