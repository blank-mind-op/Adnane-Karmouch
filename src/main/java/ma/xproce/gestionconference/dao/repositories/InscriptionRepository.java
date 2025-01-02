package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Integer> {
}
