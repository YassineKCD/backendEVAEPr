package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.repositories.UniteEnseignementRepository;
@Service
public class UniteEnseignementBusinessJPA implements UniteEnseignementBusiness {
	
	UniteEnseignementRepository repos ;

	@Autowired 
	public UniteEnseignementBusinessJPA(UniteEnseignementRepository repos) {		
		this.repos = repos;
	}
	
	@Override
	public List<UniteEnseignement> rechercherParFormation(String codeFormation) {
		return repos.findUniteEnseignementByFormationCodeFormation(codeFormation);
	}

	@Override
	public List<UniteEnseignement> rechercherParEnseignant(int noEnseignant) {
		List<UniteEnseignement> ueRecherche = repos.findByEnseignantNoEnseignant(noEnseignant);		
		return ueRecherche;
	}

	@Override
	public List<UniteEnseignement> rechercherParFormationAndEnseignant(String codeFormation, int noEnseignant) {
		List<UniteEnseignement> ueRecherche = repos.findUniteEnseignementByFormationCodeFormationAndEnseignantNoEnseignant(codeFormation,noEnseignant);		
		return ueRecherche;
	}

}
