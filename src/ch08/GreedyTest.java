package ch08;

//�׸���(Greedy) �˰���
//����: ���Կ� �� ö���� 8370�� ��ġ ������ �����Ͽ����ϴ�. 
//ö�����Դ� 500��¥�� 20�� 100��¥�� 20��  50��¥�� 20�� 10��¥�� 20���� ������ �ֽ��ϴ�. 
//ö���� �ݾ��� ���� �� �� ������ ū �������� �����Ϸ��� �մϴ�. ö���� �����ϰ� �Ǵ� �� ������ ������ ���ϼ���.
public class GreedyTest {

	public static void main(String[] args) {
		int [] coins = {500,100,50,10};
		int price =8370;
		int count;
		
		for(int i=0; i<coins.length; i++) {
			count =0;
			count += price/coins[i];
			price = price % coins[i];
			
			System.out.println(coins[i] + "¥�� ����" +count + "���� �ʿ��մϴ�.");
					
		}
	}

}
