package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Formateur;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Integer> {

}
