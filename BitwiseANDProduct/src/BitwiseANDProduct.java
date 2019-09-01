import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


/*
	Given  pairs of long integers, a and b, compute and print 
	the bitwise AND of all natural numbers in the inclusive range between a and b WHERE
	& is bitwise AND operator.

	For example, if 10 and 14, the calculation is 10 & 11 & 12 & 13 & 14 = 8.
*/

class BitwiseANDProduct{
	public static void main(String[] args) {
		
		System.out.println(andProduct(100663312L, 100925473L));
		
	}
	
	public static long andProduct(long a, long b) {
		long re = a;
//		long temp = re;
		
		for(long i = a + 1; i <= b; i++) {
			if((re & i) == 0) {
				re = 0;
				break;
			}
			if((re & i) != re) {
				re &= i;
//				System.out.println(temp+"(" + Long.toBinaryString(temp) + ") & " + 
//											i + " (" + Long.toBinaryString(i)  +")\t"+ 
//											re  + " (" + Long.toBinaryString(re) + ")");
//				temp = re;
			}
		}
//		System.out.println(re);
		return re;
	}
}