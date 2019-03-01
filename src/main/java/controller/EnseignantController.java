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

import service.EnseignantRepository;
import service.EnseignantService;


import com.Enseignant;

@CrossOrigin
@RestController
@RequestMapping("/enseignants")


public class EnseignantController {
	@Autowired
	EnseignantService Ens;
	@Autowired
	EnseignantRepository enseignantRepository;

	/* 1- Listing all teachers */
	@RequestMapping(value = "/all", method = { RequestMethod.GET })
	public List<Enseignant> getAll() {
		return Ens.getAll();
	}

	/* 2- Search by ID Enseignant */
	@RequestMapping("/{noEnseignant}")
	@ResponseBody
	public Enseignant getEnseignant(@PathVariable("noEnseignant") Long noEnseignant) {
		return Ens.getEnseignant(noEnseignant);
	}
	
	
	/* 3- Create a new teacher */
	@RequestMapping(value = "/create", method = { RequestMethod.POST })
	public void save(@RequestBody Enseignant e) {
		Ens.save(e);
	}
	
	/* 4- Delete a teacher by Id */
	@RequestMapping(value = "/delete/{noEnseignant}", method = { RequestMethod.DELETE })
	@ResponseBody
	public void delete(@PathVariable("noEnseignant") Long noEnseignant) {
		enseignantRepository.deleteEnseignantByNo(noEnseignant);
	}
	
	/* 4- Delete all Enseignants */
	@RequestMapping(value = "/ens", method = { RequestMethod.DELETE })
	@ResponseBody
	public void deleteEnseignant() {
		enseignantRepository.deleteAll();
	}
	
	/* 5- Search by EmailUbo */
	@RequestMapping(value = "/emailUbo/{emailUbo}", method = { RequestMethod.GET })
	@ResponseBody
	public List<Enseignant> getEmailUbo(@PathVariable("emailUbo") String emailUbo) {
		return enseignantRepository.findByemailUbo(emailUbo);

	}
	
	/* 6- Search by teacher's name */
	@RequestMapping(value = "/nom/{nom}", method = { RequestMethod.GET })
	@ResponseBody
	public Enseignant getNom(@PathVariable("nom") String nom) {
		return enseignantRepository.findByNom(nom);

	}
	
	
}