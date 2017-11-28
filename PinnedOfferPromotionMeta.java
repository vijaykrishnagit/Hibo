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
@Table(name = "pinnedofferpromotionmeta", schema="promotion")
public class PinnedOfferPromotionMeta extends PromotionMeta{

    @OneToMany
    private Collection<PromotionFact> promotionFacts = new ArrayList<PromotionFact>();

    public Collection<PromotionFact> getPromotionFacts() {
        return promotionFacts;
    }

    public void setPromotionFacts(Collection<PromotionFact> promotionFacts) {
        this.promotionFacts = promotionFacts;
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

    private String promotionCampaignString;

    private String promotionCampaignHeaderString;

    public String getPromotionCampaignString() {
        return promotionCampaignString;
    }

    public void setPromotionCampaignString(String promotionCampaignString) {
        this.promotionCampaignString = promotionCampaignString;
    }

    public String getPromotionCampaignHeaderString() {
        return promotionCampaignHeaderString;
    }

    public void setPromotionCampaignHeaderString(String promotionCampaignHeaderString) {
        this.promotionCampaignHeaderString = promotionCampaignHeaderString;
    }
}
