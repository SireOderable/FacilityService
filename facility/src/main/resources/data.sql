DROP TABLE IF EXISTS facilities;

	CREATE TABLE facilities (
	  id INT PRIMARY KEY AUTO_INCREMENT,
	  name VARCHAR(250) NOT NULL,
	  code VARCHAR(250) NOT NULL,
	  amount INT NOT NULL,
	  devise VARCHAR(10) NOT NULL
	);

	INSERT INTO facilities (name, code, amount, devise) VALUES
	  ('Facilité 1', 'F123456', '100000', '€'),
	  ('Facilité 2', 'F654321', '60000', '€'),
	  ('Facilité 3', 'F321654', '40000', '€');