CREATE TABLE IF NOT EXISTS `offerrejectreason` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(128) CHARACTER SET 'utf8' NOT NULL,
  `description` VARCHAR(1024) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8
COMMENT = 'Causas rechazo de ofertas';


CREATE TABLE IF NOT EXISTS `offer` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(128) CHARACTER SET 'utf8' NOT NULL,
  `description` VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `userId` INT(11) NOT NULL,
  `organizationId` INT(11) NOT NULL,
  `contactId` INT(11) NOT NULL,
  `creationDate` DATE NOT NULL,
  `validityDate` DATE NULL DEFAULT NULL,
  `maturityDate` DATE NULL DEFAULT NULL,
  `offerPotential` VARCHAR(16) CHARACTER SET 'utf8' NOT NULL,
  `offerState` VARCHAR(16) CHARACTER SET 'utf8' NOT NULL,
  `offerRejectReasonId` INT(11) NULL DEFAULT NULL,
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  `number` VARCHAR(64) CHARACTER SET 'utf8' NOT NULL,
  `observations` VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `showIvaIntoReport` TINYINT(1) NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  INDEX `ndx_offer_offerRejectReasonId` (`offerRejectReasonId` ASC),
  CONSTRAINT `fk_offer_offerRejectReasonId`
    FOREIGN KEY (`offerRejectReasonId`)
    REFERENCES `offerrejectreason` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'Ofertas';


CREATE TABLE IF NOT EXISTS `offercost` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `offerId` INT(11) NOT NULL,
  `name` VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `cost` DECIMAL(10,2) NOT NULL,
  `billable` TINYINT(1) NOT NULL DEFAULT '1',
  `iva` DECIMAL(4,2) NOT NULL DEFAULT '16.00',
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  `units` DECIMAL(10,2) NOT NULL DEFAULT '0.00',
  `place` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_offerCost_offerId` (`offerId` ASC),
  CONSTRAINT `fk_offerCost_offerId`
    FOREIGN KEY (`offerId`)
    REFERENCES `offer` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `offerrole` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `offerId` INT(11) NOT NULL,
  `name` VARCHAR(4096) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `costPerHour` DECIMAL(10,2) NOT NULL,
  `expectedHours` INT(11) NOT NULL,
  `iva` DECIMAL(4,2) NOT NULL DEFAULT '16.00',
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  `place` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `ndx_offerRole_offerId` (`offerId` ASC),
  CONSTRAINT `fk_offerRole_offerId`
    FOREIGN KEY (`offerId`)
    REFERENCES `offer` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO tntoffer.`offer` (`id`,`title`,`description`,`userId`,`organizationId`,`contactId`,`creationDate`,`validityDate`,`maturityDate`,`offerPotential`,`offerState`,`offerRejectReasonId`,`ownerId`,`departmentId`,`insertDate`,`updateDate`,`number`,`observations`,`showIvaIntoReport`) VALUES   (1,'Desarrollo proyecto','Según la conversación mantenida el día 15 de febrero entre los directivos, se acuerdo el desarrollo del proyecto x',1,4,2,'2009-04-07','2009-02-17','2009-03-16','HIGH','OPEN',NULL,1,1,'2009-04-07 11:27:29','2009-04-07 11:27:29','09012001','',1),  (2,'Instalación TNT','Según reunión en sus oficinas le proponemos la instalación del programa de gestión ',1,12,4,'2009-04-13','2009-04-01','2009-05-01','HIGH','OPEN',NULL,1,1,'2009-04-13 13:50:22','2009-04-13 13:50:22','09041302','',1),  (4,'Oferta Crisis','Esto es una oferta',1,17,6,'2009-05-13','2009-05-12','2009-05-14','HIGH','OPEN',NULL,1,1,'2009-05-13 12:39:59','2009-05-13 12:39:59','0001','',1);
INSERT INTO tntoffer.`OfferCost` VALUES   (1,1,'Metros de mampara con cristales, aluminio y madera que servirán para sustituir las anteriores.','50.00',1,'4.00',NULL,NULL,NULL,NULL,'30.00',NULL), (2,1,'Botes de pintura de la mejor marca para poder pintar la oficina y conseguir un efecto cálido','10.00',1,'4.00',NULL,NULL,NULL,NULL,'5.00',NULL);


INSERT INTO tntoffer.`OfferRole`  VALUES  (1,1,'Pintor','20.00',15,'16.00',NULL,NULL,NULL,NULL,NULL),  (2,2,'Transportista','15.00',50,'4.00',NULL,NULL,NULL,NULL,NULL),  (3,2,'Mamparista','35.00',30,'0.00',NULL,NULL,NULL,NULL,NULL),  (4,4,'Decorador','30.00',5,'7.00',NULL,NULL,NULL,NULL,NULL);
INSERT INTO tntoffer.`OfferRole`( offerId, name, costPerHour, expectedHours, iva, ownerId, departmentId, insertDate, updateDate, place)  VALUES    (1,'Pintor','20.00',15,'16.00',NULL,NULL,NULL,NULL,NULL),  (1,'Transportista','15.00',50,'4.00',NULL,NULL,NULL,NULL,NULL),  (1,'Mamparista','35.00',30,'0.00',NULL,NULL,NULL,NULL,NULL),  (1,'Decorador','30.00',5,'7.00',NULL,NULL,NULL,NULL,NULL);
INSERT INTO tntoffer.`OfferRole`( offerId, name, costPerHour, expectedHours, iva, ownerId, departmentId, insertDate, updateDate, place)  VALUES    (2,'Pintor','20.00',15,'16.00',NULL,NULL,NULL,NULL,NULL),  (2,'Transportista','15.00',50,'4.00',NULL,NULL,NULL,NULL,NULL),  (2,'Mamparista','35.00',30,'0.00',NULL,NULL,NULL,NULL,NULL),  (2,'Decorador','30.00',5,'7.00',NULL,NULL,NULL,NULL,NULL);
INSERT INTO tntoffer.`OfferRole`( offerId, name, costPerHour, expectedHours, iva, ownerId, departmentId, insertDate, updateDate, place)  VALUES    (4,'Pintor','20.00',15,'16.00',NULL,NULL,NULL,NULL,NULL),  (4,'Transportista','15.00',50,'4.00',NULL,NULL,NULL,NULL,NULL),  (4,'Mamparista','35.00',30,'0.00',NULL,NULL,NULL,NULL,NULL),  (4,'Decorador','30.00',5,'7.00',NULL,NULL,NULL,NULL,NULL);
