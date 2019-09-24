package com.tnt.offer.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.offer.domain.OfferCost;

public interface OfferCostRepository extends JpaRepository<OfferCost, Integer> {
    
    List<OfferCost> findByOfferId(Integer offerId);
}
