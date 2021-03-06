package  kuba.apka.com.demo.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthenticationController {


   @GetMapping("/basic/auth")
   public AuthenticationBean authenticationBean() {
       return new AuthenticationBean("You are authenticated");
   }

}
