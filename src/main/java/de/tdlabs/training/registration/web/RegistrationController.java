package de.tdlabs.training.registration.web;

import de.tdlabs.training.registration.RegisterForm;
import de.tdlabs.training.registration.RegistrationService;
import de.tdlabs.training.registration.UserAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
class RegistrationController {

  private final RegistrationService registrationService;

  @PostMapping("/register")
  String register(@Valid RegisterForm registerForm, Model model) {

    UserAccount userAccount = registrationService.register(registerForm);

    if(userAccount == null){
      return "registration/register";
    }

    model.addAttribute("account", userAccount);

    return "registration/completed";
  }
}
