package tech.spring.sa_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.spring.sa_backend.entities.Client;
import tech.spring.sa_backend.service.ClientService;

import java.util.List;

import static  org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Client client) {
        this.clientService.creer(client);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Client> rechercher() {
        return this.clientService.rechercher();
    }

    @GetMapping(path = "{id}", produces = APPLICATION_JSON_VALUE)
    public Client lire(@PathVariable int id) {
        return this.clientService.lire(id);
    }
}