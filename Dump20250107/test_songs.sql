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
-- Table structure for table `songs`
--

DROP TABLE IF EXISTS `songs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `songs` (
  `song_id` int NOT NULL AUTO_INCREMENT,
  `song_name` varchar(255) DEFAULT NULL,
  `artist_id` int NOT NULL,
  `song_streams` varchar(255) NOT NULL,
  `Song_length` varchar(45) NOT NULL,
  `explicit` enum('yes','no') DEFAULT NULL,
  `feat_id` int DEFAULT NULL,
  `album_id` int DEFAULT NULL,
  PRIMARY KEY (`song_id`),
  KEY `artist_id` (`artist_id`),
  KEY `feat_id_idx` (`feat_id`),
  KEY `album1_id_idx` (`album_id`),
  CONSTRAINT `album_id` FOREIGN KEY (`album_id`) REFERENCES `albums` (`album_id`),
  CONSTRAINT `feat_id` FOREIGN KEY (`feat_id`) REFERENCES `feat_artist` (`feat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `songs`
--

LOCK TABLES `songs` WRITE;
/*!40000 ALTER TABLE `songs` DISABLE KEYS */;
INSERT INTO `songs` VALUES (1,'End of Beginning',15,'216,665,065','2:38','no',NULL,NULL),(2,'Chateau',15,'94,501,259','4:32','no',NULL,NULL),(3,'Lucid Dreams',1,'2,480,370,970','3:59','yes',NULL,1),(4,'Robbery',1,'1,274,864,196','4:00','yes',NULL,1),(5,'Boys a Liar',2,'811,444,335','2:09','yes',NULL,NULL),(6,'Think U The Shit (Fart)',2,'53,695,614','2:21','yes',NULL,NULL),(7,'redrum',3,'253,674,708','4:30','yes',NULL,NULL),(8,'Fe!n',4,'423,500,343','3:11','yes',NULL,NULL),(9,'Touch The Sky',5,'325,983,520','3:59','yes',NULL,NULL),(10,'Gold Digger',5,'1,093,756,680','3:27','yes',NULL,NULL),(11,'Carnival',5,'220,034,644','4:24','yes',NULL,NULL),(12,'Sprinter',6,'623,302,067','3:29','yes',NULL,NULL),(13,'Doja',6,'635,374,717','1:37','yes',NULL,NULL),(14,'Paper Rings',7,'610,924,320','3:42','no',NULL,NULL),(15,'Cruel Summer',7,'1,888,829,670','2:58','no',NULL,NULL),(16,'Anti-Hero',7,'1,457,757,627','3:20','no',NULL,NULL),(17,'Rich Baby Daddy',8,'275,872,793','5:19','yes',NULL,NULL),(18,'Passion Fruit',8,'913,240,534','4:58','yes',NULL,NULL),(19,'vampire',9,'851,600,344','3:39','yes',NULL,NULL),(20,'drivers license',9,'2,099,263,425','4:02','yes',NULL,NULL),(21,'Blinding Lights',10,'4,131,140,404','3:20','no',NULL,NULL),(22,'Starboy',10,'3,117,353,254','3:50','yes',NULL,NULL),(23,'Popular',10,'671,062,906','3:35','yes',NULL,NULL),(24,'Stay (with Justin Bieber)',11,'2,994,266,610','2:21','yes',17,NULL),(25,'WITHOUT YOU',11,'908,255,194','2:41','yes',NULL,NULL),(26,'What Was I Made For?',12,'735,417,807','3:42','no',NULL,NULL),(27,'Happier Than Ever',12,'1,256,416,664','4:58','yes',NULL,NULL),(28,'ocean eyes',12,'1,324,772,821','3:20','no',NULL,NULL),(29,'From The Start',13,'281,168,221','2:49','no',NULL,NULL),(30,'Falling Behind',13,'129,933,719','2:53','no',NULL,NULL),(31,'Summertime Sadness',14,'1,322,525,805','4:25','no',NULL,NULL),(32,'Wild Thoughts',16,'1,104,678,716','3:24','yes',NULL,NULL),(33,'Ghost',17,'1,481,200,258','2:33','no',NULL,NULL),(34,'Peaches',17,'82,254,645','3:18','yes',NULL,NULL),(35,'Die For You (feat. Dominic Fike)',17,'92,293,382','3:18','no',22,NULL),(36,'Somethin\' Stupid',18,'280,896,983','2:42','no',NULL,NULL),(37,'Fly Me To The Moon',18,'619,010,806','2:27','no',NULL,NULL),(38,'My Way',18,'443,753,059','4:36','no',NULL,NULL),(39,'Baby',17,'890,883,699','3:34','no',NULL,NULL),(40,'BabyDoll',22,'344,005,750','1:37','no',NULL,2),(41,'3 Nights',22,'942,040,608','2:57','no',NULL,2),(42,'Mona Lisa',22,'131,643,903','3:06','no',NULL,3),(43,'She Wants My Money',22,'94,140,359','2:13','yes',NULL,2),(44,'Westcoast Collective',22,'59,621,436','1:46','no',NULL,2),(45,'Socks',22,'23,902,370','2:11','no',NULL,2),(46,'King of Everything',22,'42,451,895','3:13','no',NULL,NULL),(47,'Think Fast (feat. Weezer)',22,'22,879,738','3:41','no',23,3),(48,'All Girls Are The Same',1,'1,551,722,151','2:45','yes',NULL,1),(49,'Armed and Dangerous',1,'765,641,160','2:49','yes',NULL,1),(50,'Lean Wit Me',1,'849,070,363','2:55','yes',NULL,1);
/*!40000 ALTER TABLE `songs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-07 15:16:36
