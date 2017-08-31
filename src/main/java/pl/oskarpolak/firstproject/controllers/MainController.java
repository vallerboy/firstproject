package pl.oskarpolak.firstproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.firstproject.models.CarModel;

/**
 * Created by Lenovo on 31.08.2017.
 */

@Controller
public class MainController {


    //////Index
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    //////Pobieranie pojedynczych danych
    @RequestMapping(path = "/form", method = RequestMethod.POST)
    public String form(@RequestParam(name = "name", required = true) String name,
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

    /////////////Mapowanie całego formularza na model danych
    @RequestMapping(path = "/addcar", method = RequestMethod.GET)
    public String addCarGet(Model dataModel){
        dataModel.addAttribute("car", new CarModel());
        return "addcar";
    }

    @RequestMapping(path = "/addcar", method = RequestMethod.POST)
    public String addCarPost(@ModelAttribute("car") CarModel model, Model modelData){
        modelData.addAttribute("message", "Dodałeś samochód: " + model.toString());
        return "addcar";
    }


}
