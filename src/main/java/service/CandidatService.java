package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Candidat;

// This class is used to define all methods used, called by the controllers who sends requests!
@Service
public class CandidatService {

	@Autowired
	CandidatRepository candidatRepository;

	public CandidatService() {
	}

	public List<Candidat> getAll() {
		return candidatRepository.findAll();
	}

	public void save(Candidat C) {
		candidatRepository.save(C);
	}

	public List<Candidat> findBy(String noCandidat) {

		return candidatRepository.findAll();
	}

	public Candidat getCandidat(String noCandidat) {

		List<Candidat> c = candidatRepository.findAll();
		for (Candidat candidat : c) {
			if (candidat.getNoCandidat().equalsIgnoreCase(noCandidat))
				return candidat;
		}
		return null;
	}

	public void deleteCandidatByNo(String noCandidat) {
		candidatRepository.deleteCandidatByNo(noCandidat);
	}

	public void deleteAll() {
		candidatRepository.deleteAll();
	}

	public Candidat getUniversiteOrigine(String universiteOrigine) {
		List<Candidat> cd = candidatRepository.findAll();
		for (Candidat candidat : cd) {
			if (candidat.getUniversiteOrigine().equalsIgnoreCase(universiteOrigine))
				return candidat;
		}

		return null;
	}

	public Candidat getNom(String nom) {
		List<Candidat> cdt = candidatRepository.findAll();
		for (Candidat candidat : cdt) {
			if (candidat.getNom().equalsIgnoreCase(nom))
				return candidat;
		}

		return null;
	}

}
