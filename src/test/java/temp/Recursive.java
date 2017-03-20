package temp;

public class Recursive {

	public static void main(String[] args) {
		print(1);
	}
	
	public static void print(int i){
		System.out.println(i);
		i++;
		if(i==100)
			return;
		
		print(i);
		
	}

}
