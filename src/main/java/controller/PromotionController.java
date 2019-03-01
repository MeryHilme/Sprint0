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

import com.Promotion;

import service.PromotionRepository;
import service.PromotionService;

@CrossOrigin
@RestController
@RequestMapping("/promotions")
public class PromotionController {
	@Autowired
	PromotionService Pro;
	@Autowired
	PromotionRepository promotionRepository;

	/* 1- Lister all promotions */
	@RequestMapping(value = "/AllPromos", method = { RequestMethod.GET })
	public List<Promotion> getAll() {
		return Pro.getAll();
	}
	

	/* 2- Searching by Sigle de Promotion */
	@RequestMapping("/sigle/{siglePromotion}")
	@ResponseBody
	public Promotion getPromotion(@PathVariable("siglePromotion") String siglePromotion) {
		return Pro.getPromotion(siglePromotion);
	}
	
	/* 3- Searching by annee_universitaire et code_formation */
	@RequestMapping(value = "/{codeFormation}/{anneeUniversitaire}", method = { RequestMethod.GET })
	@ResponseBody
	public Promotion findByCodeFormationAndAnneeUniveristaire(@PathVariable("codeFormation") String codeFormation, @PathVariable("anneeUniversitaire") String anneeUniversitaire) {
		return promotionRepository.findByCodeFormationAndAnneeUniveristaire(codeFormation,anneeUniversitaire);

	}
	
	/*4- Deleting all promotions */ 
	@RequestMapping(value = "/pro", method = { RequestMethod.DELETE })
	@ResponseBody
	public void deletePromotions() {
		promotionRepository.deleteAll();
	}
	
	/*5- Deleting by AnneeUnversitaire et codeFormation */
	@RequestMapping(value = "/{codeFormation}/{anneeUniversitaire}", method = { RequestMethod.DELETE })
	@ResponseBody
	public void delete(@PathVariable("codeFormation") String codeFormation,@PathVariable("anneeUniversitaire") String anneeUniversitaire) {
		promotionRepository.deleteByCodeFormationAndAnneeUniversitaire(codeFormation,anneeUniversitaire);
	}
	
	/*6- Create a new promotion */
	@RequestMapping(value = "/create", method = { RequestMethod.POST })
	public void save(@RequestBody Promotion p) {
		Pro.save(p);
	}
	
	
}