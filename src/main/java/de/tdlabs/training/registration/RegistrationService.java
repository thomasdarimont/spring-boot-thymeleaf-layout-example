package de.tdlabs.training.registration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RegistrationService {

  public UserAccount register(RegisterForm form) {
    log.info("Register {}", form);

    UserAccount ua = new UserAccount();
    ua.setFirstname(form.getFirstname());
    ua.setLastname(form.getLastname());
    ua.setEmail(form.getEmail());
    ua.setUsername(form.getUsername());

    return ua;
  }
}
