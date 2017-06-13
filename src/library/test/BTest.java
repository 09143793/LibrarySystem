package library.test;

import org.junit.Test;

import library.model.Book;

import library.model.Member;


public class BTest {
	
@Test
	public void test() {
		
	Member m1=new Member();
		
	m1.setId("m01");
		
	m1.setName("张三");
		
	Book b1=new Book("b01","001","第一本");
		
	Book b2=new Book("b02","002","第二本");
		
	Book b3=new Book("b03","003","第三本");
		
	Book b4=new Book("b04","004","第四本");
		
	Book b5=new Book("b05","005","第五本");
		
		
	m1.Loan(b1);
		
	m1.Loan(b2);
		
	m1.Loan(b3);
		
	m1.Loan(b5);
	
	}	
		
}
