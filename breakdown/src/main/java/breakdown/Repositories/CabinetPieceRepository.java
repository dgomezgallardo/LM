package breakdown.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import breakdown.models.embeddables.CabinetPieceId;
import breakdown.models.entities.CabinetPiece;

@Repository
public interface CabinetPieceRepository extends JpaRepository<CabinetPiece, CabinetPieceId> {

}
