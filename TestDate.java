import  java.util.Date;
import  java.text.SimpleDateFormat;

public class TestDate {
	public static void main(String args[]) {
		Date d = new Date("2/20/2222");
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		System.out.print(format.format(d));
	}
}
