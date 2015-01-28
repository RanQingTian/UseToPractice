import java.util.ArrayList;


public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_name="Eligi";
		ArrayList<String> description=new ArrayList<String>();
		description.add("CheerUp!");
		description.add("Fighting!");
		description.add("WillSucceed!");
		
		for(String i:description){
			System.out.println(my_name+" "+i);
		}
	}

}
