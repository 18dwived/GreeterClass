
public class TestGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter obj = new Greeter();
		System.out.println(obj.toString());
		Greeter[]arr = new Greeter[5];
		
		for (int count = 0; count <6; count++)
		{
			arr[count] = new Greeter();
		}
		
		for (Greeter greet : arr)
		{
			System.out.println(greet.toString());
		}
		
	}

}
