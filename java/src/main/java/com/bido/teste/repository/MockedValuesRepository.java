package com.bido.teste.repository;

import com.bido.teste.model.MockedValues;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface MockedValuesRepository extends CrudRepository<MockedValues, Long> {

    @Query(value = "SELECT mv.* FROM mocked_values mv WHERE mv.first_value <> mv.second_value", nativeQuery = true)
    Iterable<MockedValues> findInconsistences();

}
