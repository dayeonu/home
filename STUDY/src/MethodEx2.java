import java.text.DecimalFormat;

public class MethodEx2 {

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while ( i < limit ) {
			// "" + 1 의 과정으로 integer 형태에서 string으로 변환되는 시점이다. 
			output += i; 
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {

		// 3자리마다 콤마를 찍으려면 아래처럼 "###","###" 으로설정하면 된다.
		DecimalFormat decFormat = new DecimalFormat("###,###");
		String str = decFormat.format(12340000); 
				System.out.println(str);

		String result = numbering(1,5);
		//결과값은 1234로 숫자값의 형태를 띄고있으나 
		// 실은 문자형으로 출력된 것 이다. 
		System.out.println(result);
	
		String sum = result + "1234" + "abc";
		System.out.println(sum);
		 
	}

}
