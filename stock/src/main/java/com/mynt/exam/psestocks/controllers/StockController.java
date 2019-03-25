package com.mynt.exam.psestocks.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mynt.exam.psestocks.controllers.adapters.StockAdapter;
import com.mynt.exam.psestocks.controllers.dto.StockDto;
import com.mynt.exam.psestocks.models.Stock;
import com.mynt.exam.psestocks.services.StockOperation;

/**
 * Provides the stock REST operations.
 * 
 * @author acalaras
 */
@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);

	private final StockOperation stockOperation;
	private final StockAdapter stockAdapter;

	@Autowired
	public StockController(StockOperation stockOperation, StockAdapter stockAdapter) {
		this.stockOperation = stockOperation;
		this.stockAdapter = stockAdapter;
	}

	@GetMapping
	public List<StockDto> getAllStocks() {
		LOGGER.debug("Received get all stock request.");

		List<Stock> stockList = stockOperation.retrieveAllStocks();
		List<StockDto> stockDtoList = new ArrayList<StockDto>();

		for (Stock stock : stockList) {
			stockDtoList.add(stockAdapter.apply(stock));
		}

		return stockDtoList;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<StockDto> getAllStocks(@RequestParam String symbol) {
		LOGGER.debug("Received get all stock with symbol {} request.", symbol);

		List<Stock> stockList = stockOperation.retrieveAllStocks(symbol);
		List<StockDto> stockDtoList = new ArrayList<StockDto>();

		for (Stock stock : stockList) {
			stockDtoList.add(stockAdapter.apply(stock));
		}

		return stockDtoList;
	}

	@RequestMapping(value = "/stock/latest", method = RequestMethod.GET)
	public StockDto getLatestStock(@RequestParam String symbol) {
		LOGGER.debug("Received get stock request for symbol {}.", symbol);

		Stock stock = stockOperation.retrieveStock(symbol);

		return stockAdapter.apply(stock);
	}

	@RequestMapping(value = "/stock/specific", method = RequestMethod.GET)
	public StockDto getLatestStock(@RequestParam String symbol, @RequestParam String asOf) {
		LOGGER.debug("Received get stock request for symbol {} and timestamp {}.", symbol, asOf);

		Stock stock = stockOperation.retrieveStock(symbol, asOf);

		return stockAdapter.apply(stock);
	}

}
