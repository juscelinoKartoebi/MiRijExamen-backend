package Entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class BordenAntwoordenEntity {
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
    @JoinColumn(name = "borden_id", nullable = false)
    private BordenEntity borden;

    @Override
    public String toString() {
        return "BordenAntwoordenEntity{" +
                "id=" + id +
                ", antwoord='" + antwoord + '\'' +
                '}';
    }
}
