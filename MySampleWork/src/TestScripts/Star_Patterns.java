package TestScripts;

public class Star_Patterns {
	
	/**
	**
	***
	*****/
	public static void main(String[] args) {
		int noOfStars=10;
		for (int i=1;i<10;i++){
			for(noOfStars=1;noOfStars<i;noOfStars++){
				System.out.print("*");
				
			}
			System.out.print("\n ");
		}
	}

	/*public static void main(String[] args) {
	int noofStars=10;
	for(int i=noofStars;i>0;i--){
		for(int j=0;j<i;j++){
			System.out.print("*");
		
		}
		System.out.print("\n");
	}
	}
	*/
	
	
}
