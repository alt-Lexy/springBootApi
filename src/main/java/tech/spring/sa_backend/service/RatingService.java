package tech.spring.sa_backend.service;

import org.springframework.stereotype.Service;
import tech.spring.sa_backend.entities.Client;
import tech.spring.sa_backend.entities.Rating;
import tech.spring.sa_backend.repository.RatingRepository;

@Service
public class RatingService {
    private ClientService clientService;
    private RatingRepository ratingRepository;

    public RatingService(ClientService clientService, RatingRepository ratingRepository) {
        this.clientService = clientService;
        this.ratingRepository = ratingRepository;
    }

    public void creer(Rating rating){
        Client client = this.clientService.lireOuCreer(rating.getClient());
        rating.setClient(client);
        this.ratingRepository.save(rating);
    }
}
