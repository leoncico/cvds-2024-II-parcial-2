package co.edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.eci.cvds.model.DAVID_PINEROS;

@Repository
public interface DavidPinerosRepository extends JpaRepository<DAVID_PINEROS, String> {
}
