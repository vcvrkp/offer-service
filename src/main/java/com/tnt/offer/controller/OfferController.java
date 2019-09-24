package com.tnt.offer.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.offer.domain.Offer;
import com.tnt.offer.domain.OfferCost;
import com.tnt.offer.domain.OfferRole;
import com.tnt.offer.domain.repository.OfferCostRepository;
import com.tnt.offer.domain.repository.OfferRepository;
import com.tnt.offer.domain.repository.OfferRoleRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/offers")
@Api(value = "offers", tags = "offers")
public class OfferController {
    private final Logger LOGGER = LoggerFactory.getLogger(OfferController.class);

    @Autowired
    OfferRepository offerRepository;

    @Autowired
    OfferRoleRepository offerRoleRepository;

    @Autowired
    OfferCostRepository offerCostRepository;

    @GetMapping
    @ApiOperation(value = "Fetches all offers", nickname = "getOffers")
    public List<Offer> getOffers(@RequestParam(required = false) Integer orgId) {
        LOGGER.info("Fetching offers getOffers() OrgId : " + orgId);
        if (orgId != null && orgId > 0) {
            return offerRepository.findByOrganizationId(orgId);
        }
        return offerRepository.findAll();
    }

    @GetMapping(value="/{offerId}")
    @ApiOperation(value = "Fetches a single Offer by Id", nickname = "getOffer")
    public Offer getOffer(@PathVariable Integer offerId) {
        LOGGER.info("Fetching offer by Id : " + offerId);
        return offerRepository.findById(offerId).orElse(null);
    }

    @PostMapping
    @ApiOperation(value = "Creates Offer", nickname = "createProject")
    public Offer createOffer(@Valid @RequestBody(required = true) Offer offerForm) {
        LOGGER.info("Creating Offer with Name " + offerForm.getTitle());
        Offer offer = new Offer();
        BeanUtils.copyProperties(offerForm, offer);
        offerRepository.save(offer);
        LOGGER.info("Organization Created with Id " + offer.getId());
        return offer;
    }

    @GetMapping(value = "/{offerId}/roles")
    @ApiOperation(value = "Fetces all roles of the offer.", nickname = "getRoles")
    public List<OfferRole> getRoles(@PathVariable Integer offerId) {
        List<OfferRole> list = offerRoleRepository.findByOfferId(offerId);
        return list;
    }

    @PostMapping(value = "/{offerId}/roles")
    @ApiOperation(value = "Creates a role in offer.", nickname = "createRole")
    public OfferRole createRole(@PathVariable Integer offerId, @RequestBody OfferRole role) {
        role.setOfferId(offerId);
        offerRoleRepository.save(role);
        return role;
    }

    @GetMapping(value = "/{offerId}/costs")
    @ApiOperation(value = "Fetces all roles of the project.", nickname = "getCosts")
    public List<OfferCost> getCosts(@PathVariable Integer offerId) {
        List<OfferCost> list = offerCostRepository.findByOfferId(offerId);
        return list;
    }

    @PostMapping(value = "/{offerId}/costs")
    @ApiOperation(value = "Creates a role in project.", nickname = "createCost")
    public OfferCost createCost(@PathVariable Integer offerId, @RequestBody OfferCost cost) {
        cost.setOfferId(offerId);
        offerCostRepository.save(cost);
        return cost;
    }

}
