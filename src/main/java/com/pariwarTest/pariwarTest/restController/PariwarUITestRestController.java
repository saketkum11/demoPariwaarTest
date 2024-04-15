package com.pariwarTest.pariwarTest.restController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PariwarUITestRestController {
    @GetMapping("/metadata/address/countries")
    public String getAllCountries(Model model) {
        final String hardcodedCountriesList = "[\n" +
                "   {\n" +
                "       \"countryId\": 1,\n" +
                "       \"countryName\": \"India\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"countryId\": 2,\n" +
                "       \"countryName\": \"Pakistan\"\n" +
                "   }\n" +
                "]\n";
        return  hardcodedCountriesList;
    }

    @GetMapping("/metadata/address/country/{countryId}")
    public String getAllStatesForCountryId(Model model, @PathVariable("countryId") int countryId) {
        final String hardcodedStatesForIndiaList = "[\n" +
                "   {\n" +
                "       \"stateId\": 13,\n" +
                "       \"stateName\": \"Andaman And Nicobar Islands\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"stateId\": 47,\n" +
                "       \"stateName\": \"Uttarakhand\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"stateId\": 49,\n" +
                "       \"stateName\": \"ladakh\"\n" +
                "   }\n" +
                "]\n";
        final String hardcodedStatesForUSAList = "[\n" +
                "   {\n" +
                "       \"stateId\": 100,\n" +
                "       \"stateName\": \"Massachusetts\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"stateId\": 101,\n" +
                "       \"stateName\": \"Washington\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"stateId\": 102,\n" +
                "       \"stateName\": \"Texas\"\n" +
                "   }\n" +
                "]\n";

        return switch (countryId) {
            case 1 -> //India
                    hardcodedStatesForIndiaList;
            case 10 -> //Usa
                    hardcodedStatesForUSAList;
            default -> "[]"; //Empty list
        };
    }
  // note this api is for country state list
    @GetMapping("/metadata/address/country/{countryId}/states")
    public String getAllStatesOfCountry(Model model, @PathVariable("countryId") int countryId){
        final String  hardCodedStateList = "[\n" +
                "   {\n" +
                "       \"stateId\": 13,\n" +
                "       \"stateName\": \"Andaman And Nicobar Islands\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"stateId\": 47,\n" +
                "       \"stateName\": \"Uttarakhand\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"stateId\": 49,\n" +
                "       \"stateName\": \"ladakh\"\n" +
                "   }\n" +
                "]\n";

        return  hardCodedStateList;
    }
    // Note this is how we can keep hard coding the response for requests.

    // api response for to get state districts data
    @GetMapping("/metadata/address/state/{stateId}/districts")
    public String UserDistrict(Model model, @PathVariable("stateId") int stateId){
        final String  hardCodedThridList = "[\n" +
                "   {\n" +
                "       \"districtId\": 19,\n" +
                "       \"districtName\": \"Nicobar\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"districtId\": 20,\n" +
                "       \"districtName\": \"North and Middle Andaman\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"districtId\": 23,\n" +
                "       \"districtName\": \"South Andaman\"\n" +
                "   }\n" +
                "]\n";
        final String hardCodedDistrictsSecondList = "[\n" +
                "   {\n" +
                "       \"districtId\": 13,\n" +
                "       \"districtName\": \"Andaman And Nicobar Islands\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"districtId\": 47,\n" +
                "       \"districtName\": \"Uttarakhand\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"districtId\": 49,\n" +
                "       \"districtName\": \"ladakh\"\n" +
                "   }\n" +
                "]\n";
        return switch (stateId){
            case 1 -> hardCodedDistrictsSecondList;
            case 2 -> hardCodedThridList ;
            default -> "[]";

        };

    }
    // This API can be used to get tehsils date of every district
    @GetMapping("/metadata/address/district/{districtId}/tehsils")
    public String UserTehsils(Model model, @PathVariable("districtId") int districtId){
        final String  hardCodedSecondTehsilList = "[\n" +
                "   {\n" +
                "       \"tehsilId\": 3,\n" +
                "       \"tehsilName\": \"Nicobar \"\n" +
                "   },\n" +
                "   {\n" +
                "       \"tehsilId\": 13,\n" +
                "       \"tehsilName\": \"Uttarakhand\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"tehsilId\": 24,\n" +
                "       \"tehsilName\": \"Loni\"\n" +
                "   }\n" +
                "]\n";
        final String  hardCodedFirstTehsilList = "[\n" +
                "   {\n" +
                "       \"tehsilId\": 13,\n" +
                "       \"tehsilName\": \"Andaman And Nicobar Islands\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"tehsilId\": 47,\n" +
                "       \"tehsilName\": \"Uttarakhand\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"tehsilId\": 49,\n" +
                "       \"tehsilName\": \"ladakh\"\n" +
                "   }\n" +
                "]\n";

        return  switch (districtId){
            case 1 -> hardCodedFirstTehsilList;
            case 2 -> hardCodedSecondTehsilList;
            default -> "[]";
        };
    }
    // api for to get tehsils village address
    @GetMapping("/metadata/address/tehsil/{tehsilId}/villages")
    public String UserVillageAddress(Model model, @PathVariable("tehsilId") int tehsilId){
         final  String hardCodedFirstTehsil = "[\n" +
                 "   {\n" +
                 "       \"villageTownId\": 13,\n" +
                 "       \"villageTownName\": \"Kimios Village New\"\n" +
                 "   },\n" +
                 "   {\n" +
                 "       \"villageTownId\": 47,\n" +
                 "       \"villageTownName\": \"Alrong\"\n" +
                 "   },\n" +
                 "   {\n" +
                 "       \"villageTownId\": 49,\n" +
                 "       \"villageTownName\": \"Teetop\"\n" +
                 "   }\n" +
                 "]\n";
       final String hardcodedSecondTehshil = "[\n" +
               "   {\n" +
               "       \"villageTownId\": 13,\n" +
               "       \"villageTownName\": \"nagarpur\"\n" +
               "   },\n" +
               "   {\n" +
               "       \"villageTownId\": 47,\n" +
               "       \"villageTownName\": \"sarojani nagar\"\n" +
               "   },\n" +
               "   {\n" +
               "       \"villageTownId\": 49,\n" +
               "       \"villageTownName\": \"mukharjeenagar\"\n" +
               "   }\n" +
               "]\n";
         return switch (tehsilId){
             case 1 -> hardCodedFirstTehsil;
             case 2 -> hardcodedSecondTehshil;
             default -> "[]";
         };
    }


}
