package com.neuq.service.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Manager;
import com.neuq.bean.Teacher;

public interface ManagerInterfaceBiz {
	public Manager select(Manager m)throws SQLException;
	public List<Teacher> select()throws SQLException;
	public boolean insert(Teacher t)throws SQLException;
	public boolean delete(Teacher t)throws SQLException;
}
