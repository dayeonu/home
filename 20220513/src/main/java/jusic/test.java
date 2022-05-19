//https://yujuwon.tistory.com/entry/jsoup-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0 

package jusic;

import java.io.IOException;
import java.text.ParseException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class test {
	public static void main(String[] args) throws ParseException {
		
		String URL = "https://finance.naver.com/item/main.naver?code=373220";
		Document doc;

		try {
			doc = Jsoup.connect(URL).get();
			org.jsoup.select.Elements elem = doc.select(".date");
			String[] str = elem.text().split(" ");

			org.jsoup.select.Elements todaylist =doc.select(".new_totalinfo dl>dd");
			String name = todaylist.get(1).text().split(" ")[0];
			String name1 = todaylist.get(1).text().split(" ")[1];
			
			String juga = todaylist.get(3).text().split(" ")[1];
			String DungRakrate = todaylist.get(3).text().split(" ")[6];
			String siga =  todaylist.get(5).text().split(" ")[1];
			String goga = todaylist.get(6).text().split(" ")[1];
			String zeoga = todaylist.get(8).text().split(" ")[1];
			String georaeryang = todaylist.get(10).text().split(" ")[1];

			String stype = todaylist.get(3).text().split(" ")[3]; //상한가,상승,보합,하한가,하락 구분

			String vsyesterday = todaylist.get(3).text().split(" ")[4];
			
			System.out.print(name+":");
			System.out.print(name1);
			System.out.println();
			
			System.out.println("주가:"+juga);
			System.out.println("등락률:"+DungRakrate);
			System.out.println("시가:"+siga);
			System.out.println("고가:"+goga);
			System.out.println("저가:"+zeoga);
			System.out.println("거래량:"+georaeryang);
			System.out.println("타입:"+stype);
			System.out.println("전일대비:"+vsyesterday);
			System.out.println("가져오는 시간:"+str[0]+str[1]);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}