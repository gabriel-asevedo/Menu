package com.project.menu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.menu.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
