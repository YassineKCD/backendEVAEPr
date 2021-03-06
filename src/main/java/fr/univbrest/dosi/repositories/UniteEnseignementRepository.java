package fr.univbrest.dosi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.bean.UniteEnseignementPK;

public interface UniteEnseignementRepository extends CrudRepository<UniteEnseignement, UniteEnseignementPK>  {

	List<UniteEnseignement> findUniteEnseignementByFormationCodeFormation(String codeFormation);
	List<UniteEnseignement> findByEnseignantNoEnseignant(int noEnseignant);
	List<UniteEnseignement> findUniteEnseignementByFormationCodeFormationAndEnseignantNoEnseignant(String codeFormation,int noEnseignant);

}
