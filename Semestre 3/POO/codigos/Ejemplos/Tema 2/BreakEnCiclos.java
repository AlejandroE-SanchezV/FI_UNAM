class BreakEnCiclos{
	public static void main(String[] args) {
		int x = 4, y = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);

			if(i == x) break;

			y -= 2;
		}

		while(y < 100){
			if(y == 32) break;
			y += 4;
			System.out.println("y = " + y);
		}
	}
}