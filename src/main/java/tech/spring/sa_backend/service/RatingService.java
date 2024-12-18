package tech.spring.sa_backend.service;

import org.springframework.stereotype.Service;
import tech.spring.sa_backend.entities.Client;
import tech.spring.sa_backend.entities.Rating;
import tech.spring.sa_backend.enums.TypeRating;
import tech.spring.sa_backend.repository.RatingRepository;

import java.util.List;

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

        rating.setType(TypeRating.POSITIF);

        if (rating.getComment().contains("pas")) {
            rating.setType(TypeRating.NEGATIF);
        }

        this.ratingRepository.save(rating);


    }

    public List<Rating> rechercher(TypeRating type) {
        if (type == null) {
            return  this.ratingRepository.findAll();
        }

        return this.ratingRepository.findByType(type);
    }

    public void supprimer(int id) {
        this.ratingRepository.deleteById(id);
    }
}
