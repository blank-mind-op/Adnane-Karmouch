package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire,Integer> {
}
