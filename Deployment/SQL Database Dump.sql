/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.28 : Database - banking
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`banking` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `banking`;

/*Table structure for table `bank_accounts` */

DROP TABLE IF EXISTS `bank_accounts`;

CREATE TABLE `bank_accounts` (
  `acc_no` int NOT NULL,
  `balance` double DEFAULT NULL,
  `branch_city_name` varchar(255) DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `is_saving_account` bit(1) DEFAULT NULL,
  PRIMARY KEY (`acc_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bank_accounts` */

insert  into `bank_accounts`(`acc_no`,`balance`,`branch_city_name`,`customer_id`,`is_saving_account`) values 
(1012324,5000,'Ludhiana',101,''),
(3023423,0,'Mumbai',102,'\0'),
(5023454,9000,'Delhi',103,'');

/*Table structure for table `customers` */

DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `full_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `customers` */

insert  into `customers`(`customer_id`,`full_name`) values 
(101,'Deepak Kumar'),
(102,'Shruti'),
(103,'Harshit');

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `emp_id` int NOT NULL AUTO_INCREMENT,
  `branch_city_name` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=505 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `employees` */

insert  into `employees`(`emp_id`,`branch_city_name`,`full_name`) values 
(101,'Ludhiana','Deepak Kumar'),
(303,'Mumbai','Shruti'),
(504,'Delhi','Harshit');

/*Table structure for table `transactions` */

DROP TABLE IF EXISTS `transactions`;

CREATE TABLE `transactions` (
  `trasaction_id` int NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `from_acc_no` int DEFAULT NULL,
  `is_debit` bit(1) DEFAULT NULL,
  `to_acc_no` int DEFAULT NULL,
  PRIMARY KEY (`trasaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `transactions` */

insert  into `transactions`(`trasaction_id`,`amount`,`from_acc_no`,`is_debit`,`to_acc_no`) values 
(101,3000,2343,'',24564),
(102,3422,3453,'',24545),
(103,7686,7897,'',67865);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
