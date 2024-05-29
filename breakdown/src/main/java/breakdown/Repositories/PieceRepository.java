package breakdown.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import breakdown.models.entities.Piece;

@Repository
public interface PieceRepository extends JpaRepository<Piece, Long> {

}
