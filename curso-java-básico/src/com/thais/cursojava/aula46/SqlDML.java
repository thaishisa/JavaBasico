package com.thais.cursojava.aula46;

public interface SqlDML {
	
	void insert(String queery);
	void update(String queery);
	void delete(String queery);
	String select(String queery);

}
