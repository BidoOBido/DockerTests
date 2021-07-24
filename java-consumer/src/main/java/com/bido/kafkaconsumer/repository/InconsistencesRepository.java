package com.bido.kafkaconsumer.repository;

import com.bido.kafkaconsumer.model.Inconsistences;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface InconsistencesRepository extends CrudRepository<Inconsistences, Long> {}
