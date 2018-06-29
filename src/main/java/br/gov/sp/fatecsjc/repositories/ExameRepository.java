package br.gov.sp.fatecsjc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatecsjc.domain.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Integer>{

}
