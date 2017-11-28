package com.example.demo.repository;

import com.example.demo.domain.PromotionConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vananthraman on 11/20/17.
 */
@Repository
public interface PromotionConfigRepository extends CrudRepository<PromotionConfig, Integer> {
}
