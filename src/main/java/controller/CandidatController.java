
/* this package contains all controllers */

package controller;

/* Importing needed libraries */
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

// @CrossOrigin is used to share resources in the spring project by requesting 
@CrossOrigin
//@RestController annotation is for saying that this class is implementing a restful controller for manipulating resources
@RestController
// Defining my resource: /candidats
@RequestMapping("/candidats")

// Implementation of the Controller:
public class CandidatController {
	// For searching the instance of the bean easily...
	@Autowired
	CandidatService Can;
	// Searching in the Repository mentionned
	@Autowired
	CandidatRepository candidatRepository;

	/* 1- Show all candidats: */
	// @RequestMapping defines the methods HTTP used to send requests,
	// here is a GET method (by default it is a GET)
	@RequestMapping(value = "/all", method = { RequestMethod.GET })
	public List<Candidat> getAll() {
		// Returning all results
		return Can.getAll();
	}

	/* 2- Search by NoCandidat */
	@RequestMapping("/{noCandidat}")

	// @RespondeBody is for mapping the HTTP requests
	@ResponseBody
	public Candidat getCandidat(@PathVariable("noCandidat") String noCandidat) {
		// @PathVariable defines the variable that we pass in the URI
		return Can.getCandidat(noCandidat);
	}

	/* 3- Create a new "candidat" */

	// Sending a JSON stream by using a POST method
	@RequestMapping(value = "/create", method = { RequestMethod.POST })
	public void save(@RequestBody Candidat c) {
		Can.save(c);
	}

	/* 4- Delete a candidat by noCandidat */
	// Using DELETE method
	@RequestMapping(value = "/delete/{noCandidat}", method = { RequestMethod.DELETE })
	@ResponseBody
	public void delete(@PathVariable("noCandidat") String noCandidat) {
		candidatRepository.deleteCandidatByNo(noCandidat);
	}

	/* 5- Deleting all candidats */
	@RequestMapping(value = "/cand", method = { RequestMethod.DELETE })
	@ResponseBody
	public void deleteCandidats() {
		candidatRepository.deleteAll();
	}

	/* 6- Searching by université d'origine */
	@RequestMapping(value = "/universite/{universiteOrigine}", method = { RequestMethod.GET })
	@ResponseBody
	public List<Candidat> getUniversiteOrigine(@PathVariable("universiteOrigine") String universiteOrigine) {
		return candidatRepository.findByUniversiteOrigine(universiteOrigine);

	}

	/* 7- Searching by candidat's name */
	@RequestMapping(value = "/nom/{nom}", method = { RequestMethod.GET })
	@ResponseBody
	public Candidat getNom(@PathVariable("nom") String nom) {
		return candidatRepository.findByNom(nom);

	}

}