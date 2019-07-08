use afm_customer;

DROP TABLE IF EXISTS `afm_customer`.`customer`;
CREATE TABLE IF NOT EXISTS `afm_customer`.`customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(200) NOT NULL COMMENT '密码',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `name` (`name`) COMMENT '用户名唯一'
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='用户信息'