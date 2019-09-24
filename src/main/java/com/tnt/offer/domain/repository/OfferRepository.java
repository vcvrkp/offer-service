package com.tnt.offer.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.offer.domain.Offer;

public interface OfferRepository extends JpaRepository<Offer, Integer> {
    
    List<Offer> findByOrganizationId(Integer organizationId);
}
