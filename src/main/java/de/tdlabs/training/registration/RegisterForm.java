package de.tdlabs.training.registration;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RegisterForm {

  @NotNull
  String username;

  @NotNull
  String firstname;

  @NotNull
  String lastname;

  @NotNull
  String email;

  @NotNull
  String password;

  @NotNull
  String passwordConfirmation;
}
