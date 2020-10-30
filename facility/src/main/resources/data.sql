DROP TABLE IF EXISTS facility;

	CREATE TABLE facility (
	  id INT AUTO_INCREMENT  PRIMARY KEY,
	  name VARCHAR(30) NOT NULL,
	  facility_code VARCHAR(30) NOT NULL,
	  deal_code VARCHAR(30) NOT NULL,
	  amount INT NOT NULL,
	  devise INT NOT NULL

	);

	INSERT INTO facility (name, facility_code, deal_code, amount, devise) VALUES
	  ('Facilité 1', 'F123456', 'L123456', 100000, 2),
	  ('Facilité 2', 'F654321', 'L654321', 60000, 2),
	  ('Facilité 3', 'F321654', 'L321654', 40000, 2);