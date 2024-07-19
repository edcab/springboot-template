package com.deacero.beta.controller;

import com.deacero.beta.controller.api.HelloPetApi;
import com.deacero.beta.model.dto.PetDto;
import com.deacero.beta.service.HelloService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class HelloPetApiController implements HelloPetApi {

  private final HelloService helloService;

  @Override
  public ResponseEntity<List<PetDto>> findPetsByName(
      @NotNull
          @Parameter(
              description = "Name value need to be considered for filter",
              required = true,
              in = ParameterIn.QUERY)
          @Valid
          @RequestParam(value = "name")
          String name) {

    List<PetDto> petsDtoByName = helloService.getPetByName(name);

    return new ResponseEntity<>(petsDtoByName, HttpStatus.OK);
  }
}
