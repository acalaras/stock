API:

* getAllStocks() >> http://localhost:8080/api/v1/stocks
* getAllStocks(symbol) >> http://localhost:8080/api/v1/stocks/all?symbol=BPI
* getLatestStock(symbol) >> http://localhost:8080/api/v1/stocks/stock/latest?symbol=JFC
* getLatestStock(symbol, asOf) >> http://localhost:8080/api/v1/stocks/stock/specific?symbol=BPI&asOf=2018-10-03 08:00:00.000
* getLineChartPage(symbol) >> http://localhost:8080/linechart?symbol=BPI