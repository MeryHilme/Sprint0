package service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Candidat;
    
@Repository
@Transactional(readOnly = true)

// This interface extends from JPARepository which is our DAO (Accessing to data)
public interface CandidatRepository extends JpaRepository<Candidat, String>{

	//This body contains the signature of the methods used in the ClassService CandidatService!
	
	public List<Candidat> findByUniversiteOrigine(String universiteOrigine);
	public Candidat findByNom(String nom);

	//Deleting using a @Transactional because it is critical to delete in a database!
	@Modifying
    @Transactional
    @Query("delete from Candidat c where c.noCandidat = ?1")
    void deleteCandidatByNo(String noCandidat);
	
	@Modifying
    @Transactional
	@Query("DELETE from Candidat")
    void deleteAll();
}







