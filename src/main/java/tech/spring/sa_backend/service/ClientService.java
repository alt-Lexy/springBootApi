package tech.spring.sa_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.spring.sa_backend.entities.Client;
import tech.spring.sa_backend.repository.ClientRepository;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client){
        this.clientRepository.save(client);
    }
}
