package com.pariwarTest.pariwarTest.restController;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class UserController {
  // this api is for signup form data schema
  @GetMapping("/newUser")
  public String  UserRegister(){
    final String hardcodedCountriesList =
            "   {\n" +
                    "       \"userId\": \"8ff0483a-0464-41fc-8ed4-41b683c063d7\",\n" +
                    "       \"userGender\": \"male\",\n" +
                    "       \"userDobYear\": \"02-02-1999\",\n" +
                    "       \"fullName\": \"Saket Kumar\"\n" +
            "    }\n" ;


    return  hardcodedCountriesList;
  }
 // this api for login user but note this api to be added in other controller.
  @GetMapping("/login")
  public String UserLogin() {
    final String hardcodedCountriesList =
            "   {\n" +
                    "       \"username\": \"saket\",\n" +
                    "       \"password\": \"saketKumar\"\n" +
                    "   }\n" ;

    return  hardcodedCountriesList;
  }
  // this api is for checkusername is available or not if not then show the proper message
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
