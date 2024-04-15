package com.pariwarTest.pariwarTest.restController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/metadata/religion")
public class ReligionController {
    // note api is to  get all religion list
    @GetMapping("/religions")
    public String getAllReligions(){
        final  String hardCodedReligionList = "[\n" +
                "   {\n" +
                "       \"religionId\": 39376538-6334-3130-3035-376234366339,\n" +
                "       \"religionName\": \"Hindu\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"religionId\": 39376538-6334-3130-3035-376234366337,\n" +
                "       \"religionName\": \"Muslim\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"religionId\":39376538-6334-3130-3035-376234366334,\n" +
                "       \"religionName\": \"Sikh\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"religionId\":39376538-6334-3130-3035-376234366345,\n" +
                "       \"religionName\": \"Christanity\"\n" +
                "   }\n"+
        "]\n";
       return hardCodedReligionList;
    }
    @GetMapping("/{religionId}/castes")
    public String getAllReligionsCaste(Model model, @PathVariable("religionId") int religionId){
        final  String hardCodedHinduCasteList = "[\n" +
                "   {\n" +
                "       \"casteId\": 39376538-6334-3130-3035-376234366339,\n" +
                "       \"casteName\": \"Gurjar\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"casteId\": 39376538-6334-3130-3035-376234366337,\n" +
                "       \"casteName\": \"Rajput\"\n" +
                "   }\n" +
                "]\n";
        final String hardCodedCharistanCasteList = "[\n" +
                "   {\n" +
                "       \"casteId\": 39376538-6334-3130-3035-376234366339,\n" +
                "       \"casteName\": \"John\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"casteId\": 39376538-6334-3130-3035-376234366337,\n" +
                "       \"casteName\": \"orthodox\"\n" +
                "   },\n" +
                "]\n";
        return switch (religionId){
            case 1 ->  hardCodedHinduCasteList;
            case 2 -> hardCodedCharistanCasteList;
            default -> "[]";
        };
    }
    @GetMapping("/{casteId}/subCastes")
    public String getAllReligionsSubcastes(Model model, @PathVariable("casteId") int casteId){
        final  String hardCodedFirstSubCasteList = "[\n" +
                "   {\n" +
                "       \"subCasteId\": 39376538-6334-3130-3035-376234366339,\n" +
                "       \"subCasteName\": \"Kasana\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"subCasteId\": 39376538-6334-3130-3035-376234366337,\n" +
                "       \"subCasteName\": \"Poswal\"\n" +
                "   }\n" +
                "]\n";
        final String hardCodedSecondSubCasteList = "[\n" +
                "   {\n" +
                "       \"subCasteId\": 39376538-6334-3130-3035-376234366339,\n" +
                "       \"subCasteName\": \"John\"\n" +
                "   },\n" +
                "   {\n" +
                "       \"subCasteId\": 39376538-6334-3130-3035-376234366337,\n" +
                "       \"subCasteName\": \"orthodox\"\n" +
                "   },\n" +
                "]\n";
        return switch (casteId){
            case 1 ->  hardCodedFirstSubCasteList;
            case 2 -> hardCodedSecondSubCasteList;
            default -> "[]";
        };
    }
}
