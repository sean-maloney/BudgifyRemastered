CREATE DATABASE  IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `test`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(8) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `subscription_id` int DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `Date_of_birth` date DEFAULT NULL,
  `Parental_controls` enum('yes','no') DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `marketing` enum('yes','no') DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`),
  KEY `subscription_id_idx` (`subscription_id`),
  CONSTRAINT `subscription_id` FOREIGN KEY (`subscription_id`) REFERENCES `subscription` (`subscription_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','abcd','admin',1,'male','Ireland','2005-07-07','no','087-9549150','no','2019-12-13'),(2,'Darragh O\'keefe','chief_keefe',NULL,'keefe@atu.ie',1,'male','Ireland','2004-01-14','no','413-635-5769','yes','2020-11-20'),(3,'Seán Maloney','ikingsean','1234','sean.maloney@atu.ie',3,'male','Ireland','2003-03-27','no','087123','no','2018-09-08'),(4,'Johanan Seeruthern','johanan2607',NULL,'johanan@atu.ie',4,'male','Mauritius','2005-04-26','yes','086432','no','2017-08-21'),(5,'Evelyn Concannon','e_concans123',NULL,'evelyn.conca@pres.ie',2,'female','Ireland','1964-04-29','no','0346597','yes','2024-01-31'),(6,'Ana de Armas','ana123',NULL,'ana_armas@gmail.com',1,'female','Cuba','1988-04-30','no','06731','no','2023-05-15'),(7,'Kim Kardashian','kim_k',NULL,'kim_kardashian@temu.com',3,'female','United States','1980-10-21','no','15717','yes','2022-02-28'),(8,'Tyrese Mumia','visixn',NULL,'G00421432@atu.ie',4,'Male','Kenya','2004-02-17','yes','085-413243','yes','2009-02-16'),(9,'Emily Johnson','Emily_j',NULL,'johnson_e@gmail.com',2,'Female','England','2002-11-14','no','085-5356','yes','2020-03-13'),(10,'Sophia Martinez','Sophia_m',NULL,'Martinez_sophia@yahoo.ie',1,'Female','Maldives','2007-05-30','yes','089-32465','yes','2018-05-25'),(11,'Bryant Moreland','EDP445',NULL,'Bryant_loves_cupcakes@yahoo.la',3,'male','United States ','1990-12-15','yes','18960','no','2024-03-19'),(12,'Lebron James','King_james',NULL,'King_james@bing.ie',4,'Male','United States','1984-12-30','yes','393467','yes','2021-09-06'),(13,'Thomas Brady','tom_brady',NULL,'tom_brady@tombrady.com',3,'Male','United States','1977-08-03','no','73459','no','2020-03-20'),(14,'Des O\'Reilly','Des123',NULL,'Des@atu.ie',1,'Male','Ireland','1969-05-30','no','3483452','yes','2023-04-13'),(15,'Delilah Carter','deli_carti',NULL,'delicarti@gmail.com',1,'Female','Scotland','1999-09-16','no','555-121-444','yes','2018-01-11'),(16,'Alex Turner','alex_turner',NULL,'alex_turner@gmail.com',1,'Male','England','1986-01-06','no','435-646-6533','yes','2020-10-12'),(17,'Dalton Watson','Big_Dalto',NULL,'Watson@gmail.com',2,'Male','Scotland','2005-11-08','no','654-846-2146','no','2019-06-23'),(18,'Felonius Gru','Gru',NULL,'felonius_gru@gmail.com',3,'Male','Russian','1965-05-25','no','253-635-1534','no','2021-06-28'),(19,'Lord Farquad','Farquad',NULL,'Lordy_quads@yahoo.ie',2,'Male','Duloc','1994-04-15','yes','264-234-7563','yes','2018-02-12'),(20,'david','davidjacuzzi','7705','david@gmail.com',1,'Male','Ireland',NULL,NULL,NULL,NULL,NULL),(21,'Tyrese','tyrese','12345','ty@atu.ie',1,'Male','Ireland','2024-12-30','no','0858292889',NULL,'2024-12-30'),(22,'damian','damian','abcd','damian@atu.ie',1,'Male','Ireland','2025-03-27','no','0858292889',NULL,'2025-01-06'),(23,'lol','lol','abcd','lol@atu.ie',1,'Male','Ireland','2025-01-06','no','0858292889',NULL,'2025-01-06'),(24,'p','p','kidz','pdiddy@gmail.com',1,'Male','Ireland','2025-01-02','no','0858292889',NULL,'2025-01-07'),(25,'john','john1','654321','johndoe@gmail.com',1,'Male','Ireland','2000-01-01','no','12345678',NULL,'2025-01-07'),(26,'ty','tyty1','654321','ty@outlook.com',1,'Male','Ireland','2000-01-01','no','12345678',NULL,'2025-01-07');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-07 15:16:38
