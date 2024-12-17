package tech.spring.sa_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.spring.sa_backend.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
