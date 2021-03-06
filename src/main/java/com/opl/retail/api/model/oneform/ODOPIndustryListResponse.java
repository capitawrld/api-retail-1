/**
 * 
 */
package com.opl.retail.api.model.oneform;

/**
 * @author nilay.darji
 *
 */
public class ODOPIndustryListResponse {
	
	private Long id;
	private String name;
	private Long amount;
	private Boolean isTick = false;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Boolean getIsTick() {
		return isTick;
	}
	public void setIsTick(Boolean isTick) {
		this.isTick = isTick;
	}
	
}
