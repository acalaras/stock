package com.mynt.exam.psestocks.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynt.exam.psestocks.models.Stock;
import com.mynt.exam.psestocks.repositories.StockRepository;

@Service
public class StockService implements StockOperation {

	private static final Logger LOGGER = LoggerFactory.getLogger(StockService.class);

	private final StockRepository stockRepository;

	@Autowired
	public StockService(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	@Override
	public List<Stock> retrieveAllStocks() {
		LOGGER.debug("Retrieving all stocks.");

		return stockRepository.findAll();
	}

	@Override
	public List<Stock> retrieveAllStocks(String symbol) {
		LOGGER.debug("Retrieving all stocks with symbol {}.", symbol);

		return stockRepository.findAllStocks(symbol);
	}

	@Override
	public Stock retrieveStock(String symbol) {
		LOGGER.debug("Retrieving stock with symbol {}.", symbol);

		Stock stock = stockRepository.findLatestStock(symbol);

		// Return stock details if it exists.
		return validateStock(stock, symbol);
	}

	@Override
	public Stock retrieveStockChartData(String symbol) {
		LOGGER.debug("Retrieving stock chart data for symbol {}.", symbol);

		Stock stock = stockRepository.findStockChartData(symbol);

		// Return stock details if it exists.
		return validateStock(stock, symbol);
	}

	@Override
	public Stock retrieveStock(String symbol, String asOf) {
		LOGGER.debug("Retrieving stock with symbol {} and timestamp {}.", symbol, asOf);

		Stock stock = stockRepository.findStock(symbol, asOf);

		// Return stock details if it exists.
		return validateStock(stock, symbol);
	}

	private Stock validateStock(Stock stock, String symbol) {
		if (stock != null) {
			LOGGER.debug("Found stock {}.", stock.getName());

			return stock;
		} else {
			LOGGER.warn("Could not find any stock with symbol {}.", symbol);

			throw new StockServiceException("Stock not found.");
		}
	}

}
