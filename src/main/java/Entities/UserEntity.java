package Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class UserEntity implements Serializable {
    private Long userId;
    private String naam;
    private String voornaam;
    private Long idNummer;
    private Boolean status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Long getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(Long idNummer) {
        this.idNummer = idNummer;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", idNummer=" + idNummer +
                ", status=" + status +
                '}';
    }
}
