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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `stream` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'CB1','Full-time','JAVA','2019-04-27','2019-07-27'),(2,'CB2','Full-time','JAVA','2019-04-28','2019-07-29'),(3,'CB3','Full-time','JAVA','2019-04-29','2019-07-30'),(4,'CB4','Part-time','JAVA','2019-04-30','2019-07-28'),(5,'CBJ1','Part-time','JAVASCRIPT','2019-04-26','2019-07-26'),(6,'CBJ2','Part-time','JAVASCRIPT','2019-04-01','2019-07-25'),(7,'CBJ3','Full-time','JAVASCRIPT','2019-04-02','2019-07-24'),(8,'CBH','Part-time','html','2019-04-03','2019-07-23'),(9,'CBH1','Full-time','html','2019-04-04','2019-07-22'),(10,'CBH2','Full-time','html','2019-04-05','2019-07-21'),(11,'CBC','Full-time','C','2019-04-06','2019-07-20'),(12,'CBC1','Full-time','C','2019-04-07','2019-07-19'),(13,'CBC2','Full-time','C','2019-04-06','2019-07-18'),(14,NULL,NULL,NULL,NULL,NULL),(15,'dadsa','Dadsa','dads','3895-05-19','3895-08-19');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
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
