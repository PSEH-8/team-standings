package com.javapointers.controller;

import com.javapointers.model.TeamStandings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String showLoginPage(@ModelAttribute ModelMap model) {

        TeamStandings teamStandings = new TeamStandings();
        teamStandings.getStandings();
        return "index";
    }
}
