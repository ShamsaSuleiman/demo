package com.example.tourisim.repository;

import com.example.tourisim.model.Tourismpackages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface Tourismpackagerepository extends JpaRepository<Tourismpackages,Long> {
    @Query(value = "select sum(cost) from tourismpackages", nativeQuery = true)
    public int getTotalCost();
    
}
