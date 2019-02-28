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
import com.Candidat;


import service.CandidatRepository;
import service.CandidatService;


@CrossOrigin
@RestController
@RequestMapping("/candidats")
public class CandidatController {
	@Autowired
	CandidatService Can;
	@Autowired
	CandidatRepository candidatRepository;
	

	/* 1- Lister tous les candidats */ 
	@RequestMapping(value="/all",method = { RequestMethod.GET})
	public List<Candidat> getAll() {
		return Can.getAll();
	}
    
    /* 2- Recherche par ID candidat */ 
	@RequestMapping("/{noCandidat}")
	@ResponseBody
	public Candidat getCandidat(@PathVariable("noCandidat") String noCandidat) {
		return Can.getCandidat(noCandidat);
	}

	/*3- Create un nouveau candidat*/
	@RequestMapping(value="/create",method= {RequestMethod.POST})
	public void save(@RequestBody Candidat c) {
		Can.save(c);
	}
	
	/*4- Suppression d'un candidat par Id 
	@RequestMapping(value = "/delete/{noCandidat}",method = { RequestMethod.DELETE })
	@ResponseBody
	  public void delete(@PathVariable("noCandidat") String noCandidat) {
	       candidatRepository.deleteById(noCandidat);
	} */
	
	
	/*4- Suppression d'un candidat par Id  */	
	@RequestMapping(value = "/delete/{noCandidat}",method = { RequestMethod.DELETE })
	@ResponseBody
	  public void delete(@PathVariable("noCandidat") String noCandidat) {
	       candidatRepository.deleteCandidatByNo(noCandidat);
	}
	
	/*4- Suppression de tous les candidats  */	
	@RequestMapping(value = "/cand",method = { RequestMethod.DELETE })
	@ResponseBody
	  public void deleteCandidats() {
	       candidatRepository.deleteAll();
	}
	
	
	/* 5- Recherche par université d'origine */ 
	@RequestMapping(value ="/universite/{universiteOrigine}",method = { RequestMethod.GET})
	@ResponseBody
	public List<Candidat> getUniversiteOrigine(@PathVariable("universiteOrigine") String universiteOrigine) {
		return candidatRepository.findByUniversiteOrigine(universiteOrigine);

	}
	
	
	
	/* 6- Recherche par nom de candidat */ 
	@RequestMapping(value= "/nom/{nom}", method = { RequestMethod.GET})
	@ResponseBody
	public Candidat getNom(@PathVariable("nom") String nom) {
		return candidatRepository.findByNom(nom);

	}
	
}