package com.neuq.bean;

import java.io.Serializable;


/**
 * �������
 */
public class Tkt implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private int id;	
	private String question;
	private char answer;
	private int questiontype;
	private String questionpoint;
	
	public Tkt() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	
	
    /**
	 * @param question ��������
	 * @param answer ������
	 * @param questiontype  ��Ŀ���ͣ�����⣩
	 * @param questionpoint  ��Ŀ֪ʶ��
	 */
	public Tkt(String question, char answer, int questiontype, String questionpoint) {
		super();
		this.question = question;
		this.answer = answer;
		this.questiontype = questiontype;
		this.questionpoint = questionpoint;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
	public int getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}
	public String getQuestionpoint() {
		return questionpoint;
	}
	public void setQuestionpoint(String questionpoint) {
		this.questionpoint = questionpoint;
	}
}
