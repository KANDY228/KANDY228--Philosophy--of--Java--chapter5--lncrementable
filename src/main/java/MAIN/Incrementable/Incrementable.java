package MAIN.Incrementable;

	class Incrementable {
		StaticTest stl = new StaticTest();
		
		StaticTest st2 = new StaticTest();
		
		static class StaticTest {
			
			static int i = 47;
	}
		static void increment( ) { StaticTest.i++; }
		
}
