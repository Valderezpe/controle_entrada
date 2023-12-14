package br.com.valderez.lista.de.tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.valderez.lista.de.tarefas.models.lista;

public interface ItemsRepository extends JpaRepository<lista, Long>{
    
}
