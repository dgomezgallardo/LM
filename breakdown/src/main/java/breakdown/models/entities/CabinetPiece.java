package breakdown.models.entities;

import breakdown.models.embeddables.CabinetPieceId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="CABINET_PIECES")
public class CabinetPiece {
	
	@EmbeddedId
	private CabinetPieceId id;
	
	@ManyToOne
	@JoinColumn(name = "CABINET_ID")
	@MapsId("idCabinet")
	private Cabinet cabinet;
	
	@ManyToOne
	@JoinColumn(name = "PIECE_ID")
	@MapsId("idPiece")
	private Piece piece;
	
	private int units;
	
	public CabinetPiece(Cabinet cabinet, Piece piece, int units) {
		this.cabinet = cabinet;
		this.piece = piece;
		this.units = units;
		this.id = new CabinetPieceId(cabinet.getIdCabinet(), piece.getIdPiece());
	}
	
}
