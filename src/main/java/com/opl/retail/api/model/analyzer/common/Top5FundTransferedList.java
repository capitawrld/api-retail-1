package com.opl.retail.api.model.analyzer.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Top5FundsTransferred")
@XmlAccessorType(XmlAccessType.FIELD)
public class Top5FundTransferedList {
	
	@XmlElement(name = "Item")
	private List<Item> item;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Top5FundTransferedList(List<Item> item) {
		this.item = item;
	}

	public Top5FundTransferedList() {
		super();
	}
	
	
	
	
	
	
	
}
