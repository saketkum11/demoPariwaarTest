package com.pariwarTest.pariwarTest.restController;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class UserController {
  @GetMapping("/newUser")
  public String  UserRegister(){
    final String hardcodedCountriesList =
            "   {\n" +
                    "       \"username\": \"saket\",\n" +
                    "       \"email\": \"kumarsaket601@gmail.com\",\n" +
                    "       \"gender\": \"male\",\n" +
                    "       \"dateOfBirth\": \"02-02-1999\",\n" +
                    "       \"password\": \"saketKumar\",\n" +
                    "       \"confirmPassword\": \"saketKumar\",\n"+
                    "       \"fullName\": \"Saket Kumar\"\n" +
            "    }\n" ;


    return  hardcodedCountriesList;
  }

  @GetMapping("/login")
  public String UserLogin() {
    final String hardcodedCountriesList =
            "   {\n" +
                    "       \"username\": \"saket\",\n" +
                    "       \"password\": \"saketKumar\"\n" +
                    "   }\n" ;

    return  hardcodedCountriesList;
  }
  @PostMapping("/checkUsername")
  public String CheckUsername(){
    final String hardcodedCheckUserAvailableList =
            "   {\n" +
                    "       \"username\": \"testing\",\n" +
                    "       \"message\": \"Username [testing] already taken.\",\n" +
                    "       \"usernameAlreadyTaken\": \"true\"\n" +
                    "   }\n" ;
    return hardcodedCheckUserAvailableList;
  }


}
