package tech.spring.sa_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.spring.sa_backend.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
