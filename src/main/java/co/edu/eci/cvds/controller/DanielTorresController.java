package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.service.ConfigurationService;
import co.edu.eci.cvds.service.DanielTorresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/DanielTorres")
public class DanielTorresController {

    private final DanielTorresService danielTorresService;

    @Autowired
    public DanielTorresController(DanielTorresService danielTorresService) {
        this.danielTorresService = danielTorresService;
    }

    @GetMapping("/configuration")
    public String example(Model model) {
        return "example";
    }

    @GetMapping("")
    public String showAll(Model model) {
    model.addAttribute("Preguntas", danielTorresService.getAllConfigurations());
    return "DanielTorres";
    }


}
