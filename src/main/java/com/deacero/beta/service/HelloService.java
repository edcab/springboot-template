package com.deacero.beta.service;

import com.deacero.beta.model.dto.PetDto;
import java.util.List;

public interface HelloService {
  List<PetDto> getPetByName(String name);
}
