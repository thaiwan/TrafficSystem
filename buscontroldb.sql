-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: buscontroldb
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `buses`
--

DROP TABLE IF EXISTS `buses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buses` (
  `busNumber` int(11) NOT NULL AUTO_INCREMENT,
  `numberOfSeats` int(11) NOT NULL,
  PRIMARY KEY (`busNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buses`
--

LOCK TABLES `buses` WRITE;
/*!40000 ALTER TABLE `buses` DISABLE KEYS */;
/*!40000 ALTER TABLE `buses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passengers`
--

DROP TABLE IF EXISTS `passengers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passengers` (
  `passengerId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `dateOfBirth` date NOT NULL,
  PRIMARY KEY (`passengerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers`
--

LOCK TABLES `passengers` WRITE;
/*!40000 ALTER TABLE `passengers` DISABLE KEYS */;
/*!40000 ALTER TABLE `passengers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schedule` (
  `routeNumber` int(11) NOT NULL AUTO_INCREMENT,
  `busNumber` int(11) NOT NULL,
  `departureTime` time(6) NOT NULL,
  `departureStationId` int(11) NOT NULL,
  `arrivalTime` time(6) NOT NULL,
  `arrivalStationId` int(11) NOT NULL,
  PRIMARY KEY (`routeNumber`),
  KEY `fk_schedule_buses1_idx` (`busNumber`),
  KEY `fk_schedule_stations1_idx` (`departureStationId`),
  KEY `fk_schedule_stations2_idx` (`arrivalStationId`),
  CONSTRAINT `fk_schedule_buses1` FOREIGN KEY (`busNumber`) REFERENCES `buses` (`busNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schedule_stations1` FOREIGN KEY (`departureStationId`) REFERENCES `stations` (`stationId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_schedule_stations2` FOREIGN KEY (`arrivalStationId`) REFERENCES `stations` (`stationId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stations`
--

DROP TABLE IF EXISTS `stations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stations` (
  `stationId` int(11) NOT NULL AUTO_INCREMENT,
  `stationName` varchar(45) NOT NULL,
  PRIMARY KEY (`stationId`),
  UNIQUE KEY `stationName_UNIQUE` (`stationName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stations`
--

LOCK TABLES `stations` WRITE;
/*!40000 ALTER TABLE `stations` DISABLE KEYS */;
/*!40000 ALTER TABLE `stations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tickets`
--

DROP TABLE IF EXISTS `tickets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tickets` (
  `ticketId` int(11) NOT NULL AUTO_INCREMENT,
  `passengerId` int(11) NOT NULL,
  `routeNumber` int(11) NOT NULL,
  PRIMARY KEY (`ticketId`),
  KEY `fk_tickets_passengers_idx` (`passengerId`),
  KEY `fk_tickets_schedule1_idx` (`routeNumber`),
  CONSTRAINT `fk_tickets_passengers` FOREIGN KEY (`passengerId`) REFERENCES `passengers` (`passengerId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tickets_schedule1` FOREIGN KEY (`routeNumber`) REFERENCES `schedule` (`routeNumber`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tickets`
--

LOCK TABLES `tickets` WRITE;
/*!40000 ALTER TABLE `tickets` DISABLE KEYS */;
/*!40000 ALTER TABLE `tickets` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-20  1:47:03
