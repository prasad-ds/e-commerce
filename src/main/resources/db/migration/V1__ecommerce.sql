CREATE TABLE `products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `stock_number` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `rating` INT NULL,
  `no_of_reviews` INT NULL,
  `actual_price` DOUBLE NOT NULL,
  `discount` INT NULL,
  `discounted_price` DOUBLE NULL,
  `quantity` INT NOT NULL,
  `is_restricted` BOOLEAN DEFAULT FALSE,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE` (`name` ASC),
  UNIQUE INDEX `stock_number_UNIQUE` (`stock_number` ASC));
