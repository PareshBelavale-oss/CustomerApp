package com.emc.facmas.aution.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.emc.facmas.aution.entities.Auction;
import com.emc.facmas.aution.entities.CustomerDetails;


/**
 * The Interface AacCodeRepository.
 */
public interface AuctionRepository extends CrudRepository<CustomerDetails, Long> {

 
	
}
