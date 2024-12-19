package tech.spring.sa_backend.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import tech.spring.sa_backend.entities.Client;
import tech.spring.sa_backend.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client) {
        Client getClient = this.clientRepository.findByEmail(client.getEmail());
        if (getClient == null) {
            this.clientRepository.save(client);
        }
    }

    public List<Client> rechercher() {
        return this.clientRepository.findAll();
    }

    public Client lire(int id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        // replace if() and else null =>
        // return optionalClient.orElse(null);
        return optionalClient.orElseThrow(
                () -> new EntityNotFoundException("Aucun resultat")
        );
    }

    public Client lireOuCreer(Client client){
        Client getClient = this.clientRepository.findByEmail(client.getEmail());
        if (getClient == null) {
            this.clientRepository.save(client);
        }
        return  getClient;
    }

    public void modifier(int id, Client client) {
        Client getClient = this.lire(id);
        if (getClient.getId() == client.getId()) {
            getClient.setEmail(client.getEmail());
            getClient.setTelephone(client.getTelephone());
            this.clientRepository.save(getClient);
        }
    }
}
