package com.neuq.bean;

import java.io.Serializable;

/**
 * ѧ���ɼ���
 */
public class Studentgrade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private int id;	
	private String username;
	private int score;
	private int papername;
	
	
	
	
    /**
	 * @param username ѧ���û���	
	 * @param score ѧ���ɼ�
	 * @param papername �Ծ���
	 */
	public Studentgrade(String username, int score, int papername) {
		super();
		this.username = username;
		this.score = score;
		this.papername = papername;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPapername() {
		return papername;
	}
	public void setPapername(int papername) {
		this.papername = papername;
	}
}
