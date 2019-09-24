package com.tnt.offer.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.offer.domain.OfferRole;

public interface OfferRoleRepository extends JpaRepository<OfferRole, Integer> {
    
    List<OfferRole> findByOfferId(Integer offerId);
}
