package co.edu.eci.cvds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.eci.cvds.model.DAVID_PINEROS;
import co.edu.eci.cvds.service.ConfigurationService;
import co.edu.eci.cvds.service.DavidPinerosService;

import java.util.List;

@Controller
public class DavidPinerosController {
    private final DavidPinerosService davidPinerosService;

    @Autowired
    public DavidPinerosController(DavidPinerosService davidPinerosService) {
        this.davidPinerosService = davidPinerosService;
    }

    @GetMapping("/david_pineros")
    public String getAnswers(Model model) {
        List<DAVID_PINEROS> answers =  davidPinerosService.getAllAnswers();
        model.addAttribute("answers", answers);
        return "david_pineros";
    }


}
