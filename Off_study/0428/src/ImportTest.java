import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {

		//����Ʈ �ؾ��ϴµ� ��Ʈ�� ����Ʈ O �ϸ� �ȴ�. �ڹ� ��ƿ �����ϸ� ��. 
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat(" yyyy/mm/dd ");
		SimpleDateFormat time = new SimpleDateFormat(" hh:mm:ss ");
		
		System.out.println("���� ��¥��" + date.format(today));
		System.out.println("���� �ð���" + time.format(today));
	}

}
