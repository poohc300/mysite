-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema webdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema webdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `webdb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema mysite
-- -----------------------------------------------------
USE `webdb` ;

-- -----------------------------------------------------
-- Table `webdb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `webdb`.`user` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `join_date` VARCHAR(45) NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `webdb`.`board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `webdb`.`board` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `contents` TEXT NULL,
  `user_no` INT NOT NULL,
  `reg_date` DATETIME NULL,
  PRIMARY KEY (`no`, `user_no`),
  INDEX `fk_board_user1_idx` (`user_no` ASC) VISIBLE,
  CONSTRAINT `fk_board_user1`
    FOREIGN KEY (`user_no`)
    REFERENCES `webdb`.`user` (`no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `webdb`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `webdb`.`comment` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `contents` TEXT NULL,
  `user_no` INT NOT NULL,
  `board_no` INT NOT NULL,
  `reg_date` DATETIME NULL,
  PRIMARY KEY (`no`),
  INDEX `fk_comment_user_idx` (`user_no` ASC) VISIBLE,
  INDEX `fk_comment_board1_idx` (`board_no` ASC) VISIBLE,
  CONSTRAINT `fk_comment_user`
    FOREIGN KEY (`user_no`)
    REFERENCES `webdb`.`user` (`no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comment_board1`
    FOREIGN KEY (`board_no`)
    REFERENCES `webdb`.`board` (`no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `webdb`.`reply_comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `webdb`.`reply_comment` (
  `no` INT NOT NULL AUTO_INCREMENT,
  `contents` TEXT NULL,
  `reg_date` DATETIME NULL,
  `comment_no` INT NOT NULL,
  `depth` INT NULL,
  `user_no` INT NOT NULL,
  PRIMARY KEY (`no`),
  INDEX `fk_reply_comment_comment1_idx` (`comment_no` ASC) VISIBLE,
  INDEX `fk_reply_comment_user1_idx` (`user_no` ASC) VISIBLE,
  CONSTRAINT `fk_reply_comment_comment1`
    FOREIGN KEY (`comment_no`)
    REFERENCES `webdb`.`comment` (`no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_reply_comment_user1`
    FOREIGN KEY (`user_no`)
    REFERENCES `webdb`.`user` (`no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;