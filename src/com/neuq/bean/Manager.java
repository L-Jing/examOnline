package com.neuq.bean;

import java.io.Serializable;

/**
 * ����Ա��
 */
public class Manager implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String managername;
	private String pwd;
	private String name;
	private char sex;
	private String telephone;
	private String email;
	private int ru;
	
	public Manager() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
	/**
	 * @param managername ����Ա�û���
	 * @param pwd ����Ա����
	 * @param name ����Ա����
	 * @param sex ����Ա�Ա�
	 * @param telephone ����Ա�绰
	 * @param email ����Ա����
	 * @param ru ����ԱȨ��1����ʦȨ��2��ѧ��3
	 */
	public Manager(String managername, String pwd, String name, char sex, String telephone, String email) {
		super();
		this.managername = managername;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
		this.ru = 1;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
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
