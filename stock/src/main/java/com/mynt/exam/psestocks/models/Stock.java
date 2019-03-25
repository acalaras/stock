package com.mynt.exam.psestocks.models;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private BigDecimal price;
	private Double percentChange;
	private Integer volume;
	private String symbol;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
	private Date asOf;

	public Stock() {}

	public Stock(String name, BigDecimal price, double percentChange, int volume, String symbol, Date asOf) {
		checkArgument(isNotBlank(name), "Stock name is mandatory.");
		checkArgument(price.doubleValue() > 0, "Stock price should be greater than zero.");
		checkArgument(percentChange <= 0.50 || percentChange >= -0.50, "Stock percent change should be limited from -50% to 50%.");
		checkArgument(volume > 0, "Stock volume should be greater than zero.");
		checkArgument(isNotBlank(symbol), "Stock symbol is mandatory.");
		checkArgument(isNotBlank(asOf.toString()), "Stock timestamp is mandatory.");

		this.name = name;
		this.price = price;
		this.percentChange = percentChange;
		this.volume = volume;
		this.symbol = symbol;
		this.asOf = asOf;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Double getPercentChange() {
		return percentChange;
	}

	public Integer getVolume() {
		return volume;
	}

	public String getSymbol() {
		return symbol;
	}

	// To format to local timezone.
	public Date getAsOf() {
		return asOf;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Stock stock = (Stock) obj;

		// "symbol" uniquely identifies a stock.
		return Objects.equal(symbol, stock.symbol);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(symbol);
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
