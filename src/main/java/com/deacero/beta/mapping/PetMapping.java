package com.deacero.beta.mapping;

import com.deacero.beta.model.dto.PetDto;
import com.deacero.beta.model.entity.PetEntity;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetMapping {

  PetDto toPetDto(PetDto petDto);

  List<PetDto> toPetsDto(List<PetEntity> petEntities);
}
