package com.app.repository;

import com.app.entities.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<ArticuloEntity, Long> {
}
