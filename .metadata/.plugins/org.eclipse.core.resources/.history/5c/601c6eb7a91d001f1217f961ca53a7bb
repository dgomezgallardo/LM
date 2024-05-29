package breakdown.models.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CABINETS")
@Data
public class Cabinet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long idCabinet;
	
	String name;
	
	@ManyToMany
	@JoinTable(name = "CABINETS_PIECES", joinColumns = {@JoinColumn(name = "idCabinet", referencedColumnName = "ID")} )
	List<Piece> pieces;
}
