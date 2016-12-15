import java.util.HashMap;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
        String str = "This is %s format example";
        System.out.println(String.format(str, "string"));
        String str1 = "We are displaying no %d";
        System.out.println(String.format(str1, 10));
        /**
         * String format by specifying Locale details
         */
        System.out.println("String format with Locale info:");
        System.out.println(String.format(Locale.US, str1, 10));
        
        String str10 = "类目:%3$s:%2$s:%1$s";
        String format1 = String.format(Locale.US, str10, "青岛","啤酒","酒类");
        String format2 = String.format(Locale.US, str10, "燕京","啤酒","酒类");
        String format3 = String.format(Locale.US, str10, "雪花","啤酒","酒类");
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        new HashMap<String,Object>();
        
        
	}
}
