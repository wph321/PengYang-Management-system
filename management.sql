/*
Navicat MySQL Data Transfer

Source Server         : LOCALHOST
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : management

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-25 13:28:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for files
-- ----------------------------
DROP TABLE IF EXISTS `files`;
CREATE TABLE `files` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `file_address` varchar(200) NOT NULL,
  `file_name` varchar(50) NOT NULL,
  `file_size` int(20) NOT NULL,
  `ul_id` int(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ul_id` (`ul_id`),
  CONSTRAINT `files_ibfk_1` FOREIGN KEY (`ul_id`) REFERENCES `userlogin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of files
-- ----------------------------

-- ----------------------------
-- Table structure for inventory
-- ----------------------------
DROP TABLE IF EXISTS `inventory`;
CREATE TABLE `inventory` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `number` int(20) NOT NULL,
  `prepare1` varchar(200) DEFAULT NULL,
  `prepare2` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inventory
-- ----------------------------

-- ----------------------------
-- Table structure for month_time
-- ----------------------------
DROP TABLE IF EXISTS `month_time`;
CREATE TABLE `month_time` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `bothtime` int(50) NOT NULL,
  `statistical` time NOT NULL,
  `um_id` int(20) NOT NULL,
  `prepare1` varchar(200) DEFAULT NULL,
  `prepare2` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `um_id` (`um_id`),
  CONSTRAINT `month_time_ibfk_1` FOREIGN KEY (`um_id`) REFERENCES `usermessage` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of month_time
-- ----------------------------

-- ----------------------------
-- Table structure for outbound
-- ----------------------------
DROP TABLE IF EXISTS `outbound`;
CREATE TABLE `outbound` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `um_id` int(20) NOT NULL,
  `date` varchar(20) DEFAULT NULL,
  `number` int(10) NOT NULL,
  `used` varchar(100) NOT NULL,
  `note` varchar(100) NOT NULL,
  `prepare1` varchar(200) DEFAULT NULL,
  `prepare2` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `um_id` (`um_id`),
  CONSTRAINT `outbound_ibfk_1` FOREIGN KEY (`um_id`) REFERENCES `usermessage` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outbound
-- ----------------------------

-- ----------------------------
-- Table structure for positions
-- ----------------------------
DROP TABLE IF EXISTS `positions`;
CREATE TABLE `positions` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `position` varchar(50) NOT NULL,
  `d_id` int(20) NOT NULL,
  `prepare1` varchar(200) DEFAULT NULL,
  `prepare2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `d_id` (`d_id`),
  CONSTRAINT `positions_ibfk_1` FOREIGN KEY (`d_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of positions
-- ----------------------------

-- ----------------------------
-- Table structure for raw_materials_in_storage
-- ----------------------------
DROP TABLE IF EXISTS `raw_materials_in_storage`;
CREATE TABLE `raw_materials_in_storage` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `Production_batch_number` int(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `supply` varchar(50) NOT NULL,
  `in_data` time DEFAULT NULL,
  `in_number` int(10) NOT NULL,
  `check_number` int(10) NOT NULL,
  `check_way` varchar(50) NOT NULL,
  `check_project` varchar(20) NOT NULL,
  `check_standard` varchar(50) NOT NULL,
  `check_result` varchar(50) NOT NULL,
  `check_pass` enum('YES','NO') NOT NULL,
  `um_id` int(20) NOT NULL,
  `check_time` time DEFAULT NULL,
  `unqualified_way` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `um_id` (`um_id`),
  CONSTRAINT `raw_materials_in_storage_ibfk_1` FOREIGN KEY (`um_id`) REFERENCES `usermessage` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of raw_materials_in_storage
-- ----------------------------

-- ----------------------------
-- Table structure for userlogin
-- ----------------------------
DROP TABLE IF EXISTS `userlogin`;
CREATE TABLE `userlogin` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userlogin
-- ----------------------------

-- ----------------------------
-- Table structure for usermessage
-- ----------------------------
DROP TABLE IF EXISTS `usermessage`;
CREATE TABLE `usermessage` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `age` varchar(5) NOT NULL,
  `telephone` varchar(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `d_id` int(15) NOT NULL,
  `user_id` int(15) NOT NULL,
  `state` varchar(20) NOT NULL,
  `working_time` date NOT NULL,
  `departure_time` date DEFAULT NULL,
  `note` varchar(200) DEFAULT NULL,
  `prepare1` varchar(100) DEFAULT NULL,
  `prepare2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `telephone` (`telephone`),
  KEY `user_id` (`user_id`),
  KEY `d_id` (`d_id`),
  CONSTRAINT `usermessage_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `userlogin` (`id`),
  CONSTRAINT `usermessage_ibfk_2` FOREIGN KEY (`d_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usermessage
-- ----------------------------
