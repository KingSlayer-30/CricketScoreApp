package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {

    //fetching match details by team name

    Optional<Match> findByTeamHeading(String teamHeading);
}
