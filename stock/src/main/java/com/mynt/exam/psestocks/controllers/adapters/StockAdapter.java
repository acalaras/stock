package com.mynt.exam.psestocks.controllers.adapters;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.mynt.exam.psestocks.controllers.dto.StockDto;
import com.mynt.exam.psestocks.models.Stock;

/**
 * Converts a Stock from the internal domain into a Stock DTO.
 * 
 * @author acalaras
 */
@Component
public class StockAdapter implements Function<Stock, StockDto> {

	@Override
	public StockDto apply(Stock stock) {
		StockDto stockDto = new StockDto();

		stockDto.setName(stock.getName());
		stockDto.setPrice(stock.getPrice());
		stockDto.setPercentChange(stock.getPercentChange());
		stockDto.setVolume(stock.getVolume());
		stockDto.setSymbol(stock.getSymbol());
		stockDto.setAsOf(stock.getAsOf());

		return stockDto;
	}

}
