package pl.oskarpolak.firstproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String form(@RequestParam("name") String name,
                       @RequestParam("lastname") String lastname,
                       @RequestParam("age") int age,
                       Model model){
        if(age >= 18) {
            model.addAttribute("message", "Jesteś pełnoletni" );
        }else{
            model.addAttribute("message", "Jesteś małolatem" );
        }
        return "response";
    }
}
