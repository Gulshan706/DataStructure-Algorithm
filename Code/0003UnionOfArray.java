    /*
    
    Problem Statement
    -----------------
    Given two Array set1 and set2, find the union of the both set.
    
    Time Complexity  : 
    Space Complexity :
    
    */


class UnionOfSet{

public static int[] union(int [] set1, int [] set2) {
		HashSet<Integer> set= new HashSet<Integer>();
	   
		for(int i=0;i<set1.length;i++)
			set.add(set1[i]);
		
		for(int i=0;i<set2.length;i++)
			set.add(set2[i]);
		
		int[] union = new int[set.size()];
		int count=0;
		
		for(int i:set)
			union[count++]=i;
		
	return union;
	
	}
}
