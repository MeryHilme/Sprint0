package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping("/all")
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
	@RequestMapping("/create")
	public List<Candidat> save() {
		Candidat c = new Candidat("2","M2DOSI","2017-2018","Karima","Merry","F");
		Can.save(c);
		return Can.getAll();
	}
	
	/*4- Suppression d'un candidat par Id */ 
	@RequestMapping("/delete/{noCandidat}")
	@ResponseBody
	  public void delete(@PathVariable("noCandidat") String noCandidat) {
	       candidatRepository.deleteById(noCandidat);
	}
	
	/* 5- Recherche par université d'origine */ 
	@RequestMapping("/universite/{universiteOrigine}")
	@ResponseBody
	public List<Candidat> getUniversiteOrigine(@PathVariable("universiteOrigine") String universiteOrigine) {
		return candidatRepository.findByUniversiteOrigine(universiteOrigine);

	}
	/* 6- Recherche par nom de candidat */ 
	@RequestMapping("/nom/{nom}")
	@ResponseBody
	public Candidat getNom(@PathVariable("nom") String nom) {
		return candidatRepository.findByNom(nom);

	}
	
}