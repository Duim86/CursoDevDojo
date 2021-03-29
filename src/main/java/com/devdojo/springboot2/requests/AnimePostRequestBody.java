package com.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AnimePostRequestBody {

  @NotBlank(message = "The name cannot be blank")
  private String name;

}
