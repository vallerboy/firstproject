package pl.oskarpolak.firstproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lenovo on 31.08.2017.
 */

@Controller
public class MainController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }


    @RequestMapping(path = "/form", method = RequestMethod.POST)
    @ResponseBody
    public String form(@RequestParam("message") String message){
        return "Wiadomość to: " + message;
    }
}
