package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Apprenant;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Integer> {

}
