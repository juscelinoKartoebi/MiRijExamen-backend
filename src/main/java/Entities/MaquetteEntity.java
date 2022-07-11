package Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class MaquetteEntity {
    private Long id;
    private String imgSrc;
    private String vragen;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getVragen() {
        return vragen;
    }

    public void setVragen(String vragen) {
        this.vragen = vragen;
    }

    @OneToMany(mappedBy = "maquettenEntity", fetch = FetchType.LAZY)
    private Set<MaquettenAntwoordenEntity> maquettenAntwoorden;

    @Override
    public String toString() {
        return "MaquetteEntity{" +
                "id=" + id +
                ", imgSrc='" + imgSrc + '\'' +
                ", vragen='" + vragen + '\'' +
                '}';
    }
}

