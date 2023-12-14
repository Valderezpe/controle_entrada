package br.com.valderez.lista.de.tarefas.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class lista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 120, nullable = false)
    private String title;

    @Column(length =150, nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime createsAt;

    @Column(nullable = false)
    private LocalDate deadline;

    @Column(nullable = true)
    private LocalDate fineshedAt;

    public lista(){
        this.createsAt = LocalDateTime.now();
    }
    

    
}