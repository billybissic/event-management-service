DROP TABLE IF EXISTS `events`;

CREATE TABLE `events` (
  `event_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_name` varchar(255) DEFAULT NULL,
  `event_description` varchar(255) DEFAULT NULL,
  `event_host` varchar(255) DEFAULT NULL,
  `event_location` varchar(255) DEFAULT NULL,
  `event_primary_color` varchar(255) DEFAULT NULL,
  `event_secondary_color` varchar(255) DEFAULT NULL,
  `event_start` varchar(255) DEFAULT NULL,
  `event_end` varchar(255) DEFAULT NULL,
  `event_frequency_id` int(11) DEFAULT NULL,
  `event_image_id` int(11) DEFAULT NULL,
  `event_status_id` int(11) DEFAULT NULL,
  `event_type_id` int(11) DEFAULT NULL,
  `resizable_after_start` bit(1) NOT NULL,
  `resizable_before_start` bit(1) NOT NULL,
  `all_day_event` bit(1) NOT NULL,
  `draggable` bit(1) NOT NULL,
  `last_changed_timestamp` varchar(255) DEFAULT NULL,
  `last_updated_by` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `event_status`;
CREATE TABLE `event_status` (
  `event_status_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_status_name` varchar(255) DEFAULT NULL,  
  `event_status_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`event_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `event_types`;
CREATE TABLE `event_types` (
  `event_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_type_name` varchar(255) DEFAULT NULL,  
  `event_type_description` varchar(255) DEFAULT NULL,
  `primary_color` varchar(255) DEFAULT NULL,
  `secondary_color` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`event_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `event_frequency`;
CREATE TABLE `event_frequency` (
  `event_frequency_id` int(11) NOT NULL AUTO_INCREMENT,
  `event_frequency_name` varchar(255) DEFAULT NULL,  
  `event_frequency_description` varchar(255) DEFAULT NULL,
  `event_frequency_multiplier` int(11) DEFAULT NULL,
  PRIMARY KEY (`event_frequency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;