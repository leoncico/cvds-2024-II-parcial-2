package co.edu.eci.cvds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import co.edu.eci.cvds.model.CAMILO_MURCIA;
import co.edu.eci.cvds.service.CamiloMurciaService;


@Controller
@RequestMapping(value= "/camilo_murcia")
public class CamiloMurciaController {

    private final CamiloMurciaService camiloMurciaService;

    @Autowired
    public CamiloMurciaController(CamiloMurciaService camiloMurciaService) {
        this.camiloMurciaService = camiloMurciaService;
    }

    @GetMapping("")
    public String camilo_murcia(Model model) {
        model.addAttribute("answersId", camiloMurciaService.getAllAnswers());
        return "camilo_murcia";
    }

}
