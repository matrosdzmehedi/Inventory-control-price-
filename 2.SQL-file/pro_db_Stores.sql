-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: pro_db
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Stores`
--

DROP TABLE IF EXISTS `Stores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Stores` (
  `store_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_name` varchar(45) DEFAULT NULL,
  `store_location` varchar(45) DEFAULT NULL,
  `store_address` varchar(45) DEFAULT NULL,
  `other_details` varchar(45) DEFAULT NULL,
  `Staff_staff_id` int(11) NOT NULL,
  `Area_area_code` int(11) NOT NULL,
  `Area_area_mngr_staff_id` int(11) NOT NULL,
  PRIMARY KEY (`store_id`),
  KEY `fk_Stores_Staff1_idx` (`Staff_staff_id`),
  KEY `fk_Stores_Area1_idx` (`Area_area_code`,`Area_area_mngr_staff_id`),
  CONSTRAINT `fk_Stores_Area1` FOREIGN KEY (`Area_area_code`, `Area_area_mngr_staff_id`) REFERENCES `Area` (`area_code`, `area_mngr_staff_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Stores_Staff1` FOREIGN KEY (`Staff_staff_id`) REFERENCES `Staff` (`staff_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Stores`
--

LOCK TABLES `Stores` WRITE;
/*!40000 ALTER TABLE `Stores` DISABLE KEYS */;
INSERT INTO `Stores` VALUES (1,'medda','bb','92/3','nothing',1,1,1),(2,'king ','badda','93/5','nothing',2,76,598),(3,'raza store','sanker','96/6','nothing',3,212,346),(4,'reza store','sanker','98/8','nothing',4,232,2785),(5,'himel store','mahammadpur','92/3','nothing',5,331,3534),(6,'pallab store','jigatola','94/2','nothing',6,576,54646),(7,'turag store','santi nagar','95/3','nothing',7,768,4579),(8,'jammi store','surabad','8/6','nothing',8,1234,5678),(9,'riad store','sukrabad','96/5','nothing',9,8909,678),(10,'anika store','nilkhet','58/3','nothing',10,9876,987);
/*!40000 ALTER TABLE `Stores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-01 11:59:37
