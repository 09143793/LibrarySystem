package library.test;

import org.junit.Test;

import library.model.Book;

import library.model.Member;


public class BTest {
	
@Test
	public void test() {
		
	Member m1=new Member();
		
	m1.setId("m01");
		
	m1.setName("����");
		
	Book b1=new Book("b01","001","��һ��");
		
	Book b2=new Book("b02","002","�ڶ���");
		
	Book b3=new Book("b03","003","������");
		
	Book b4=new Book("b04","004","���ı�");
		
	Book b5=new Book("b05","005","���屾");
		
		
	m1.Loan(b1);
		
	m1.Loan(b2);
		
	m1.Loan(b3);
		
	m1.Loan(b5);
	
	}	
		
}
