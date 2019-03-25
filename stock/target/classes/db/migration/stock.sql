CREATE TABLE IF NOT EXISTS
    stock
    (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name VARCHAR NOT NULL,
		price NUMERIC NOT NULL,
		percent_change NUMERIC NOT NULL,
		volume NUMERIC NOT NULL,
		symbol VARCHAR NOT NULL,
        as_of DATETIME NOT NULL
    );

INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '79.75', '-1.60', '2535750', 'BPI', '2018-09-27 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '259.00', '-2.70', '804170', 'JFC', '2018-09-27 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '83.30', '4.45', '3277500', 'BPI', '2018-09-28 08:00:00.000');  
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '257.00', '-0.77', '605490', 'JFC', '2018-09-28 08:00:00.000'); 
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '83.50', '0.24', '2529350', 'BPI', '2018-10-01 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '252.00', '-1.95', '394210', 'JFC', '2018-10-01 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '82.35', '-1.38', '879510', 'BPI', '2018-10-02 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '250.00', '-0.79', '913210', 'JFC', '2018-10-02 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '81.10', '-1.52', '1216880', 'BPI', '2018-10-03 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '252.00', '0.80', '393580', 'JFC', '2018-10-03 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '80.50', '-0.74', '878960', 'BPI', '2018-10-04 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '252.00', '0.00', '359360', 'JFC', '2018-10-04 08:00:00.000');  
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '81.00', '0.62', '1875840', 'BPI', '2018-10-05 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '247.00', '-1.98', '897790', 'JFC', '2018-10-05 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '81.90', '1.11', '490600', 'BPI', '2018-10-08 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '243.00', '-1.62', '927610', 'JFC', '2018-10-08 08:00:00.000'); 
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '82.10', '0.24', '759420', 'BPI', '2018-10-09 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '252.40', '3.87', '427280', 'JFC', '2018-10-09 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '81.90', '-0.24', '1794680', 'BPI', '2018-10-11 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '254.00', '0.63', '1377630', 'JFC', '2018-10-11 08:00:00.000');
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '81.90', '0.00', '683830', 'BPI', '2018-10-11 08:00:00.000');  
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '254.00', '0.00', '490960', 'JFC', '2018-10-11 08:00:00.000'); 
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Bank of The Philippine Islands', '81.20', '-0.85', '1488610', 'BPI', '2018-10-12 08:00:00.000');	
INSERT INTO stock (name, price, percent_change, volume, symbol, as_of)
  VALUES ('Jollibee Foods Corporation', '262.00', '3.15', '440520', 'JFC', '2018-10-12 08:00:00.000');
