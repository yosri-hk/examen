package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Integer> { 


}
