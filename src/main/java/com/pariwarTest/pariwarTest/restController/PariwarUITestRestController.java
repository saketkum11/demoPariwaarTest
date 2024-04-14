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
                "       \"countryName\": \"Pakistan\",\n" +
                "       \"country\": \"India\"\n" +
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
}
