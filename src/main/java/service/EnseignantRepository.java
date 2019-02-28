package service;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Enseignant;
    
@Repository
@Transactional(readOnly = true)
public interface EnseignantRepository extends JpaRepository<Enseignant, Long>{

	public List<Enseignant> findByEmailUbo(String emailUbo);
	public Enseignant findByNom(String nom);
	
	@Modifying
    @Transactional
    @Query("delete from Enseignant e where e.noEnseignant = ?1")
    void deleteEnseignantByNo(Long noEnseignant);
	
	@Modifying
    @Transactional
	@Query("DELETE from Enseignant")
    void deleteAll();

	List<Enseignant> findByemailUbo(String emailUbo);
	
	
	
}