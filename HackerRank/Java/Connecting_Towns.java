import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Connecting_Towns {
//https://www.hackerrank.com/challenges/connecting-towns
    public static void main(String[] args){
		//run test cases
		//test();
		//run inputs
		run();


	}

	public static void test(){
		//test values
		int[] test1 = {1,3};
		int[] test2 = {2,2,2};
		int[] test3 = {3, 784, 945, 778, 736, 252, 406, 796, 252, 621,
				      298, 513, 826, 159, 396, 502, 818, 820, 959, 826,
				      880, 728, 729, 26, 665, 609, 31, 711, 950, 908,
				 	  50, 203, 940, 863, 662, 476, 50, 733, 825, 871,
				 	  234, 133, 395, 680, 95, 290, 125, 909, 361, 593,
				 	  946, 534, 133, 798, 305, 266, 683, 856, 876, 446,
				      510, 900, 947, 254, 228, 101, 445, 125, 729, 559,
				 	  632, 978, 224, 767, 151, 290, 481, 912, 462, 638,
				 	  892, 823, 570, 718, 129, 699, 602, 965, 838, 943,
				 	  355, 968, 779, 928};


		//test case
		findRoutes(test1);
		findRoutes(test2);
		findRoutes(test3);
	}

	public static void run(){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i=0; i<testCases; i++){
			int towns = in.nextInt();
			int[] routesBetween = new int[towns-1];
			for(int j=0; j<towns-1; j++){
				routesBetween[j] = in.nextInt();
			}
			findRoutes(routesBetween);
		}
		in.close();
	}

 	public static void findRoutes(int[] routes){
		int result = 1;

		for(int i=0; i<routes.length; i++){
			result = (result * routes[i]) % 1234567;
		}
        System.out.println(result);
    }

}
