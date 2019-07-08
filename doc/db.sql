use afm_customer;

DROP TABLE IF EXISTS `afm_customer`.`customer`;
CREATE TABLE IF NOT EXISTS `afm_customer`.`customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `name` varchar(50) NOT NULL COMMENT '用户名',
  `gender` char(1) NOT NULL DEFAULT '0' COMMENT '性别 0-保密|1-男|2-女',
  `password` varchar(200) NOT NULL COMMENT '密码',
  `balance` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '余额',
  `integral` int(11) NOT NULL DEFAULT '0' COMMENT '积分',
  `logintime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `addtime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uname` (`uname`) COMMENT '用户名唯一'
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='用户信息'