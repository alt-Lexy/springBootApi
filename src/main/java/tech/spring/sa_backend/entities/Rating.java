package tech.spring.sa_backend.entities;

import jakarta.persistence.*;
import tech.spring.sa_backend.enums.TypeRating;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "RATING")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    private TypeRating type;
    // plusieurs commentaire possible par client
    @ManyToOne(cascade = {PERSIST, MERGE})
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public Rating() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Rating(int id, String comment, TypeRating type, Client client) {
        this.id = id;
        this.comment = comment;
        this.type = type;
        this.client = client;
    }
}
