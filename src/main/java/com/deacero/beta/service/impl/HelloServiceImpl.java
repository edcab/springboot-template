package com.deacero.beta.service.impl;

import com.deacero.beta.mapping.PetMapping;
import com.deacero.beta.model.dto.PetDto;
import com.deacero.beta.model.entity.PetEntity;
import com.deacero.beta.repository.PetRepository;
import com.deacero.beta.service.HelloService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HelloServiceImpl implements HelloService {

  private final PetRepository petRepository;
  private final PetMapping petMapping;

  @Override
  public List<PetDto> getPetByName(String name) {

    List<PetEntity> productsByName = petRepository.findByName(name);

    return petMapping.toPetsDto(productsByName);
  }
}
