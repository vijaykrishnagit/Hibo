package com.example.demo.repository;

import com.example.demo.domain.PromotionFact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vananthraman on 11/19/17.
 */
@Repository
public interface PromotionFactRepository extends CrudRepository<PromotionFact, String> {

}
