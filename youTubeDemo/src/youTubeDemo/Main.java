package youTubeDemo;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar1 = new int[]{1,2,3};
		int[] sayilar2 = new int[]{10,20,30};
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);

	}

}
