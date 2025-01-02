package ma.xproce.gestionconference.dao.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titre;

    private LocalDate date;

    private Integer heureDebut;

    private Integer heureFin;

    private String description;

    @ManyToOne
    private Session session;


    @OneToMany(mappedBy = "conference")
    private List<Commentaire> commentaires;

    @OneToOne
    private Participant speaker;
}
