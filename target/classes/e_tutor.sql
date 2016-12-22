--��ʼ�����ݿ�ű�

--�������ݿ�
CREATE DATABASE e_tutor;
--ʹ�����ݿ�
use e_tutor;
--�����û���
CREATE TABLE user_profile(
`user_id` 	BIGINT 			NOT NULL AUTO_INCREMENT COMMENT '�û�id',
`user_name` VARCHAR(150)	NOT NULL COMMENT '�˺�',
`passwaord` VARCHAR(150) 	NOT NULL COMMENT '����',
`role`	 	VARCHAR(50) 	NOT NULL COMMENT '��ɫ',
`state`  	tinyint  		NOT NULL DEFAULT 0 COMMENT '״ֵ̬��0����Ч    1����Ч ',
PRIMARY KEY (user_id)
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='�û�';
--ΨһԼ���˺��ֶ�
ALTER TABLE `user_profile` ADD UNIQUE(`user_name`);  
--��ʼ���û�����
insert into
	user_profile(user_name,passwaord,role,state)
values
	('admin','admin.1234','admin',1),
	('huangmj','hmj.1234','student',1),
	('zenglan','zl.1234','student',1),
	('110','110.abcd','teacher',1);

--������ʦ��
create table tutor(
	`tutor_id` 			BIGINT NOT NULL AUTO_INCREMENT COMMENT '��ʦid',
	`tutor_name` 		VARCHAR(150) NOT NULL COMMENT '��ʦ����',
	`tutor_number` 		VARCHAR(250) NOT NULL COMMENT '��ʦ���',
	`tutor_title`		VARCHAR(150) NOT NULL COMMENT '��ʦְ��',
	`tutor_info`		VARCHAR(500)  COMMENT '��ʦ���',
	`user_profile_id` 	BIGINT NOT NULL COMMENT '�����û�id',
	PRIMARY KEY(tutor_id,user_profile_id)/*��������*/
)ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='��ʦ��';

--��ʼ����ʦ����
insert into
	tutor(tutor_name,tutor_number,tutor_title,tutor_info,user_profile_id)
values
	('����ʦ','00201320620135','����','',1003),
	('����ʦ','22201412345678','������','����ʦ�Ǹ���ֽ������',1004);

--����ѧ����
create table student(
	`student_id` 		BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ѧ��id',
	`student_name` 		VARCHAR(150) NOT NULL COMMENT 'ѧ������',
	`student_number` 	VARCHAR(250) NOT NULL COMMENT 'ѧ�����',
	`studennt_info`		VARCHAR(500)  COMMENT 'ѧ�����',
	`user_profile_id` 	BIGINT NOT NULL COMMENT '�����û�id',
	`tutor_id`			BIGINT COMMENT '������ʦid',
	PRIMARY KEY(student_id,user_profile_id)/*��������*/
)ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='ѧ����';

--��ʼ��ѧ������
insert into
	student(student_name,student_number,studennt_info,user_profile_id,tutor_id)
values
	('��С��','201320620135','',1001,100),
	('������','201412345678','����ѧ��',1002,101);	
			
		




