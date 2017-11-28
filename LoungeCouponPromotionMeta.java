package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vananthraman on 11/27/17.
 */

@Entity
@Table(name = "loungecouponpromotionmeta", schema = "promotion")
public class LoungeCouponPromotionMeta extends PromotionMeta {

    @OneToMany
    private Collection<PromotionFact> promotionFacts = new ArrayList<PromotionFact>();

    public Collection<PromotionFact> getPromotionFacts() {
        return promotionFacts;
    }

    public void setPromotionFacts(Collection<PromotionFact> promotionFacts) {
        this.promotionFacts = promotionFacts;
    }

    private double couponAmount;

    private String couponCurrency;

    public double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCouponCurrency() {
        return couponCurrency;
    }

    public void setCouponCurrency(String couponCurrency) {
        this.couponCurrency = couponCurrency;
    }

    private Integer abacusExperimentId;

    private String abacusExperimentDescription;

    public Integer getAbacusExperimentId() {
        return abacusExperimentId;
    }

    public void setAbacusExperimentId(Integer abacusExperimentId) {
        this.abacusExperimentId = abacusExperimentId;
    }

    public String getAbacusExperimentDescription() {
        return abacusExperimentDescription;
    }

    public void setAbacusExperimentDescription(String abacusExperimentDescription) {
        this.abacusExperimentDescription = abacusExperimentDescription;
    }


}
