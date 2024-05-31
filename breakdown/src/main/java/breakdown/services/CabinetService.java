package breakdown.services;

import java.util.List;
import java.util.Set;

import breakdown.models.entities.Cabinet;
import breakdown.models.entities.CabinetPiece;

public interface CabinetService {
	public Cabinet createCabinet(String name);
	public Cabinet createCabinet(String name, Set<CabinetPiece> cabinetPieces);
	public List<Cabinet> findAllCabinets();
	public Cabinet findCabinetById(Long id);
	public List<Cabinet> findCabinetsByName(String name);
}
