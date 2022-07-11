package Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class MaquettenAntwoordenEntity {

    private Long id;
    private String antwoord;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "ANTWOORD")
    public String getAntwoord() {
        return antwoord;
    }

    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }
    @ManyToOne
    @JoinColumn(name = "maquetten_id", nullable = false)
    private MaquetteEntity maquette;

    @Override
    public String toString() {
        return "MaquettenAntwoordenEntity{" +
                "id=" + id +
                ", antwoord='" + antwoord + '\'' +
                '}';
    }
}
