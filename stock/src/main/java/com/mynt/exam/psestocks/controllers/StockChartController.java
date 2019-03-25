package com.mynt.exam.psestocks.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mynt.exam.psestocks.controllers.adapters.StockAdapter;
import com.mynt.exam.psestocks.controllers.dto.StockDto;
import com.mynt.exam.psestocks.models.Stock;
import com.mynt.exam.psestocks.services.StockOperation;

import ch.qos.logback.classic.Logger;

@Controller
public class StockChartController {

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(StockChartController.class);

	private final StockOperation stockOperation;
	private final StockAdapter stockAdapter;

	@Autowired
	public StockChartController(StockOperation stockOperation, StockAdapter stockAdapter) {
		this.stockOperation = stockOperation;
		this.stockAdapter = stockAdapter;
	}

	@RequestMapping(value = "/linechart", method = RequestMethod.GET)
	public String getLineChartPage(@RequestParam String symbol) {
		LOGGER.debug("Received get stock line chart page request for symbol {}.", symbol);

		if (symbol.equals("JFC")) {
			return "jfc_line_chart.html";
		}

		if (symbol.equals("BPI")) {
			return "bpi_line_chart.html";
		}

		LOGGER.debug("{} stock chart not available.", symbol);

		return "stock_chart_unavailable.html";

	}

	// To fix implementation.
	@RequestMapping(value = "/chartdata", method = RequestMethod.GET)
	public StockDto getChartData(@RequestParam String symbol) {
		LOGGER.debug("Received get stock chart data request for symbol {}.", symbol);

		Stock stock = stockOperation.retrieveStockChartData(symbol);

		return stockAdapter.apply(stock);
	}

}
