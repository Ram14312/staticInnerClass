package org.studySpring.demo;

public class TestStatic {
      
	public static void testOuter() {
		System.out.println(Outer.var);
		Outer.goodWork();
	}
	
	 
	public static class Outer{
		public static void test() {
			System.out.println("test is done");
		}
			private static int var = 0;
			
			private static void  goodWork() {
				System.out.println("appreciated goodwork");
			}
		}
	}


