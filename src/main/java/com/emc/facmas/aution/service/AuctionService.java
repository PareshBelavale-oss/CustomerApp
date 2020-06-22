package com.emc.facmas.aution.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emc.facmas.aution.dto.CustomerDetailsDto;
import com.emc.facmas.aution.entities.CustomerDetails;
import com.emc.facmas.aution.repository.AuctionRepository;




@Service
public class AuctionService {



  /** The account repo. */
  @Autowired
  AuctionRepository auctionRepository;

  @Autowired
  private ModelMapper modelMapper;
  
  public CustomerDetailsDto getAuctionDetails(String auctionId) {
   
	  CustomerDetailsDto auctionDto  = new CustomerDetailsDto();
	  
	  auctionDto.setCustomerId(new Long(123));
	  auctionDto.setCustomerName("TEST");
	  auctionDto.setCustomerResult("REVIEW");
	  auctionDto.setCustomerType("SAVING");
	  auctionDto.setCustomerStatus("ACTIVE");
	 //Optional<CustomerDetails> auctionOpt =  auctionRepository.findById(Long.valueOf(auctionId));
	 //CustomerDetailsDto auctionDto = modelMapper.map(auctionOpt.get(), CustomerDetailsDto.class);
	 return auctionDto;
    }
    

  }

  

