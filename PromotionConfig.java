package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by vananthraman on 11/20/17.
 */
@Entity
@Table(name="promotionconfig", schema = "promotion")
public class PromotionConfig {
    @Id
    @GeneratedValue
    private int promotionConfigId;

    private int tpid;
    private int eapid;
    private String origin;
    private String destination;
    private String tripType;
    private String pathType;

    public int getPromotionConfigId() {
        return promotionConfigId;
    }

    public void setPromotionConfigId(int promotionConfigId) {
        this.promotionConfigId = promotionConfigId;
    }

    public int getTpid() {
        return tpid;
    }

    public void setTpid(int tpid) {
        this.tpid = tpid;
    }

    public int getEapid() {
        return eapid;
    }

    public void setEapid(int eapid) {
        this.eapid = eapid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getPathType() {
        return pathType;
    }

    public void setPathType(String pathType) {
        this.pathType = pathType;
    }
}
