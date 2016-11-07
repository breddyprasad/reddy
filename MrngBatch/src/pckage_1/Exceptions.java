package pckage_1;

public class Exceptions {

	public void testCenario_1() {

	}

	public void testCenario_2() {

	}

	public static void main(String[] args) {

		Exceptions myobj = new Exceptions();

		try {
			myobj.testCenario_1();
			
			

		} catch (Exception e) {

			e.printStackTrace();
		}
		finally{
			System.out.println("Closing the browser");
		}

		try {
			myobj.testCenario_2();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
