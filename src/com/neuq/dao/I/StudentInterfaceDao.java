package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Student;

public interface StudentInterfaceDao {
	public Student select(Student s,Connection con)throws SQLException;
	public boolean insert(Student s, Connection con)throws SQLException;
	public boolean updata(Student s,Connection con)throws SQLException;
	public boolean delete(Student s,Connection con)throws SQLException;//����ʹ��
	
}
