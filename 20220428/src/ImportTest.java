import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {

		//임포트 해야하는데 컨트롤 시프트 O 하면 된다. 자바 유틸 선택하면 됨. 
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat(" yyyy/mm/dd ");
		SimpleDateFormat time = new SimpleDateFormat(" hh:mm:ss ");
		
		System.out.println("오늘 날짜는" + date.format(today));
		System.out.println("현재 시간은" + time.format(today));
	}

}
