package ma.xproce.gestionconference.dao.repositories;

import ma.xproce.gestionconference.dao.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer> {
}
