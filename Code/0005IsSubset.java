 /*
    
    Problem Statement
    -----------------
    Given two Array set1 and set2, find set1 is subset of set2. If yes then result will be true otherwise false
    
    Time Complexity  : 
    Space Complexity :
    
    */


class Subset{
public static boolean isSubset(int[] set1, int[] set2) {

		boolean flag = true;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i : set1)
			set.add(i);

		for (int i : set2)
			if (!(set.contains(i)))
				flag = false;

		return flag;
	}
}
