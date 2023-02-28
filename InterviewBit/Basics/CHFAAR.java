/ *
Problem Description

A chips factory is packing chips in packets.
The packets of chips are represented as an array A.
Find the packet of chips which are empty (Ai = 0) and move them to the end of the array.
Return the resultant array.

  
   Time  Complexity : O(n)
   Space Complexity : O(n)
*/
  
 

public int[] chipsFactory(int[] chips) {
  
    int pos=0;
    int [] chipsPacket= new int [chips.length];
    
     for(int chipsCount:chips)
      if(chipsCount!=0)
      chipsPacket[pos++]=chipsCount;
    
    return chipsPacket;
  
    }
