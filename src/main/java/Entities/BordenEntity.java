package Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class BordenEntity {
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
    @OneToMany(mappedBy = "bordenEntity", fetch = FetchType.LAZY)
    private Set<BordenAntwoordenEntity> bordenAntwoorden;

    @Override
    public String toString() {
        return "BordenEntity{" +
                "id=" + id +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }
}
