package breakdown.services.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import breakdown.models.entities.Cabinet;
import breakdown.models.entities.CabinetPiece;
import breakdown.repositories.CabinetRepository;
import breakdown.services.CabinetService;
import java.util.Collections;

@Service
public class CabinetServiceImpl implements CabinetService {

	private CabinetRepository cabinetRepository;
	
	public CabinetServiceImpl(CabinetRepository cabinetRepository) {
		this.cabinetRepository = cabinetRepository;
	}
	
	@Override
	public Cabinet createCabinet(String name) {
		// TODO-01 implements createCabinet
		Cabinet newCabinet = new Cabinet(name);
		return cabinetRepository.save(newCabinet);
	}

	@Override
	public Cabinet createCabinet(String name, Set<CabinetPiece> cabinetPieces) {
		// TODO-02 implements createCabinet-2
		return null;
	}

	@Override
	public List<Cabinet> findAllCabinets() {
		// TODO-03 implements findAllCabinets
		return Collections.emptyList();
	}

	@Override
	public Cabinet findCabinetById(Long id) {
		// TODO-04 implements findCabinetById
		return null;
	}

	@Override
	public List<Cabinet> findCabinetsByName(String name) {
		// TODO-05 implements findCabinetsByName
		return Collections.emptyList();
	}

}
