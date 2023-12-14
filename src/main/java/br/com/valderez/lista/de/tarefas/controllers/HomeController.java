package br.com.valderez.lista.de.tarefas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.valderez.lista.de.tarefas.repositories.ItemsRepository;

@Controller
public class HomeController {

    private final ItemsRepository itemsRepository;

    public HomeController(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    @GetMapping("/")
    public ModelAndView home(){
        var ModelAndView = new ModelAndView("home");
        ModelAndView.addObject("nome","Lista de produtos");
        var produtos = List.of("Cimentos","Carrinho de mão", "Pá", "Pia");
        ModelAndView.addObject("produtos", produtos);

        var items = itemsRepository.findAll(); 
        System.out.println(items);


        return ModelAndView;

    }
}
