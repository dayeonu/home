public class BankAccount {  //Ŭ���� --> Ŭ���� ����� �߻�ȭ����
	
	private int balance;  //�ܾ� �������, �ν��Ͻ����� , ��Ģ : ������ �ܺο��� ���� ������ ���� ,�������� ���� �� ���Ἲ
	
	int deposit(int amount) {  //�Ա�
		
		if(amount<0)
			return 0;
		balance += amount;
		
		return balance;
	}
	
	int withdraw(int amount) {//���
		balance -= amount;
		return balance;
	}
	void checkBanance() {  //�ܰ� Ȯ��
		System.out.println("�ܾ� : " + balance);
	}
}

class MainClass{
	public static void main(String[] args) {
		
		//�Ʒ� ȭ�� ó�� ����ϱ� ���� ������ ���
		//System.out.println(); --> ���� ��� ����
		BankAccount kim = new BankAccount(); //������ȣ�� --> ����� ����Ʈ ������ȣ��� //���� ����
		kim.deposit(10000);
		kim.checkBanance();
		kim.withdraw(3000);
		kim.checkBanance();
		System.out.println("----------------------");
		//park
		BankAccount park = new BankAccount();//���� ����
		park.deposit(50000);
		park.checkBanance();
		park.withdraw(35000);
		park.checkBanance();
		System.out.println("----------------------");
				
		//Lee
		
		BankAccount lee = new BankAccount(); //���� ����
		lee.checkBanance();
		lee.deposit(15000);
		lee.checkBanance();
		lee.withdraw(5000);
		lee.checkBanance();
		System.out.println("----------------------");
		
		System.out.println("----------------------");
		
		lee = kim;
		lee.checkBanance(); //7000
		lee.deposit(10000);		
		kim.checkBanance(); //17000
		park.checkBanance(); //15000
		
	}
}
//�ܾ� : 10000
//�ܾ� : 7000
