DROP TABLE IF EXISTS participant;

DROP TABLE IF EXISTS facility;


	CREATE TABLE facility (
	  id INT AUTO_INCREMENT PRIMARY KEY,
	  name VARCHAR(30) NOT NULL,
	  facility_code VARCHAR(30) NOT NULL,
	  deal_code VARCHAR(30) NOT NULL,
	  amount INT NOT NULL,
	  devise INT NOT NULL

	);

	CREATE TABLE participant (
      id INT AUTO_INCREMENT PRIMARY KEY,
      facility_code VARCHAR(30) NOT NULL,
      name VARCHAR(30) NOT NULL,
      calendar VARCHAR(30) NOT NULL,
      percentage INT NOT NULL,

      FOREIGN KEY(facility_code) REFERENCES facility(facility_code)
    );



	INSERT INTO facility (name, facility_code, deal_code, amount, devise) VALUES
	  ('Facilité 1', 'F123456', 'L123456', 100000, 2),
	  ('Facilité 2', 'F654321', 'L654321', 60000, 2),
	  ('Facilité 3', 'F321654', 'L321654', 40000, 2);

	INSERT INTO participant (facility_code, name, calendar, percentage) VALUES
	  ('F123456', 'SG_Paris', '28/10/2020', 50),
	  ('F123456', 'SG_Versailles', '28/10/2020', 25),
	  ('F123456', 'SG_Arcueil', '28/10/2020', 25);