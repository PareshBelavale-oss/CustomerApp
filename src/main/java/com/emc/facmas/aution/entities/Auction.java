package com.emc.facmas.aution.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMC_FCMAS_AUCTION")
public class Auction {

	// Auction Name
	// • Auction Type (Base or Rebalancing)
	// • Delivery Time Frame (From Date, To Date)
	// Auction Status
	// Auction Result
	
	// INSERT INTO EMC_FCMAS_AUCTION(AUCTION_ID,AUCTION_NAME,AUCTION_TYPE,AUCTION_STATUS,AUCTION_RESULT)
	//VALUES(1,'EMC_ENERGY01_AUCTION','BASE','ACTIVE','PUBLISH');
	@Id
	@Column(name = "AUCTION_ID", nullable = false, updatable = false, insertable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long auctionId;

	@Column(name = "AUCTION_NAME")
	private String auctionName;

	@Column(name = "AUCTION_TYPE")
	private String auctionType;

	@Column(name = "AUCTION_STATUS")
	private String auctionStatus;

	@Column(name = "AUCTION_RESULT")
	private String auctionResult;

	public Long getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionName() {
		return auctionName;
	}

	public void setAuctionName(String auctionName) {
		this.auctionName = auctionName;
	}

	public String getAuctionType() {
		return auctionType;
	}

	public void setAuctionType(String auctionType) {
		this.auctionType = auctionType;
	}

	public String getAuctionStatus() {
		return auctionStatus;
	}

	public void setAuctionStatus(String auctionStatus) {
		this.auctionStatus = auctionStatus;
	}

	public String getAuctionResult() {
		return auctionResult;
	}

	public void setAuctionResult(String auctionResult) {
		this.auctionResult = auctionResult;
	}

}
