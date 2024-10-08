package dev.andrenascimento.project_manager.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.andrenascimento.project_manager.core.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
