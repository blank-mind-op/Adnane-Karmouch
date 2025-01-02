package ma.xproce.gestionconference.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Moderateur extends Participant{

    private String specialite;


    @OneToOne(mappedBy = "moderateur")
    private Session session;
}
