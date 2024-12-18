package tech.spring.sa_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.spring.sa_backend.entities.Rating;
import tech.spring.sa_backend.enums.TypeRating;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
    List<Rating> findByType(TypeRating type);
}
