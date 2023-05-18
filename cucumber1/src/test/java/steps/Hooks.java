package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	/*
	@BeforeAll
	public static void  before_all() {
		System.out.println("@BeforeAll --- Create DB Conn");
	}
	@AfterAll
	public void after_all() {
		System.out.println("@AfterAll --- Quit DB Conn");
	}
	*/
	@Before(order=0)
	public void setUp() {
		System.out.println("@Before hook - Lauching Browser");
		
	}
	
	@Before(order=1)
	public void setUp1() {
		System.out.println("@Before hook - Lauching Browser 1");
		
	}
	@After(order=1)
	public void tearDown(){
		
		System.out.println("@Before hook - Quit Browser");
	}
	@After(order=0)
	public void tearDown1(){
		
		System.out.println("@Before hook - Quit Browser 1");
	}
	/*
	@BeforeStep
	public void before_step() {
		System.out.println("@BeforeStep ---Adding a log");
	}
	@AfterStep
	public void after_step() {
		System.out.println("@AfterStep ---Adding a log");
	}
	*/
}
