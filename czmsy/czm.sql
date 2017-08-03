/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.18 : Database - czm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`czm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `czm`;

/*Table structure for table `class` */

DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `class_classname` varchar(255) DEFAULT NULL,
  `class_classtime` datetime DEFAULT NULL,
  `class_createdate` datetime DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `FK_28qyaxewlwa6taju6l9u58are` (`course_id`),
  KEY `FK_i9lpo8y0p2v93c28ibeqno21c` (`teacher_id`),
  CONSTRAINT `FK_28qyaxewlwa6taju6l9u58are` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  CONSTRAINT `FK_i9lpo8y0p2v93c28ibeqno21c` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class` */

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_coursename` varchar(255) NOT NULL,
  `coursetype_price` int(11) DEFAULT NULL,
  `course_remaintimes` int(11) DEFAULT NULL,
  `coursetype_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`course_id`),
  UNIQUE KEY `UK_hcgnsrnvi4qu0dq7otkwdle4l` (`course_coursename`),
  KEY `FK_j3ybfebwx1wpttus88rhg7hb3` (`coursetype_id`),
  CONSTRAINT `FK_j3ybfebwx1wpttus88rhg7hb3` FOREIGN KEY (`coursetype_id`) REFERENCES `coursetype` (`coursetype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `coursetype` */

DROP TABLE IF EXISTS `coursetype`;

CREATE TABLE `coursetype` (
  `coursetype_id` int(11) NOT NULL AUTO_INCREMENT,
  `coursetype_minutes` int(11) DEFAULT NULL,
  `coursetype_name` varchar(255) NOT NULL,
  PRIMARY KEY (`coursetype_id`),
  UNIQUE KEY `UK_plwghqlydb4s9tctjgwjopk1t` (`coursetype_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coursetype` */

/*Table structure for table `lessonrecord` */

DROP TABLE IF EXISTS `lessonrecord`;

CREATE TABLE `lessonrecord` (
  `lessonrecord_id` int(11) NOT NULL AUTO_INCREMENT,
  `lessonrecord_date` datetime DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`lessonrecord_id`),
  KEY `FK_ewax0dhey3v91wl92c4msbn4r` (`class_id`),
  CONSTRAINT `FK_ewax0dhey3v91wl92c4msbn4r` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lessonrecord` */

/*Table structure for table `lessonrecord_class` */

DROP TABLE IF EXISTS `lessonrecord_class`;

CREATE TABLE `lessonrecord_class` (
  `lessonrecord_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`student_id`,`lessonrecord_id`),
  KEY `FK_biu7qr90sd9ku95s9xdwk0pmb` (`lessonrecord_id`),
  CONSTRAINT `FK_biu7qr90sd9ku95s9xdwk0pmb` FOREIGN KEY (`lessonrecord_id`) REFERENCES `lessonrecord` (`lessonrecord_id`),
  CONSTRAINT `FK_qgsxpq4552ib1oh75l98uh4yw` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lessonrecord_class` */

/*Table structure for table `parentinfo` */

DROP TABLE IF EXISTS `parentinfo`;

CREATE TABLE `parentinfo` (
  `parentinfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `parentinfo_address` varchar(255) DEFAULT NULL,
  `parentinfo_parentname` varchar(255) NOT NULL,
  `parentinfo_phonenumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`parentinfo_id`),
  UNIQUE KEY `UK_hpyij7g8ihat6j9dtjmkd4gwx` (`parentinfo_parentname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `parentinfo` */

/*Table structure for table `resource` */

DROP TABLE IF EXISTS `resource`;

CREATE TABLE `resource` (
  `resource_id` int(11) NOT NULL AUTO_INCREMENT,
  `resource_parentid` int(11) DEFAULT NULL,
  `resource_resourcename` varchar(255) NOT NULL,
  `resource_url` varchar(255) DEFAULT NULL,
  `resourcetype_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`resource_id`),
  UNIQUE KEY `UK_q95rsgntsa7s0y4guwcuf5b5k` (`resource_resourcename`),
  KEY `FK_c5qihfdhmevqejug501m4xko7` (`resourcetype_id`),
  CONSTRAINT `FK_c5qihfdhmevqejug501m4xko7` FOREIGN KEY (`resourcetype_id`) REFERENCES `resourcetype` (`resourcetype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `resource` */

/*Table structure for table `resource_role` */

DROP TABLE IF EXISTS `resource_role`;

CREATE TABLE `resource_role` (
  `role_id` int(11) NOT NULL,
  `resource_id` int(11) NOT NULL,
  PRIMARY KEY (`resource_id`,`role_id`),
  KEY `FK_lpcroq24fnt6ehxwvid4mlw8m` (`role_id`),
  CONSTRAINT `FK_djo27vl9eo7rflcsv6ruxembx` FOREIGN KEY (`resource_id`) REFERENCES `resource` (`resource_id`),
  CONSTRAINT `FK_lpcroq24fnt6ehxwvid4mlw8m` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `resource_role` */

/*Table structure for table `resourcetype` */

DROP TABLE IF EXISTS `resourcetype`;

CREATE TABLE `resourcetype` (
  `resourcetype_id` int(11) NOT NULL AUTO_INCREMENT,
  `resourcetype_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resourcetype_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `resourcetype` */

insert  into `resourcetype`(`resourcetype_id`,`resourcetype_name`) values 
(1,'mune'),
(2,'function');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_rolename` varchar(255) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `UK_empvb7wqdle78d5d1tnf2ykpd` (`role_rolename`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`role_id`,`role_rolename`) values 
(1,'admin');

/*Table structure for table `state` */

DROP TABLE IF EXISTS `state`;

CREATE TABLE `state` (
  `state_id` int(11) NOT NULL AUTO_INCREMENT,
  `state_statename` varchar(255) NOT NULL,
  PRIMARY KEY (`state_id`),
  UNIQUE KEY `UK_16dw2n5m27211fo7i04j7njsx` (`state_statename`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `state` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_age` int(11) DEFAULT NULL,
  `student_remaintimes` int(11) DEFAULT NULL,
  `student_school` varchar(255) DEFAULT NULL,
  `student_sex` varchar(255) DEFAULT NULL,
  `student_startdate` datetime DEFAULT NULL,
  `student_studentname` varchar(255) NOT NULL,
  `class_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE KEY `UK_dxmo7hqedkhnytq1xki6tf14v` (`student_studentname`),
  KEY `FK_cya9xseu9clew24bcood4bi1q` (`class_id`),
  CONSTRAINT `FK_cya9xseu9clew24bcood4bi1q` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

/*Table structure for table `student_parentinfo` */

DROP TABLE IF EXISTS `student_parentinfo`;

CREATE TABLE `student_parentinfo` (
  `student_id` int(11) NOT NULL,
  `parentinfo_id` int(11) NOT NULL,
  PRIMARY KEY (`parentinfo_id`,`student_id`),
  KEY `FK_n96by001fbsg0f5vt45ttq6ya` (`student_id`),
  CONSTRAINT `FK_drie4ribqst21g4x4a4m4cexo` FOREIGN KEY (`parentinfo_id`) REFERENCES `parentinfo` (`parentinfo_id`),
  CONSTRAINT `FK_n96by001fbsg0f5vt45ttq6ya` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_parentinfo` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_address` varchar(255) DEFAULT NULL,
  `teacher_entrydate` datetime DEFAULT NULL,
  `teacher_name` varchar(255) DEFAULT NULL,
  `teacher_phonenumber` varchar(255) DEFAULT NULL,
  `teacher_seniority` int(11) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  `teacherwage_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`),
  KEY `FK_a5b2lj554lowl2dpmxb638crp` (`state_id`),
  KEY `FK_eqqwxegv5tv0txggrvhdmliwr` (`teacherwage_id`),
  CONSTRAINT `FK_a5b2lj554lowl2dpmxb638crp` FOREIGN KEY (`state_id`) REFERENCES `state` (`state_id`),
  CONSTRAINT `FK_eqqwxegv5tv0txggrvhdmliwr` FOREIGN KEY (`teacherwage_id`) REFERENCES `teacherwage` (`teacherwage_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

/*Table structure for table `teacherwage` */

DROP TABLE IF EXISTS `teacherwage`;

CREATE TABLE `teacherwage` (
  `teacherwage_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacherwage_award` int(11) DEFAULT NULL,
  `teacherwage_basicwage` bigint(20) DEFAULT NULL,
  `teacherwage_classtimes` int(11) DEFAULT NULL,
  `teacherwage_democlasstimes` int(11) DEFAULT NULL,
  `teacherwage_fullclassperformance` double DEFAULT NULL,
  `teacherwage_refundtimes` int(11) DEFAULT NULL,
  `teacherwage_renew` int(11) DEFAULT NULL,
  `teacherwage_serviceperformance` double DEFAULT NULL,
  `teacherwage_timesoutperformance` double DEFAULT NULL,
  `teacherwage_wagedate` datetime DEFAULT NULL,
  PRIMARY KEY (`teacherwage_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacherwage` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_loginname` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_username` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_jnu1quvkutdk73q9fa4d7abe3` (`user_username`),
  KEY `FK_qleu8ddawkdltal07p8e6hgva` (`role_id`),
  CONSTRAINT `FK_qleu8ddawkdltal07p8e6hgva` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_loginname`,`user_password`,`user_username`,`role_id`) values 
(1,'admin','admin','admin',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
