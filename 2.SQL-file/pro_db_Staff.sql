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
-- Table structure for table `Staff`
--

DROP TABLE IF EXISTS `Staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Staff` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `office_phone` int(11) DEFAULT NULL,
  `mobile` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `date_join` varchar(15) DEFAULT NULL,
  `date_left` varchar(15) DEFAULT NULL,
  `date_of_birth` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=big5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Staff`
--

LOCK TABLES `Staff` WRITE;
/*!40000 ALTER TABLE `Staff` DISABLE KEYS */;
INSERT INTO `Staff` VALUES (1,'mehedi','hasan','male',1747066695,1845786221,'mhk@gmail.com','2-8-2018','','1-12-1997'),(2,'Zahid','hasan','male',54554864,1824246,'az@gmail.com','3-8-2018',NULL,'12-10-1999'),(3,'jami','moda','male',65556,1111110,'jhfgjagfja','1014','121','1001'),(4,'rezvi','islam','male',7753,184356789,'rezvi@diu.edu.bd','11-3-201','','11-5-1997'),(5,'sharmin','shama','female',28827,175344227,'sharmin@diu.edu.bd','23-4-2010','','11-7-1998'),(6,'rana','hosain','male',287535,7259825,'rana@diu.edu.bd','3-23-2013','11-11-1018','11-5-1996'),(7,'hridoy','kumar','male',7428,3878,'hridoy@gmain.com','1-22-2009','','3-4-1995'),(8,'pallab','paul','male',5333,34335,'paul@diu.edu.bd','22-8-2005','31-1-2015','2-2-1990'),(9,'turag','khan','male',7574,3895739,'khan@yahoo.com','21-12-2009','','1-1-198'),(10,'mohona','khatun','female',34645,2453686,'mohona@outlook.com','11-11-200','31-12-2017','1-12-1992');
/*!40000 ALTER TABLE `Staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-01 11:59:38
