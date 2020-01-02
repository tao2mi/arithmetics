package sword2offer;

public class DuplicationInArrayNoEdit_03_02_ {
	public static void main(String[] args) {
		int[] s = {5, 3, 4, 1, 5, 2};
		System.out.println(getTheRepeat(s));
		
	}
	
	public static int getTheRepeat(int[] s) {
		int n = s.length;
		
		
		int start = 0;
		int end = n-1;
		while (start < end) {
			
			int mid = (end+start)/2;
			
			int num = 0;
			for (int i=0; i<n; i++) {
				if (s[i]<=mid) {
					num++;
				}
			}
			if (num <= mid) {
				start = mid+1;
			} else {
				end = mid;
			}
		}
		
		
		return (end+start)/2;
	}
}
