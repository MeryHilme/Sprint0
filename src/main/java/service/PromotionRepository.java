package service;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.Promotion;
import com.PromotionPrimaryKey;

public interface PromotionRepository extends JpaRepository<Promotion, PromotionPrimaryKey> {

	List<Promotion> findByLieuRentree(String lieuRentree);
    List<Promotion> findAll();
    
    @Query("SELECT p FROM Promotion p WHERE p.formation.codeFormation = ?1 AND p.anneeUniversitaire=?2")
	public Promotion findByCodeFormationAndAnneeUniveristaire(String codeFormation, String anneeUniversitaire);
    
    @Modifying
    @Transactional
    @Query("delete from Promotion p WHERE p.formation.codeFormation = ?1 AND p.anneeUniversitaire=?2")
	void deleteByCodeFormationAndAnneeUniversitaire(String codeFormation, String anneeUniversitaire);
    
    
   
}

