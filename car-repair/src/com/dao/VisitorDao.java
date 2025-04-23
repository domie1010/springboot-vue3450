package com.dao;

import java.util.List;

import com.entity.Visitor;

public interface VisitorDao {
	public void addVisitor(Visitor v);
	public void delVisitor();
	public List<Visitor> visitorList();
}
