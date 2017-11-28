package com.example.demo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by vananthraman on 11/19/17.
 */
@Entity
@Table(name = "promotionfact", schema = "promotion")
public class PromotionFact {

    @Id
    private String promotionId;
    private double budget;
    private String promotionType;
    private Date promotionStartDate;
    private Date promotionEndDate;
    private String marketingCarrier;
    private String promotionStatus;
    private String promotionName;

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @ManyToOne
    private PromotionMeta promotionMeta;

    @OneToMany
    private Collection<PromotionConfig> promotionConfigList = new ArrayList<>();

    public Collection<PromotionConfig> getPromotionConfigList() {
        return promotionConfigList;
    }

    public void setPromotionConfigList(Collection<PromotionConfig> promotionConfigList) {
        this.promotionConfigList = promotionConfigList;
    }

    public PromotionMeta getPromotionMeta() {
        return promotionMeta;
    }

    public void setPromotionMeta(PromotionMeta promotionMeta) {
        this.promotionMeta = promotionMeta;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Date getPromotionStartDate() {
        return promotionStartDate;
    }

    public void setPromotionStartDate(Date promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }

    public Date getPromotionEndDate() {
        return promotionEndDate;
    }

    public void setPromotionEndDate(Date promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }

    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    public void setMarketingCarrier(String marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    public String getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(String promotionStatus) {
        this.promotionStatus = promotionStatus;
    }


}
