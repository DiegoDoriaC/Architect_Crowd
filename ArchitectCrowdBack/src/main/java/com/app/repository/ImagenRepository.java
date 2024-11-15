package com.app.repository;

import com.app.entities.ImagenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepository extends JpaRepository<ImagenEntity, Long> {
}
