package com.example.demo.repository;

import com.example.demo.domain.PinnedOfferPromotionMeta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vananthraman on 11/27/17.
 */
@Repository
public interface PinnedOfferPromotionMetaRepository extends CrudRepository<PinnedOfferPromotionMeta, String> {
}
