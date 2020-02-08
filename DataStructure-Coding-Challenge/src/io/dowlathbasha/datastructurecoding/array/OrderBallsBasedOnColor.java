package io.dowlathbasha.datastructurecoding.array;

// RRGGBB
public class OrderBallsBasedOnColor {
	public static void main(String args[]) {
		char c[] = { 'R', 'B', 'R', 'G', 'B', 'G' };
		orderBalls(c);
		for (char ch : c) {
			System.out.print(" " + ch);
		}
	}

	private static void orderBalls(char[] c) {
		int red = 0;
		int blue = c.length - 1;

		if (red < blue) {
			for (int i = 0; i <= blue; i++) {
				if ('R' == c[i]) {
					char temp = c[i];
					c[i] = c[red];
					c[red] = temp;
					red++;
				} else if ('B' == c[i]) {
					char temp = c[i];
					c[i] = c[blue];
					c[blue] = temp;
					blue--;
					i--;
				}
			}
		}
	}

}
