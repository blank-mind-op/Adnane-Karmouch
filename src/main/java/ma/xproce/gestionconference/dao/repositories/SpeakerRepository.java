package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Integer> {
}
