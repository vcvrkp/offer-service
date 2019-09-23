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

