	// �ڹ��� ���� ���� 6-14
	//������ this()
	//�����ڿ��� �ٸ� ������ ȣ���� �� ���.
	//iv�ʱ�ȭ ������ 
class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){
		//Card("white","auto",,4); �ڵ��� �ߺ��� ������ �ڵ尡 �Ʒ��� ���� �ڵ��̴�. 
		this("white","auto",4); //������ ȣ��
		//Car2���� ���� ȣ���ؾ��ϴµ� this��� ���. �Ű����� ������ 3���� ȣ���Ѵ�.
		// ���� Ŭ���� ���� �����ڵ鳢���� ȣ���Ҷ��� Ŭ�����̸���ſ� "this"������. ������ ��Ģ�̴�.
		//�׸��� �ٸ� ������ ȣ�� �� ù�ٿ����� ��밡���ϴ�. 
		//�����ڳ��� ȣ�� �ÿ��� �ݵ�� ù�ٿ� ����Ѵ�. 
		} 	 
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
