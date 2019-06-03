CREATE DATABASE  IF NOT EXISTS `simplycooking` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `simplycooking`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: den1.mysql5.gear.host    Database: simplycooking
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `food_categories`
--

DROP TABLE IF EXISTS `food_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `food_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_category_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_categories`
--

LOCK TABLES `food_categories` WRITE;
/*!40000 ALTER TABLE `food_categories` DISABLE KEYS */;
INSERT INTO `food_categories` VALUES (1,'Morgenmad'),(3,'Grill'),(4,'Brød'),(5,'Vegetar'),(6,'Dessert'),(7,'Salat'),(8,'Kage'),(9,'Snack'),(10,'Drikkevarer'),(11,'Frokost'),(12,'Tilbehør');
/*!40000 ALTER TABLE `food_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_items`
--

DROP TABLE IF EXISTS `menu_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `menu_items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` varchar(300) DEFAULT NULL,
  `price` int(4) NOT NULL,
  `picture_url` varchar(200) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_items`
--

LOCK TABLES `menu_items` WRITE;
/*!40000 ALTER TABLE `menu_items` DISABLE KEYS */;
INSERT INTO `menu_items` VALUES (1,'Grov bolle m. frikadelle','Hjemmelavet frikadeller m. Salat, tomat, agurk & røde løg.',40,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/8-frikadelle-grov-bolle.png','2019-05-21 21:20:52'),(2,'Sandwich m. frikadelle','Hjemmelavet frikadeller m. Salat, tomat, agurk & røde løg.',42,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/sandwich_frikadelle.png','2019-05-21 21:20:52'),(3,'Grov sandwich m. frikadelle','Hjemmelavet frikadeller m. Salat, tomat, agurk & røde løg.',42,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/grov-sandwich-m-frikadelle.png','2019-05-21 21:20:52'),(4,'Sandwich m. laks & røræg','Salat, tomat, agurk & røde løg.',42,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/sandwich-m-laks-roeraeg.png','2019-05-21 21:20:52'),(5,'Grov bolle m. chorizo & cheddar','Salat, tomat, agurk, røde løg, soltørrede tomater, syltet pickles',40,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/12-chorizo-cheddar-grov-bolle.png','2019-05-21 21:20:52'),(6,'Sandwich m. parmaskinke & cheddar','Salat, tomat, agurk, røde løg, soltørrede tomater, syltet pickles',42,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/sandwich-m-parmaskinke-cheddar.png','2019-05-21 21:20:52'),(7,'Sandwich vegetar','Salat, tomat , agurk & røde løg.',36,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/sandwich-vegetar.png','2019-05-21 21:20:52'),(8,'Sandwich vegetar m. ost','Ost, salat, tomat , agurk & røde løg.',38,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/sandwich-vegetar-m-ost.png','2019-05-21 21:20:52'),(9,'Grov bolle vegetar m. ost','Ost, salat, tomat , agurk & røde løg.',36,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/grov-bolle-vegetar-m-ost.png','2019-05-21 21:20:52'),(10,'Pastasalat m. kylling','Pasta skruer m.ærter, agurker, majs, krydderurter & marineret kylling.',42,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/18-kylling.png','2019-05-25 16:29:45'),(11,'Pastasalat m. kalkun','Pasta skruer m.ærter, agurker, majs, krydderurter.',42,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/pasta_kalkun.png','2019-05-26 08:16:54'),(12,'Broccolisalat','Broccoli, rødløg, rosiner, solsikkefrø & bacon.',40,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/broccoli_salat.png','2019-05-26 08:16:54'),(13,'Alm. salat','Blandet salat m. årstidenes grøntsager.',40,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/salat.png','2019-05-26 08:20:00'),(38,'Cookie','Hjemmebagte cookies m. hele hasselnødder & chokoladestykker.',20,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/mad-92.png','2019-05-26 08:24:49'),(39,'Muffin','Chokolade eller blåbær.',16,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/muffins_baer.png','2019-05-26 11:02:17'),(40,'Brownie','Brownie.',16,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/brownie.png','2019-05-26 11:02:17'),(41,'Kildevæld','0.5 l. Carlsberg kildevæld.',15,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Kildeveld.png','2019-05-26 11:02:17'),(51,'Kurvand m. brus','0.5 l. Carlsberg kurvand m. brus',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/565464.png','2019-05-26 11:16:22'),(52,'Kurvand m. brus & citrus','0.5 l. Carlsberg kurvand m. brus og citrus smag',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/8482111.png','2019-05-26 11:16:22'),(53,'Nestea','0.5 l. Nestea peach.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/DK_Nestea_Peach_50cl_RGB.png','2019-05-26 11:16:22'),(54,'Nestea','0.5 l. Nestea peach light.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Nestea-white-peach-light.png','2019-05-26 11:16:22'),(55,'Nestea','0.5 l. Nestea mango/pineapple.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Nestea-mango-pineapple.png','2019-05-26 11:16:22'),(56,'Coca-Cola Alm.','0.5 l. Coca-Cola.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Coca-Cola_50cl.png','2019-05-26 11:51:23'),(62,'Coca-Cola Stor','1.5 l. Coca-Cola.',38,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/CCR-15L-NRPET-Droplets-DK.png','2019-05-30 23:24:28'),(63,'Coca-Cola Zero Alm.','0.5 l. Coca-Cola Zero.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Coca-Cola-Zero-50cl-Droplets.png','2019-05-30 23:24:28'),(64,'Coca-Cola Zero Stor','1.5 l. Coca-Cola Zero.',38,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/CCZ-15L-NRPET-Droplets-DK.png','2019-05-30 23:24:29'),(65,'Carlsberg Sport Alm.','0.5 l. Carlsberg Sport.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Carlsberg-Sport-50cl.png','2019-05-30 23:26:24'),(66,'Carlsberg Sport Stor','1.5 l. Carlsberg Sport.',38,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Carlsberg-Sport-150cl.png','2019-05-30 23:26:25'),(67,'Cocio','0.4 l. Cocio.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Cocio_Classic_40cl_DK_u_Choko.png','2019-05-30 23:26:25'),(68,'Cocio Light','0.4 l. Cocio light.',22,'https://bestilling.sandwichen.dk/assets/upload/sandwichen.dk/items/Cocio_Classic_40cl_DK_u_Choko.png','2019-05-30 23:26:25');
/*!40000 ALTER TABLE `menu_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_items_categories`
--

DROP TABLE IF EXISTS `menu_items_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `menu_items_categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_category_id` int(11) NOT NULL,
  `menu_item_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id_idx` (`food_category_id`),
  KEY `menu_item_id_idx` (`menu_item_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`food_category_id`) REFERENCES `food_categories` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `menu_item_id` FOREIGN KEY (`menu_item_id`) REFERENCES `menu_items` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_items_categories`
--

LOCK TABLES `menu_items_categories` WRITE;
/*!40000 ALTER TABLE `menu_items_categories` DISABLE KEYS */;
INSERT INTO `menu_items_categories` VALUES (1,11,1),(2,11,2),(3,11,3),(4,7,4),(5,11,4),(7,5,5),(8,6,5),(9,9,5),(10,6,6),(11,9,6),(12,10,7),(13,10,8),(14,11,9),(15,5,10),(16,11,10),(17,5,11),(18,11,11),(19,11,12),(20,11,13),(21,8,38);
/*!40000 ALTER TABLE `menu_items_categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `menu_item_id` int(11) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `user_id_foreign_idx` (`user_id`),
  KEY `menu_item_id_foreign_idx` (`menu_item_id`),
  CONSTRAINT `menu_item_id_foreign` FOREIGN KEY (`menu_item_id`) REFERENCES `menu_items` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(60) NOT NULL,
  `user_role` tinyint(1) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (13,'Admin','Chef','admin@test.dk','$2a$10$kJiTFn7ZQOFg8VfJDBzo2ePPfZ9DSp0b3qOCHx6.1z9kh/SdSQyHq',1,'2019-06-02 19:49:33'),(14,'User','Kunde','user@test.dk','$2a$10$OXnlvGcmQbt0R4K58mPHMOBJ0qbmrvzuka5JP3v5E2YOY7qv7AQSm',0,'2019-06-02 19:50:03');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'simplycooking'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-02 23:29:00
