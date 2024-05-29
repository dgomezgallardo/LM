package breakdown.models.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "CABINETS")
public class Cabinet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long idCabinet;
	
	String name;
	
	@OneToMany(mappedBy = "cabinet", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<CabinetPiece> cabinetPieces = new HashSet<>();
	
	public Cabinet(String name) {
		this.name = name;
	}
	
}
