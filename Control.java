package com.example.demo.Controller;

import com.example.demo.RequestObject.PromotionCreateRequestObj;
import com.example.demo.RequestObject.Route;
import com.example.demo.domain.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * Created by vananthraman on 11/19/17.
 */
@RestController
@RequestMapping("/promotion")
public class Control {

    @Autowired
    private PromotionFactRepository promotionFactRepository;
    @Autowired
    private HotelCouponPromotionMetaRepository hotelCouponPromotionMetaRepository;
    @Autowired
    private LoungeCouponPromotionMetaRepository loungeCouponPromotionMetaRepository;
    @Autowired
    private PinnedOfferPromotionMetaRepository pinnedOfferPromotionMetaRepository;

    @Autowired
    private PromotionConfigRepository promotionConfigRepository;
//    @PersistenceContext
//    private EntityManager entityManager;



    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @Transactional
    public ResponseEntity<Void> createPromotion(@RequestBody PromotionCreateRequestObj promotionCreateRequestObj){
        HttpStatus status = HttpStatus.OK;
        try{

            PromotionMeta promotionMeta=null;
            String promotionMetaString = UUID.randomUUID().toString();
            HotelCouponPromotionMeta h=null;
            LoungeCouponPromotionMeta l=null;
            PinnedOfferPromotionMeta p = null;
            if(promotionCreateRequestObj.promotionType.equals("HOTEL_COUPON")) {
                h = new HotelCouponPromotionMeta();
                h.setCouponAmount(promotionCreateRequestObj.couponAmount);
                h.setCouponCurrency(promotionCreateRequestObj.couponCurrency);
                h.setPromotionMetadataId(promotionMetaString);
                h.setAbacusExperimentId(15224);
                h.setAbacusExperimentDescription("hotel coupon promotion");
                promotionMeta = (PromotionMeta) h;
            }
            else if(promotionCreateRequestObj.promotionType.equals("FREELOUNGE_COUPON")){
                l = new LoungeCouponPromotionMeta();
                l.setAbacusExperimentDescription("lounge coupon promotion");
                l.setAbacusExperimentId(15446);
                l.setCouponAmount(promotionCreateRequestObj.couponAmount);
                l.setCouponCurrency(promotionCreateRequestObj.couponCurrency);
                l.setPromotionMetadataId(promotionMetaString);
                promotionMeta = (PromotionMeta) l;
            }
            else if(promotionCreateRequestObj.promotionType.equals("PINNED")){
                p = new PinnedOfferPromotionMeta();
                p.setPromotionMetadataId(promotionMetaString);
                p.setAbacusExperimentDescription("pinned offer");
                p.setAbacusExperimentId(14420);
                p.setPromotionCampaignHeaderString("pinned offer campaign hdr string");
                p.setPromotionCampaignString("pinned offer campaign string ");
                promotionMeta = (PromotionMeta) p;
            }






            List<PromotionConfig> listPromoConfig = new ArrayList<>();

            for(Route r: promotionCreateRequestObj.listOfRoutes) {
                PromotionConfig promotionConfig = new PromotionConfig();
                promotionConfig.setOrigin(r.getOrigin());
                promotionConfig.setDestination(r.getDestination());
                promotionConfig.setTpid(r.getTpid());
                promotionConfig.setEapid(r.getEapid());
                promotionConfig.setTripType(r.getTripType());
                promotionConfig.setPathType(r.getPathType());

                listPromoConfig.add(promotionConfig);

            }





            PromotionFact promotionFact = new PromotionFact();
            promotionFact.setPromotionId(UUID.randomUUID().toString());
            promotionFact.setBudget(promotionCreateRequestObj.budget);
            promotionFact.setMarketingCarrier(promotionCreateRequestObj.marketingCarrier);
            promotionFact.setPromotionStartDate(promotionCreateRequestObj.promotionStartDate);
            promotionFact.setPromotionEndDate(promotionCreateRequestObj.promotionEndDate);
            promotionFact.setPromotionStatus("PENDING");
            promotionFact.setPromotionType("HOTEL_COUPONS");
            promotionFact.setPromotionMeta(promotionMeta);
            promotionFact.setPromotionType(promotionCreateRequestObj.promotionType);
            promotionFact.setPromotionConfigList(listPromoConfig);
            promotionFact.setPromotionName(promotionCreateRequestObj.promotionName);



            promotionConfigRepository.save(listPromoConfig);
            if(promotionMeta instanceof HotelCouponPromotionMeta && h != null){
                hotelCouponPromotionMetaRepository.save(h);
            }
            else if(promotionMeta instanceof LoungeCouponPromotionMeta && l != null){
                loungeCouponPromotionMetaRepository.save(l);
            }
            else if(promotionMeta instanceof PinnedOfferPromotionMeta && p != null){
                pinnedOfferPromotionMetaRepository.save(p);
            }

            promotionFactRepository.save(promotionFact);



        }catch(Exception e){
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(status);
    }


}
