package Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class TheorieEntity {
    private Long id;
    private String vraag;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVraag() {
        return vraag;
    }

    @OneToMany(mappedBy = "theorieEntity", fetch = FetchType.LAZY)
    private Set<TheorieAntwoordenEntity> theorieAntwoorden;

    @Override
    public String toString() {
        return "TheorieEntity{" +
                "id=" + id +
                ", vraag='" + vraag + '\'' +
                '}';
    }
}
