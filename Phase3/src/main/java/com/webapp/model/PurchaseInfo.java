package com.webapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchases")
public class PurchaseInfo implements Serializable {

	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int purchaseId;
	private String purchaseProductName;
	private String purchaseUserEmail;
	private String purchaseDate;
	private int purchasePrice;
	
	public PurchaseInfo() {
		super();
		
	}

	public PurchaseInfo(int purchaseId, String purchaseProductName, String purchaseUserEmail, String purchaseDate,
			int purchasePrice) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseProductName = purchaseProductName;
		this.purchaseUserEmail = purchaseUserEmail;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getPurchaseProductName() {
		return purchaseProductName;
	}

	public void setPurchaseProductName(String purchaseProductName) {
		this.purchaseProductName = purchaseProductName;
	}

	public String getPurchaseUserEmail() {
		return purchaseUserEmail;
	}

	public void setPurchaseUserEmail(String purchaseUserEmail) {
		this.purchaseUserEmail = purchaseUserEmail;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return String.format(
				"PurchaseInfo [purchaseId=%s, purchaseProductName=%s, purchaseUserEmail=%s, purchaseDate=%s, purchasePrice=%s]",
				purchaseId, purchaseProductName, purchaseUserEmail, purchaseDate, purchasePrice);
	
}
}
