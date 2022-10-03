package com.ingredientlist.ingredientlistapi.service;

import com.ingredientlist.ingredientlistapi.modal.condiment;

import java.util.List;

public interface ICondimentService {
    List<condiment> getCondiments();

    condiment getCondiment(Long id);

    List<condiment> getCeliacCondiments(Boolean celiac);

    void addCondiment(condiment cond);

    void removeCondiment(Long id);
}
