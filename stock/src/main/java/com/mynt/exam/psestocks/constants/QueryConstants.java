package com.mynt.exam.psestocks.constants;

/**
 * Query constants used by the StockRepository interface.
 * 
 * @author acalaras
 *
 */
public class QueryConstants {

	// Stock list queries.
	public static final String QUERY_ALL_STOCKS_WITH_SYMBOL = "SELECT s1.id, s1.name, s1.price, s1.percent_change, s1.volume, s1.symbol, s1.as_of FROM Stock s1 WHERE s1.symbol = ?1";

	// Single stock queries.
	public static final String QUERY_PRICE_TIMESTAMP_WITH_SYMBOL = "SELECT s1.price, s1.as_of FROM Stock s1 WHERE s1.symbol = ?1";
	public static final String QUERY_STOCK_WITH_SYMBOL_AND_TIMESTAMP = "SELECT s1.id, s1.name, s1.price, s1.percent_change, s1.volume, s1.symbol, s1.as_of FROM Stock s1 WHERE s1.symbol = ?1 AND s1.as_of = ?2";
	public static final String QUERY_LATEST_STOCK_TIMESTAMP_WITH_SYMBOL = "SELECT MAX(s2.as_of) FROM Stock s2 WHERE s2.symbol = ?1";
	public static final String QUERY_LATEST_STOCK_WITH_SYMBOL = "SELECT s1.id, s1.name, s1.price, s1.percent_change, s1.volume, s1.symbol, s1.as_of FROM Stock s1 WHERE s1.symbol = ?1 AND s1.as_of = ("
			+ QUERY_LATEST_STOCK_TIMESTAMP_WITH_SYMBOL + ")";

}
