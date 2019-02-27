package service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Candidat;



@Repository
public interface CandidatRepository extends JpaRepository<Candidat, String>{

	public List<Candidat> findByUniversiteOrigine(String universiteOrigine);
	public Candidat findByNom(String nom);
}