package michiel.springframework.chucknorrisjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import michiel.springframework.chucknorrisjokes.services.QuoteService;

@Controller

public class QuoteController {

   private final QuoteService quoteService;

   // does dependecy injection '@Autowired' automatically
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping(path = {"/",""})
    public String getModel(Model model){
        model.addAttribute("joke",quoteService.getRandomQoute());
        return "index";
    }

}
