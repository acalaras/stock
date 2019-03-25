package com.mynt.exam.psestocks.controllers.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.MoreObjects;

import java.math.BigDecimal;
import java.sql.Date;

public class StockDto {

	private String name;
	private BigDecimal price;
	private double percentChange;
	private int volume;
	private String symbol;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	private Date asOf;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public double getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Date getAsOf() {
		return asOf;
	}

	public void setAsOf(Date asOf) {
		this.asOf = asOf;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("name", name)
			.add("price", price)
			.add("percentChange", percentChange)
			.add("volume", volume)
			.add("symbol", symbol)
			.add("asOf", asOf)
			.toString();
	}

}
