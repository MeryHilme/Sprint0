package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Enseignant;


@Service
public class EnseignantService {
    
	@Autowired
	EnseignantRepository enseignantRepository;

	public EnseignantService() {
		
	}

	public List<Enseignant> getAll() {
		return enseignantRepository.findAll();
	}

public Enseignant getEnseignant(Long noEnseignant) {
		
		List<Enseignant> e = enseignantRepository.findAll();
		for(Enseignant enseignant: e) {
			if((enseignant.getNoEnseignant()) == (noEnseignant)) return enseignant;
		}
	    return null;
	}

public void save(Enseignant E){
	enseignantRepository.save(E);}

public void deleteEnseignantByNo(Long noEnseignant){
	 enseignantRepository.deleteEnseignantByNo(noEnseignant);
	}

public void deleteAll(){
	 enseignantRepository.deleteAll();
	}

public Enseignant getEmailUbo(String emailUbo) {
	List<Enseignant> e = enseignantRepository.findAll();
	for(Enseignant enseignant: e) {
		if(enseignant.getEmailUbo().equalsIgnoreCase(emailUbo)) return enseignant;
	}
	
	return null;
}











	
}