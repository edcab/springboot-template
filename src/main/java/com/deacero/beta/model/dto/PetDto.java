package com.deacero.beta.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
public class PetDto {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;
}
