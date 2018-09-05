CREATE TABLE `dreamtale_user`.`base_user`  (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '数据库自增主键',
  `user_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `user_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户名',
  `user_passaord` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'MD5加密后的用户密码',
  `user_nick_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户昵称',
  `open_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '对外开放ID',
  `mobile` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户手机号',
  `email` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户电子邮件',
  `status` int(2) NULL COMMENT '用户状态【1-正常状态 2-禁用状态】',
  `real_name_check_status` int(2) NULL COMMENT '用户实名认证状态【1-已实名认证 2-未实名认证 3-实名认证未通过】',
  `email_check_status` int(2) NULL COMMENT '邮箱认证状态【1-已认证 2-未认证 3-认证未通过】',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  INDEX `dreamtale_user`(`user_id`, `user_name`, `user_nick_name`, `open_id`, `mobile`, `email`) USING BTREE
);