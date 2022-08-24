package com.webapp.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.webapp.model.PurchaseInfo;

public class PurchaseInfoRepo {

	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate gethiberHibernateTemplate() {
		return hibernateTemplate;
		
	}
	public void serHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
		
	}
	
	@SuppressWarnings("deprecation")
	public List<PurchaseInfo>getReport(){
		
		@SuppressWarnings("unchecked")
		List<PurchaseInfo> report = (List<PurchaseInfo>) hibernateTemplate.find("from PurchaseInfo order by purchaseProductName,purchaseDate ");
	return report;
	}
}
