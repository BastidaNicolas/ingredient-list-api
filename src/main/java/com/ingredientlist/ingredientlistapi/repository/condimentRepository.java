package com.ingredientlist.ingredientlistapi.repository;

import com.ingredientlist.ingredientlistapi.modal.condiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface condimentRepository extends JpaRepository<condiment, Long> {
    List<condiment> findByCeliac(Boolean celiac);
}
