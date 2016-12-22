--初始化数据库脚本

--创建数据库
CREATE DATABASE e_tutor;
--使用数据库
use e_tutor;
--创建用户表
CREATE TABLE user_profile(
`user_id` 	BIGINT 			NOT NULL AUTO_INCREMENT COMMENT '用户id',
`user_name` VARCHAR(150)	NOT NULL COMMENT '账号',
`passwaord` VARCHAR(150) 	NOT NULL COMMENT '密码',
`role`	 	VARCHAR(50) 	NOT NULL COMMENT '角色',
`state`  	tinyint  		NOT NULL DEFAULT 0 COMMENT '状态值：0：无效    1：有效 ',
PRIMARY KEY (user_id)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户';
--唯一约束账号字段
ALTER TABLE `user_profile` ADD UNIQUE(`user_name`);  
--初始化用户数据
insert into
	user_profile(user_name,passwaord,role,state)
values
	('admin','admin.1234','admin',1),
	('huangmj','hmj.1234','student',1),
	('zenglan','zl.1234','student',1),
	('110','110.abcd','teacher',1);

--创建导师表
create table tutor(
	`tutor_id` 			BIGINT NOT NULL AUTO_INCREMENT COMMENT '导师id',
	`tutor_name` 		VARCHAR(150) NOT NULL COMMENT '导师姓名',
	`tutor_number` 		VARCHAR(250) NOT NULL COMMENT '导师编号',
	`tutor_title`		VARCHAR(150) NOT NULL COMMENT '导师职称',
	`tutor_info`		VARCHAR(500)  COMMENT '导师简介',
	`user_profile_id` 	BIGINT NOT NULL COMMENT '关联用户id',
	PRIMARY KEY(tutor_id,user_profile_id)/*联合主键*/
)ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='导师表';

--初始化导师数据
insert into
	tutor(tutor_name,tutor_number,tutor_title,tutor_info,user_profile_id)
values
	('黄老师','00201320620135','教授','',1003),
	('曾老师','22201412345678','副教授','曾老师是个妹纸。。。',1004);

--创建学生表
create table student(
	`student_id` 		BIGINT NOT NULL AUTO_INCREMENT COMMENT '学生id',
	`student_name` 		VARCHAR(150) NOT NULL COMMENT '学生姓名',
	`student_number` 	VARCHAR(250) NOT NULL COMMENT '学生编号',
	`studennt_info`		VARCHAR(500)  COMMENT '学生简介',
	`user_profile_id` 	BIGINT NOT NULL COMMENT '关联用户id',
	`tutor_id`			BIGINT COMMENT '关联导师id',
	PRIMARY KEY(student_id,user_profile_id)/*联合主键*/
)ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='学生表';

--初始化学生数据
insert into
	student(student_name,student_number,studennt_info,user_profile_id,tutor_id)
values
	('黄小军','201320620135','',1001,100),
	('曾兰兰','201412345678','大三学生',1002,101);	
			
		




