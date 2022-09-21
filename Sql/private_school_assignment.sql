-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: private_school
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assignment`
--

DROP TABLE IF EXISTS `assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignment` (
  `assignment_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `description` text COLLATE utf8_bin,
  `sub_date_time` date DEFAULT NULL,
  `oral_mark` decimal(5,2) DEFAULT NULL,
  `total_mark` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`assignment_id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (1,'CB1-1','FOR-LOOP','2019-06-25',15.00,20.00),(2,'CB2-2','CLASSES','2019-06-26',16.00,40.00),(3,'CB3-3','OBJECTS','2019-06-27',0.00,50.00),(4,'CB4-4','POLYMOR','2019-06-28',10.00,32.00),(5,'CB5-5','LOOPS','2019-06-29',5.00,25.00),(6,'CB6-6','CLASSES','2019-06-30',10.00,40.00),(7,'CB7-7','OBJECT','2019-06-24',20.00,80.00),(8,'CB8-8','ELEMENTS','2019-06-23',0.00,65.00),(9,'CB9-9','ATTRIBUTES','2019-06-22',20.00,15.00),(10,'CB10-10','HEADINGS','2019-06-21',15.00,20.00),(11,'CB01','SYNTAX','2019-06-20',0.00,80.00),(12,'CB02','VARIABLES','2019-06-19',3.00,68.00),(13,'CB03','DATA TYPES','2019-06-18',15.00,42.00),(14,'dsad','Dasdsa','3895-05-19',23.20,23.20);
/*!40000 ALTER TABLE `assignment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-15 23:27:18
