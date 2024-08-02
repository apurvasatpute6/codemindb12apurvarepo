package Javaproject;

public class ArrayOperator {
	
	public static void main(String[] args) {
		System.out.println("//single dimensional array");
		
		int a[]= {100 ,200, 300, 400, 500, 600};
		
		System.out.print(a[0] + "\t");
		System.out.print(a[1] + "\t");
		System.out.print(a[2] + "\t");
		System.out.print(a[3] + "\t");
		System.out.print(a[4] + "\t");
		System.out.print(a[5] + "\t");
		

		System.out.println();
		System.out.println("-------------------------");
		System.out.println("lenght of single dimensional array is =" +a.length);
		
		System.out.println("--------------------------");
		System.out.println("print single dimensional array using for loop");
		int i;
		for(i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+"\t");
		}
	}
}

		
		//multidimensional array
		system.out.println("//multidimensional array");

		int b[][] = {{10,20,30},{40,50,60},{70,80,90}};

		system.out.println(b[1][0]+"\t");
		system.out.println(b[2][1]+"\t");
		system.out.println(b[1][2]+"\t");
		system.out.println(b[0][2]+"\t");
		system.out.println("---------------------------");

		system.out.println("Length of multidimensional array of row is="+b.length);
		system.out.println("Length of multidimensional array of column is="+b[0].length);

		system.out.println("-----------------------");
		system.out.println("print multi dimensional array using for loop");

		for(int j=0; j<b.length; j++) {
			for(int k=0; k< b[j].length; k++) {
				System.out.print(b[j][k]+"\t");
			}
					System.out.println();
					
		

	}

}
}








