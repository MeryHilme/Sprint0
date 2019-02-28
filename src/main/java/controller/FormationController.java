package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Formation;


import service.FormationRepository;
import service.FormationService;

@CrossOrigin
@RestController
@RequestMapping("/formations")
public class FormationController {
	@Autowired
	FormationService Frm;
	@Autowired
	FormationRepository formationRepository;

	/* 1- Lister tous les candidats */
	@RequestMapping(value = "/all", method = { RequestMethod.GET })
	public List<Formation> getAll() {
		return Frm.getAll();
	}
	
	/* 2- Recherche par ID candidat */
	@RequestMapping("/{codeFormation}")
	@ResponseBody
	public Formation getFormation(@PathVariable("codeFormation") String codeFormation) {
		return Frm.getFormation(codeFormation);
	}
	
	/* 3- Create un nouveau candidat */
	@RequestMapping(value = "/create", method = { RequestMethod.POST })
	public void save(@RequestBody Formation f) {
		Frm.save(f);
	}
	
	/* 4- Suppression d'un candidat par Id */
	@RequestMapping(value = "/formation/{codeFormation}", method = { RequestMethod.DELETE })
	@ResponseBody
	public void delete(@PathVariable("codeFormation") String codeFormation) {
		formationRepository.deleteByCodeFormation(codeFormation);
	}
	
	
	/* 4- Suppression de toutes les formations */
	@RequestMapping(value = "/frm", method = { RequestMethod.DELETE })
	@ResponseBody
	public void deleteFormations() {
		formationRepository.deleteAll();
	}
	
	/* 5- Recherche par Nom de la formation */
	@RequestMapping(value = "/nom/{nomFormation}", method = { RequestMethod.GET })
	@ResponseBody
	public List<Formation> getNomFormation(@PathVariable("nomFormation") String nomFormation) {
		return formationRepository.findByNomFormation(nomFormation);

	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update/{codeFormation}")
	  public Formation update(@PathVariable String codeFormation, @RequestBody Formation formation) {
		Formation update = formationRepository.findByCodeFormation(codeFormation);
	    update.setDiplome(formation.getDiplome());
	    update.setN0Annee(formation.getN0Annee());
	    update.setNomFormation(formation.getNomFormation());
	    update.setDoubleDiplome(formation.getDoubleDiplome());
	    update.setDebutAccreditation(formation.getDebutAccreditation());
	    update.setFinAccreditation(formation.getFinAccreditation());
	    
	    return formationRepository.save(update);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
}