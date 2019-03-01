package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Formation;


@Service
public class FormationService {
    
	@Autowired
	FormationRepository formationRepository;

	public FormationService() {
		
	}

	public List<Formation> getAll() {
		return formationRepository.findAll();
	}
	public void save(Formation C){
		formationRepository.save(C);}

	public List<Formation> findBy(String codeFormation) {
		
		return formationRepository.findAll();
	}

	public Formation getFormation(String codeFormation) {
		
			List<Formation> c = formationRepository.findAll();
			for(Formation formation: c) {
				if(formation.getCodeFormation().equalsIgnoreCase(codeFormation)) return formation;
			}
		    return null;
		}

	
	public void deleteByCodeFormation(String codeFormation){
		 formationRepository.deleteById(codeFormation);
		}
	
	public void deleteAll(){
		 formationRepository.deleteAll();
		}

	public Formation getCodeFormation(String codeFormation) {
		List<Formation> frm = formationRepository.findAll();
		for(Formation formation: frm) {
			if(formation.getCodeFormation().equalsIgnoreCase(codeFormation)) return formation;
		}
		
		return null;
	}
	
	public Formation getNomFormation(String nomFormation) {
		List<Formation> frm = formationRepository.findAll();
		for(Formation formation: frm) {
			if(formation.getNomFormation().equalsIgnoreCase(nomFormation)) return formation;
		}
		
		return null;
	}


}
