package com.example.demo.RequestObject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by vananthraman on 11/19/17.
 */
public class PromotionCreateRequestObj implements Serializable {

    public double couponAmount;
    public String couponCurrency;
    public String promotionName;
    public double budget;
    public String promotionType;
    public Date promotionStartDate;
    public Date promotionEndDate;
    public String marketingCarrier;
    public String promotionStatus;
    public List<Route> listOfRoutes;


}
