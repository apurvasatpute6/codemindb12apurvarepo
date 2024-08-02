package Javaproject;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		System.out.println("Multi dimensional array");
		int d[][]= { {10,20,30}, {40,50,60}, {70,80,90} };
		
		System.out.println(d[0][1]+"\t");
		System.out.println(d[1][2]+"\t");
		System.out.println(d[2][0]+"\t");
		System.out.println();
		
		System.out.println("-------------------");
		
		System.out.println("Length of multidimensional array of row is =" +d.length);
		System.out.println("Length of multidimensional array of colunm is ="+d[0].length);
		
		System.out.println("-------------------------");
		
		System.out.println("multidimensional array using for loop");
		
		for(int j = 0; j < d.length; j++) {
			for (int k=0; k< d[j] .length; k++) {
				
				System.out.print(d[j][k]+ "\t");
			}
			System.out.println();
		}
		

	}

}
