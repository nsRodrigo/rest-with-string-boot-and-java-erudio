package br.com.nsrodrigo.repository;

import br.com.nsrodrigo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> { }
