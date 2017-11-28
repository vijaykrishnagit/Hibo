package com.example.demo.repository;

import com.example.demo.domain.LoungeCouponPromotionMeta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vananthraman on 11/27/17.
 */
@Repository
public interface LoungeCouponPromotionMetaRepository extends CrudRepository<LoungeCouponPromotionMeta, String> {
}
