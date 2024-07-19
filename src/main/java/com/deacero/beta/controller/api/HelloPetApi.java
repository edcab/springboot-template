package com.deacero.beta.controller.api;

import com.deacero.beta.model.dto.PetDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
@RequestMapping(value = "/v2")
public interface HelloPetApi {

  @Operation(
      summary = "Finds Pets by Name",
      description = "Name value need to be considered for filter",
      security = @SecurityRequirement(name = "api_key_header"),
      responses = {
        @ApiResponse(responseCode = "200", description = "successful operation"),
        @ApiResponse(responseCode = "400", description = "Invalid status value")
      })
  @GetMapping(
      value = "/pet/findByName",
      produces = {"application/json"})
  ResponseEntity<List<PetDto>> findPetsByName(@NotNull @RequestParam(value = "name") String name);
}
