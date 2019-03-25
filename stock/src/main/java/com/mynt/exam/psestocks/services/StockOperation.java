package com.mynt.exam.psestocks.services;

import java.util.List;

import com.mynt.exam.psestocks.models.Stock;

/**
 * Stock operation interface provides the operations for
 * retrieving stocks from the underlying repository.
 */
public interface StockOperation {

	/**
	 * Retrieves all stocks.
	 * 
	 * @author acalaras
	 */
	List<Stock> retrieveAllStocks();

	/**
	 * Retrieves a stock's chart data.
	 * 
	 * @param symbol
	 * @return All price and timestamp data of a stock.
	 * @author acalaras
	 */
	Stock retrieveStockChartData(String symbol);

	/**
	 * Retrieves all stocks with given symbol.
	 * 
	 * @param symbol
	 * @return All stocks with the given symbol.
	 * @author acalaras
	 */
	List<Stock> retrieveAllStocks(String symbol);

	/**
	 * Retrieves a single stock given a symbol.
	 *
	 * @param symbol
	 * @return A single stock given a symbol.
	 * @author acalaras
	 */
	Stock retrieveStock(String symbol);

	/**
	 * Retrieves a single stock given a symbol and timestamp.
	 *
	 * @param symbol
	 * @param asOf
	 * @return A single stock given a symbol and timestamp.
	 * @author acalaras
	 */
	Stock retrieveStock(String symbol, String asOf);

}
