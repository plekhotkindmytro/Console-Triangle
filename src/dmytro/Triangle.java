package dmytro;

public class Triangle {

	public static void main(String[] args) {
		printFilledTriangle(11);
		printEmptyTriangle(11);
	}

	static void printFilledTriangle(int size) {
		for (int i = size; i > 0; i--) {
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < size; j++) {
				if (j >= i && j < size - i) {
					builder.append("*");
				} else {
					builder.append(" ");
				}
			}
			if (builder.indexOf("*") != -1) {
				System.out.println(builder.toString());
			}

		}
	}

	static void printEmptyTriangle(int size) {
		for (int i = size; i > 0; i--) {
			StringBuilder builder = new StringBuilder();
			for (int j = 0; j < size; j++) {
				if (i < (size + 1) / 2 && (j == i || j == size - i - 1) || (i == 1 && j >= i && j < size - i)) {
					builder.append("*");
				} else {
					builder.append(" ");
				}
			}
			if (builder.indexOf("*") != -1) {
				System.out.println(builder.toString());
			}

		}
	}
}
