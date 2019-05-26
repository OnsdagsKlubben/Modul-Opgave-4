CREATE DATABASE  IF NOT EXISTS `simplycooking` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `simplycooking`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: simplycooking
-- ------------------------------------------------------
-- Server version	8.0.16

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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
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
  `name` varchar(45) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `price` int(4) NOT NULL,
  `picture_url` varchar(100) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_items`
--

LOCK TABLES `menu_items` WRITE;
/*!40000 ALTER TABLE `menu_items` DISABLE KEYS */;
INSERT INTO `menu_items` VALUES (1,'Cheese burger','Saftig cheese burger med brioche bolle, karameliseret løg og special dressing.',25,NULL,'2019-05-21 21:20:52'),(2,'Sandwich m. laks','Sandwich med røget norsk laks, marinerede søde rødløg, ruccola salat og hjemmelavet aioli.',30,NULL,'2019-05-21 21:20:52'),(3,'Sandwich m. ost og skinke','Rustik sandwich med mild ost og italiensk parma skinke.',30,NULL,'2019-05-21 21:20:52'),(4,'Kyllinge salat','Sund og smagfuld kyllinge salat med hvidløgscroutoner og ceasar dressing.',25,NULL,'2019-05-21 21:20:52'),(5,'Cookie m. chokolade','Lækker smørbagt chokolade cookie. Sprød udenpå og blød indeni.',10,NULL,'2019-05-21 21:20:52'),(6,'Muffin',' Lækker muffin !',15,NULL,'2019-05-21 21:20:52'),(7,'Kaffe, stor',' Denne bønne står med en kraftig aroma, med en intens frugtagtig smag med et hint af citrus. En kaffe med medium bitterhed, og samtidig en sød smag.',12,NULL,'2019-05-21 21:20:52'),(8,'Kaffe, normal',' Denne bønne står med en kraftig aroma, med en intens frugtagtig smag med et hint af citrus. En kaffe med medium bitterhed, og samtidig en sød smag.',7,NULL,'2019-05-21 21:20:52'),(9,'Klassisk lasagne',' Den er lavet fra bunden, ud fra vores bedste opskrift og smager usandsynlig godt. Kødsaucen er smagt til med oregano og timian og så er der selvfølgelig mozzarella-ost på toppen.',25,NULL,'2019-05-21 21:20:52'),(10,'Svampe risotto m. parmesan','Den klassiske italienske risotto er en skøn og fyldig ret, som er meget mættende og et godt aftensmåltid, når man trænger til lidt komfort og hygge.',30,NULL,'2019-05-25 16:29:45'),(11,'Kartoffel pizza','De krydrede kartofler og den sødmefulde, karamelliserede løgmarinade er et særdeles lykkeligt ægteskab på en pizza.',40,NULL,'2019-05-26 08:16:54'),(12,'Spaghetti alla carbonara','Spaghetti alla carbonara - en cremet italiensk ret, der er populær hos både store og små.',30,NULL,'2019-05-26 08:16:54'),(13,'Rejemad m. mayo og dild','Lavet med fjordrejer, en dansk delikatesse og specialitet.',20,NULL,'2019-05-26 08:20:00'),(38,'Hindbærsnitte','Som mormor lavede dem. jo, jo, det kan sagtens lade sig gøre!',12,NULL,'2019-05-26 08:24:49'),(39,'Corny Big, Müslibar, 50g','med chokolade',10,NULL,'2019-05-26 11:02:17'),(40,'Corny Big, Müslibar, 50g','med chokolade  & banan',10,NULL,'2019-05-26 11:02:17'),(41,'Corny Big, Müslibar, 50g','med cookies',10,NULL,'2019-05-26 11:02:17'),(51,'Stimorol tyggegummi, 1 pk','med eucalyptus smag',5,NULL,'2019-05-26 11:16:22'),(52,'Stimorol tyggegummi, 1 pk','med mint smag',5,NULL,'2019-05-26 11:16:22'),(53,'Stimorol, 1 pk','med  strawberry-mint smag',5,NULL,'2019-05-26 11:16:22'),(54,'Innoncent Smoothie','smoothie med kiwi, lime, matcha, agurk & hørfrø',23,NULL,'2019-05-26 11:16:22'),(55,'Innoncent Smoothie','smoothie med jordbær, kirsebær, guarana & hørfrø',23,NULL,'2019-05-26 11:16:22'),(56,'Mathilde kakaosmukketmæk, 1 brik',NULL,7,NULL,'2019-05-26 11:51:23');
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
  KEY `menu_item_id_idx` (`menu_item_id`),
  KEY `food_category_id_idx` (`food_category_id`),
  CONSTRAINT `food_category_id` FOREIGN KEY (`food_category_id`) REFERENCES `food_categories` (`id`),
  CONSTRAINT `menu_item_id` FOREIGN KEY (`menu_item_id`) REFERENCES `menu_items` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,1,1,'2019-05-23 22:31:24'),(2,1,2,'2019-05-23 22:31:24'),(3,2,4,'2019-05-23 22:31:24'),(4,3,1,'2019-05-23 22:31:24'),(5,3,5,'2019-05-23 22:31:24'),(6,4,1,'2019-05-24 07:35:43'),(7,4,2,'2019-05-24 07:36:46'),(8,5,1,'2019-05-24 07:36:46'),(9,5,6,'2019-05-24 07:36:46'),(10,5,7,'2019-05-24 07:36:46');
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
  `password` varchar(45) NOT NULL,
  `user_role` tinyint(1) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Frederik','Lundbeck Jørgensen','frederik@simplycooking.dk','frederik',1,'2019-05-18 21:17:53'),(2,'Marcus','Bender Knudsen','marcus@simplycooking.dk','marcus',1,'2019-05-18 21:17:53'),(3,'Søren','Carlsen','søren@simplycooking.dk','søren',1,'2019-05-22 14:42:40'),(4,'Nicklas','Birkehøj List','nicklas@simplycooking.dk','nicklas',1,'2019-05-22 14:42:40'),(5,'user','user','user@hotmail.dk','password',0,'2019-05-24 09:06:18'),(6,'Martin','Haugaard Zielke','martin@simplycooking.dk','martin',0,'2019-05-24 15:42:03'),(7,'Jarl','Tuxen','jarl@kea.dk','jarl',0,'2019-05-26 11:57:41'),(8,'Asger','Clausen','asger@kea.dk','asger',0,'2019-05-26 11:57:41');
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

-- Dump completed on 2019-05-26 15:07:00
