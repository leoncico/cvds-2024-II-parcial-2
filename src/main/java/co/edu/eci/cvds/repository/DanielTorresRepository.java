package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.DanielTorres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanielTorresRepository extends JpaRepository<DanielTorres, Integer> {
}
