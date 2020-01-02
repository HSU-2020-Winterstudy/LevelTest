package person;

public class Star {
	private int i, j;
	
	
	//construct Star by 4
	public Star() {
		for(i = 0; i<4;i++){
			for(j=0;j<2*4-i;j++) {
				System.out.print(" ");
			}
			
			for(j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		//piramid middle part1
		for(i = 0; i<4;i++){
			for(j = 0;j<4-i;j++)
				System.out.print(" ");
			
			for(j=0; j<=i;j++)
				System.out.print("*");
			
			for(j=0;j<4*2-1;j++)
				System.out.print(" ");
			
			for(j=0; j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
		//piramid middle part2
		for(i = 0; i<4-1;i++){
			for(j = 0;j<=i+1;j++)
				System.out.print(" ");
			
			for(j=1; j<4-i;j++)
				System.out.print("*");
			
			for(j=0;j<4*2-1;j++)
				System.out.print(" ");
			
			for(j=1; j<4-i;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
		//piramid bottom part
		for(i = 0; i<4;i++){
			for(j=0;j<=4+i;j++) {
				System.out.print(" ");
			}
			
			for(j=0;j<2*4-2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public Star(int count) {
		
		//piramid top part
		for(i = 0; i<count;i++){
			for(j=0;j<2*count-i;j++) {
				System.out.print(" ");
			}
			
			for(j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		//piramid middle part1
		for(i = 0; i<count;i++){
			for(j = 0;j<count-i;j++)
				System.out.print(" ");
			
			for(j=0; j<=i;j++)
				System.out.print("*");
			
			for(j=0;j<count*2-1;j++)
				System.out.print(" ");
			
			for(j=0; j<=i;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
		//piramid middle part2
		for(i = 0; i<count-1;i++){
			for(j = 0;j<=i+1;j++)
				System.out.print(" ");
			
			for(j=1; j<count-i;j++)
				System.out.print("*");
			
			for(j=0;j<count*2-1;j++)
				System.out.print(" ");
			
			for(j=1; j<count-i;j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
		//piramid bottom part
		for(i = 0; i<count;i++){
			for(j=0;j<=count+i;j++) {
				System.out.print(" ");
			}
			
			for(j=0;j<2*count-2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		new Star(12); 
		
	}

}
