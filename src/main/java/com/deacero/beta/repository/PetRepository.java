package com.deacero.beta.repository;

import com.deacero.beta.model.entity.PetEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<PetEntity, Long> {
  List<PetEntity> findByName(String name);
}
