public class BankAccount2 {  //Ŭ���� --> Ŭ���� ����� �߻�ȭ����
	
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

class MainClass2{
	public static void main(String[] args) {
	
		BankAccount2[] bank = new BankAccount2[3];
		
		bank[0] = new BankAccount2();
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(10000);
		bank[0].withdraw(3000);
		
		bank[0].checkBanance();
	}
}
//�ܾ� : 10000
//�ܾ� : 7000