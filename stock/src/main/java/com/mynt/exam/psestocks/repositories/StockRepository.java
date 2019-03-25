package com.mynt.exam.psestocks.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mynt.exam.psestocks.constants.QueryConstants;
import com.mynt.exam.psestocks.models.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

	/**
	 * Returns all stock entries with the given symbol.
	 * 
	 * @param symbol The symbol of the stocks being queried.
	 * @return A list of stocks with the given symbol.
	 * @author acalaras
	 */
	@Query(value = QueryConstants.QUERY_ALL_STOCKS_WITH_SYMBOL, nativeQuery = true)
	List<Stock> findAllStocks(String symbol);

	/**
	 * Returns all price and timestamp data of a specific stock.
	 * 
	 * @param symbol The symbol of the stock being queried.
	 * @return All price and timestamp data of a specific stock.
	 * @author acalaras
	 */
	@Query(value = QueryConstants.QUERY_PRICE_TIMESTAMP_WITH_SYMBOL, nativeQuery = true)
	Stock findStockChartData(String symbol);

	/**
	 * Returns a stock at a particular time.
	 * 
	 * @param symbol The symbol of the stock being queried.
	 * @param asOf   The timestamp of the stock being queried.
	 * @return A stock at a particular time.
	 * @author acalaras
	 */
	@Query(value = QueryConstants.QUERY_STOCK_WITH_SYMBOL_AND_TIMESTAMP, nativeQuery = true)
	Stock findStock(String symbol, String asOf);

	/**
	 * Returns a stock with the latest price.
	 * 
	 * @param symbol The symbol of the stock being queried.
	 * @return A stock with the latest price.
	 * @author acalaras
	 */
	@Query(value = QueryConstants.QUERY_LATEST_STOCK_WITH_SYMBOL, nativeQuery = true)
	Stock findLatestStock(String symbol);

	

}
