package br.com.valderez.lista.de.tarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.valderez.lista.de.tarefas.repositories.ItemsRepository;

@Controller
public class ItemsController {

    private final ItemsRepository itemsRepository;

    public ItemsController(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

  @GetMapping("/")
  public ModelAndView items(){
    return new ModelAndView("items/list", "items", itemsRepository.findAll());
  }
}
