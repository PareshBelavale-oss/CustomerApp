package com.emc.facmas.aution.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emc.facmas.aution.dto.CustomerDetailsDto;
import com.emc.facmas.aution.service.AuctionService;

@RestController
public class AuctionController {

	
	 AuctionService auctionService;
	  /**
	   * Instantiates a new account controller.
	   *R
	   * @param accountService the account service
	   */
	  
	  public AuctionController(AuctionService auctionService) {
	    super();
	    this.auctionService = auctionService;
	  }
	  
	 @CrossOrigin
	  @GetMapping(value = "amar/1.0/customer/getCustomerById")
	  public CustomerDetailsDto getAuctionDetails(@RequestParam(name = "customerId") String customerId) {
		
		 return auctionService.getAuctionDetails(customerId);
	  }
	 
	 

}
