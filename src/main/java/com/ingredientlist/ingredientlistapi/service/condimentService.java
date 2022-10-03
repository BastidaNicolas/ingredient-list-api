package com.ingredientlist.ingredientlistapi.service;

import com.ingredientlist.ingredientlistapi.modal.condiment;
import com.ingredientlist.ingredientlistapi.repository.condimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class condimentService implements ICondimentService {

    @Autowired
    private condimentRepository condRepository;

    @Override
    public List<condiment> getCondiments() {
        List<condiment> condList = condRepository.findAll();
        return condList;
    }

    @Override
    public condiment getCondiment(Long id) {
        return condRepository.findById(id).orElse(null);
    }

    @Override
    public List<condiment> getCeliacCondiments(Boolean celiac) {
        List<condiment> glutenList = condRepository.findByCeliac(celiac);
        return glutenList;
    }

    @Override
    public void addCondiment(condiment cond) {
        condRepository.save(cond);
    }

    @Override
    public void removeCondiment(Long id) {
        condRepository.deleteById(id);
    }
}
