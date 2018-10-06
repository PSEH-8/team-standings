package com.javapointers.model;

import com.javapointers.Beans.Team;
import org.springframework.web.client.RestTemplate;

public class TeamStandings {


    public Team getStandings()
    {
        RestTemplate restTemplate = new RestTemplate();
        Team team = restTemplate.getForObject("https://apifootball.com/api/?action=get_standings&league_id=62&APIkey=xxxxxxxxxxxxxx", Team.class);
        return team;
    }
}
