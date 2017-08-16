/*�������ݿ�*/
drop database if exists examOnline; 
create database examOnline;

/*�����Ӧ���ݿ�*/
use examOnline;


/*ѧ����Ϣ��*/
create table student(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex varchar(4),
	studentclass  varchar(16) not null,
    telephone varchar(50),
    email varchar(100),
    ru int default 3,
    primary key(id)
);


/*��ʦ��Ϣ��*/
create table teacher(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex varchar(4),
    telephone varchar(50),
    email varchar(100),
    ru int default 2,
    primary key(id)
);

/*����Ա��Ϣ��*/
create table manager(
    id int not null auto_increment,
    username varchar(16) not null,
    pwd varchar(16) not null,
    name varchar(16) not null,
    sex varchar(4),
    telephone varchar(50),
    email varchar(100),
    ru int default 1,
    primary key(id)
);



/*ѡ�����*/
create table xzt(
    id int not null auto_increment,
    question varchar(1000) not null,
	answer varchar(4) not null,
	optionA varchar(100) not null,
	optionB varchar(100) not null,
	optionC varchar(100) ,
	optionD varchar(100) ,
	questiontype int default 1,
    questionpoint varchar(16),	
    primary key(id)
);


/*������*/
create table tkt(
    id int not null auto_increment,
    question varchar(1000) not null,
	answer varchar(100) not null,
	questiontype int default 2,
    questionpoint varchar(16),	
    primary key(id)
);

/*������*/
create table bct(
    id int not null auto_increment,
    question varchar(1000) not null,
	questiontype int default 3,
    questionpoint varchar(16),	
    primary key(id)
);

/*�����𰸱�*/
create table bctanswer(
    id int not null auto_increment,
    username varchar(100) not null,
	papername varchar(16),
    answerpath1 varchar(100),
    answerpath2 varchar(100),
    primary key(id)
);


/*�Ծ��*/
create table paper(
    id int not null auto_increment,
    starttime datetime,
    endtime datetime,
    papername varchar(16) not null unique,
    xzt1 int not null,
    xzt2 int not null,
    xzt3 int not null,
    xzt4 int not null,
    xzt5 int not null,
    xzt6 int not null,
    xzt7 int not null,
    xzt8 int not null,
    xzt9 int not null,
    xzt10 int not null,
    tkt1 int not null,
    tkt2 int not null,
    tkt3 int not null,
    tkt4 int not null,
    tkt5 int not null,
    bct1 int not null,
    bct2 int not null,
    primary key(id)
);



/*ѧ���ɼ���*/
create table studentgrade(
    id int not null auto_increment,
    username varchar(16) not null,
	xztscore int default 0,
	tktscore int default 0,
	bctscore int ,
	papername varchar(16) not null,
    primary key(id)
);



/*�����*/
create table mistakes(
    id int not null auto_increment,
    username varchar(100) not null,
    questiontype varchar(16),
	questionpoint int,
    primary key(id)
);





/*������Լ��*/
/*alter table ���� add foreign key(qId) references QUESTIONS(id); */



/*�������ݿ�*/
/*mysqldump -u root -p123456 examonline-> C:\backup.sql*/


/*��ԭ���ݿ�*/
/*mysql -u root -p123456 < C:\backup.sql*/


/*����MySQL��Զ���ʺ�-2������Զ�̵�½�û�����Ȩ*/
/*����벻�������ӵ� IP ������Ϊ��%�����ɡ�*/
/*grant all PRIVILEGES on ���ݿ���/���ݱ��� to root@'192.168.1.101'  identified by '123456';*/