package Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class TheorieAntwoordenEntity {
    private Long id;
    private String antwoord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAntwoord() {
        return antwoord;
    }

    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }
    @ManyToOne
    @JoinColumn(name = "theorie_id", nullable = false)
    private TheorieEntity theorie;

    @Override
    public String toString() {
        return "TheorieAntwoordenEntity{" +
                "id=" + id +
                ", antwoord='" + antwoord + '\'' +
                '}';
    }
}
