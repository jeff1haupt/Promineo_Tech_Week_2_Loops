
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		while(i <= 100) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("\n\n-------------\n\n");
		
		int j = 100;
		while(j > 0) {
			System.out.println(j);
			j = j - 3;
		}
		
		System.out.println("\n\n-------------\n\n");
		
		for(int k=1; k < 100; k=k+2) {
			System.out.println(k);
		}
		
		System.out.println("\n\n-------------\n\n");
		
		for(int t=0; t < 100; t++) {
			if(t % 3 == 0) {
				if(t % 5 == 0) {
					System.out.println("Hello World");
				} else {
					System.out.println("Hello");
				}
			} else if(t % 5 == 0){
				System.out.println("World");
			} else {
				System.out.println(t);
			}
			
		}
	}
	

}
