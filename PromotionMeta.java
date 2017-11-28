package com.example.demo.domain;

import java.util.Collection;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by vananthraman on 11/19/17.
 */
@Entity
public abstract class PromotionMeta {
    @Id
    private String promotionMetadataId;

    public String getPromotionMetadataId() {
        return promotionMetadataId;
    }

    public void setPromotionMetadataId(String promotionMetadataId) {
        this.promotionMetadataId = promotionMetadataId;
    }
}
