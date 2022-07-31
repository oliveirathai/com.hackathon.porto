package com.hackathon.porto.repository;

import com.hackathon.porto.model.DadosViagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DadoViagemRepository extends CrudRepository<DadosViagem, Long> {

	Optional<DadosViagem> findById(Long id);

}
