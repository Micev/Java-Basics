
public class _03_FullHouse {

	public static void main(String[] args) {
		String[] face = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};  
		String [] suits = { "♣", "♦", "♥", "♠" };
		int fullHouseCounter = 0;
		for (int first = 0; first < face.length; first++) {
			for (int second = 0; second < face.length; second++) {
				for (int a = 0; a < suits.length; a++) {
					for (int b = a+1; b < suits.length; b++) {
						for (int c = b+1; c < suits.length; c++) {
							for (int d = 0; d < suits.length; d++) {
								for (int e = d+1; e < suits.length; e++) {
									if(first!=second) {
									System.out.printf("(%s%s %s%s %s%s %s%s %s%s) ",face[first],suits[a],face[first],suits[b],face[first],suits[c]
																				,face[second],suits[d],face[second],suits[e]);
									
									fullHouseCounter++;}
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(fullHouseCounter+" full houses");
	}

}
