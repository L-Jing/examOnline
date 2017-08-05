package com.neuq.bean;

import java.io.Serializable;

/**
 * ѧ����
 */
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String username;
	private String pwd;
	private String name;
	private char sex;
	private String studentclass;
	private String telephone;
	private String email;
	private int ru;
	
	public Student() {
		// TODO �Զ����ɵĹ��캯�����
	}
		
	
	/**
	 * @param username ѧ���û���
	 * @param pwd ѧ������
	 * @param name ѧ������
	 * @param sex ѧ���Ա�
	 * @param studentclass ѧ�����ڰ༶
	 * @param telephone ѧ���绰
	 * @param email ѧ������
	 * @param ru ����ԱȨ��1����ʦȨ��2��ѧ��3
	 */
	public Student(String username, String pwd, String name, char sex, String studentclass, String telephone,
			String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.studentclass = studentclass;
		this.telephone = telephone;
		this.email = email;
		this.ru = 3;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRu() {
		return ru;
	}
	public void setRu(int ru) {
		this.ru = ru;
	}

}
