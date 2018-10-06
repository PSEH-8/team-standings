package com.javapointers.controller;

import com.javapointers.Beans.Team;
import com.javapointers.model.TeamStandings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }

    @RequestMapping(value="/showStandings", method = RequestMethod.GET)
    @ResponseBody
    public String showLoginPage(@RequestBody Team team) {

        TeamStandings teamStandings = new TeamStandings();
        teamStandings.getStandings();
        return "index";
    }
}
