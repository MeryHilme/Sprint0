package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Promotion;


@Service
public class PromotionService {
    
	@Autowired
	PromotionRepository promotionRepository;

	public PromotionService() {}

	public List<Promotion> getAll() {
		return promotionRepository.findAll();
	}

	public Promotion getPromotion(String siglePromotion) {
		
		List<Promotion> p = promotionRepository.findAll();
		for(Promotion promotion: p) {
			if(promotion.getSiglePromotion().equalsIgnoreCase(siglePromotion)) return promotion;
		}
	    return null;
	}

	public Promotion getLieuRentree(String lieuRentree) {
		List<Promotion> pr = promotionRepository.findAll();
		for(Promotion promotion: pr) {
			if(promotion.getLieuRentree().equalsIgnoreCase(lieuRentree)) return promotion;
		}
		
		return null;
	}

	public void save(Promotion P){
		promotionRepository.save(P);}

}