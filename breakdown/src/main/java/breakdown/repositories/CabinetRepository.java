package breakdown.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import breakdown.models.entities.Cabinet;

@Repository
public interface CabinetRepository extends JpaRepository<Cabinet, Long>{

}
