package sword2offer;

public class FindInPartiallySortedMatrix_04 {
	public static void main(String[] args) {
		int[][] s = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		int a = 3;
		int columns = s[0].length;
		int rows = s.length;
		int x = 0;
		int y = rows-1;
		while (x <= columns-1 && y >= 0) {
			int one = s[x][y];
			if (a == one) {
				System.out.println(true);
				return;
			} else if (a < one) {
				y--;
			} else {
				x++;
			}
		}
	}
}
