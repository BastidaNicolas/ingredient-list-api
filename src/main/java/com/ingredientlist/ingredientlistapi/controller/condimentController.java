package com.ingredientlist.ingredientlistapi.controller;

import com.ingredientlist.ingredientlistapi.modal.condiment;
import com.ingredientlist.ingredientlistapi.service.ICondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class condimentController {
    @Autowired
    private ICondimentService interCondiment;

    @GetMapping("/condiments")
    public List<condiment> getCondiments(){
        return interCondiment.getCondiments();
    }
    @GetMapping("/condiments/{id}")
    public condiment getCondiment(
            @PathVariable Long id
    ){
        return interCondiment.getCondiment(id);
    }
    @GetMapping("/condiments/celiac")
    public List<condiment> getCeliacCondiments(
            @RequestParam Boolean celiac
    ){
        return interCondiment.getCeliacCondiments(celiac);
    }

    @PostMapping("/condiments/add")
    public String addCondiment(@RequestBody condiment cond){
        interCondiment.addCondiment(cond);
        return "Added successfully";
    }
     @PutMapping("/condiment/edit/{id}")
    public condiment editCondiment(
            @PathVariable Long id,
            @RequestParam ("name") String newName,
            @RequestParam ("gluten") Boolean newCeliac
     ){
        condiment cond = interCondiment.getCondiment(id);

        cond.setName(newName);
        cond.setCeliac(newCeliac);

        return cond;
     }
     @DeleteMapping("/condiment/remove/{id}")
     public String removeCondiment(
             @PathVariable Long id
     ){
        interCondiment.removeCondiment(id);
        return "Removed successfully";
     }
}
