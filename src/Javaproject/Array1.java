package Javaproject;

public class Array1 {

	public static void main(String[] args) {
		int a[] = {8, 4, 90, 77, 69, 90, 600};
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Print Numbers in ascending order:");
		for (int k =0; k < a.length; k++) {
			System.out.print(a[k]+"\t");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		//print number in array in descending orders
		for (int i = 0; i <a.length; i++) {
			for (int j = i+1; j<a.length; j++) {
				if (a[i] < a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Print Numbers in descending order:");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------");
		
		//print array length
		System.out.println("length of array is=" +a.length);
		System.out.println("---------------------------");
		
		//print largest and smallest number in given array
		System.out.println("Largest number in given array=" + a[0]);
		System.out.println("Smallest number in given array=" + a[a.length-1]);
		System.out.println("-----------------------------");
		
		//Print Third largest and smallest number in given array
		System.out.println("Third largest number in given array=" +a[2]);
		System.out.println("Third smallet number in given array=" +a[a.length - 3]);
		
		
		
		
		
		
		
		
		

	}

}
