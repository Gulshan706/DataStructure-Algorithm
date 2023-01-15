     /*
    
    Problem Statement
    -----------------
    Given two Array set1 and set2, find the intersection in the both set.
    
    Time Complexity  : 
    Space Complexity :
    
    */



class Intersection{

public static int[] intersection(int set1[], int set2[]) {

		HashSet<Integer> set = new HashSet<Integer>();

		
		for (int i = 0; i < set1.length; i++)
			set.add(set1[i]);

		HashSet<Integer> intersection = new HashSet<Integer>();

		for (int i = 0; i < set2.length; i++)
			if (set.contains(set2[i]))
				intersection.add(set2[i]);
		

		int[] array = new int[intersection.size()];
		int count = 0;
		for (int i : intersection)
			array[count++] = i;

		return array;
	}
}
