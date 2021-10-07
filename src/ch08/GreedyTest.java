package ch08;

//그리디(Greedy) 알고리즘
//문제: 가게에 간 철수는 8370원 어치 물건을 구매하였습니다. 
//철수에게는 500원짜리 20개 100원짜리 20개  50원짜리 20개 10원짜리 20개의 동전이 있습니다. 
//철수는 금액을 지불 할 때 단위가 큰 동전부터 지불하려고 합니다. 철수가 지불하게 되는 각 동전의 개수를 구하세요.
public class GreedyTest {

	public static void main(String[] args) {
		int [] coins = {500,100,50,10};
		int price =8370;
		int count;
		
		for(int i=0; i<coins.length; i++) {
			count =0;
			count += price/coins[i];
			price = price % coins[i];
			
			System.out.println(coins[i] + "짜리 동전" +count + "개가 필요합니다.");
					
		}
	}

}
