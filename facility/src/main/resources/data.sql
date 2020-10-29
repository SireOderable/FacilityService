DROP TABLE IF EXISTS facilities;

	CREATE TABLE facilities (
	  name VARCHAR(250) NOT NULL,
	  felicity_code VARCHAR(30) NOT NULL,
	  deal_code VARCHAR(30) NOT NULL,
	  amount INT NOT NULL,
	  devise VARCHAR(10) NOT NULL,

	  PRIMARY KEY(felicity_code, deal_code)
	);

	INSERT INTO facilities (name, felicity_code, deal_code, amount, devise) VALUES
	  ('Facilité 1', 'F123456', 'F123456', '100000', '€'),
	  ('Facilité 2', 'F654321', 'F654321' ,'60000', '€'),
	  ('Facilité 3', 'F321654', 'F321654', '40000', '€');