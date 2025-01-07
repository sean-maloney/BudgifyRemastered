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
-- Table structure for table `artists`
--

DROP TABLE IF EXISTS `artists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artists` (
  `artist_id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `Monthly_listeners` int DEFAULT NULL,
  `Top_Songs` varchar(255) DEFAULT NULL,
  `Artist_desc` varchar(255) DEFAULT NULL,
  `Merch` enum('yes','no') DEFAULT NULL,
  PRIMARY KEY (`artist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artists`
--

LOCK TABLES `artists` WRITE;
/*!40000 ALTER TABLE `artists` DISABLE KEYS */;
INSERT INTO `artists` VALUES (1,'Juice WRLD',31,'Lucid Dreams','As of 2024 Juice WRLD is number 137 in the world.','yes'),(2,'Ice Spice',23,'Think you the shit','As of 2024 Ice Spice is number 248 in the world.','no'),(3,'21 Savage',64,'Redrum','As of 2024 21 is number 23 in the world.','no'),(4,'Travis Scott',67,'Fe!n','As of 2024 Travis Scott  is number 19 in the world.','no'),(5,'Kanye West',78,'Carnival','As of 2024 Kanye West is number 6 in the world.','yes'),(6,'Central Cee',25,'Sprinter','As of 2024 Central Cee is number 214 in the world.','yes'),(7,'Taylor Swift',104,'Cruel Summer','As of 2024 Taylor Swift is number 2 in the world.','yes'),(8,'Drake',84,'Rich Baby Daddy','As of 2024 Drake is number 5 in the world.','yes'),(9,'Olivia Rodrigo',58,'Vampire','As of 2024 Olivia Rodrigo is number 31 in the world.','no'),(10,'The Weeknd',114,'One of the girls','As of 2024 The Weeknd is number 1 in the world.','yes'),(11,'The Kid Laroi',31,'Stay','As of 2024 The Kid Laroi is number 138 in the world.','yes'),(12,'Billie Eilish',67,'What Was I Made For','As of 2024 Billie Eilish is number 21 in the world.','no'),(13,'Laufey',14,'From The Start','As of 2024 Laufey is number 330 in the world.','no'),(14,'Lana Del Ray',58,'Summertime Sadness','As of 2024 Lana Del Rey is number 32 in the world.','no'),(15,'Djo',32,'End of beginning','As of 2024 Djo is number 130 in the world.','yes'),(16,'Dj Khalid',25,'Wild Thoughts','As of 2024 Dj Khaled is number 224 in the world.','yes'),(17,'Justin Bieber',78,'Ghost','As of 2024 Justin Bieber is number 7 in the world.','no'),(18,'Frank Sinatra',17,'Somethin\' Stupid','As of 2024 Frank Sinatra is number 464 in the world.','yes'),(19,'Micheal Bublé',17,'Spicy Margarita','As of 2024 Michael Bubléis number 454 in the world.','no'),(20,'Sean paul',33,'No Lie','As of 2024 Sean Paul is number 123 in the world.','no'),(21,'Queen',52,'Don\'t Stop Me Now','As of 2024 Queen is number 45 in the world.','no'),(22,'Dominic Fike',20,'Baby Doll','As of 2024 Dominic Fike is number 341 in the world.','yes'),(23,'Weezer',15,'Island In The Sun','As of 2024 Weezer is number 362 in the world.','yes');
/*!40000 ALTER TABLE `artists` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-07 15:16:37
