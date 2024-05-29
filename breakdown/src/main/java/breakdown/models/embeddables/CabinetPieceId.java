package breakdown.models.embeddables;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class CabinetPieceId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long cabinetId;
	private Long pieceId;
	
}
