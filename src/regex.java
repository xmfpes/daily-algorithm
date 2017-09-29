import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args) {
		String data = "ab2v9bc13j5jf4jv21";
		data = data.replaceAll("[^-?0-9]+", " ");
		data = data.trim();
		String split[] = data.split(" ");
		for(String num : split) {
			int val = Integer.parseInt(num);
			if(val % 2 == 1) {
				System.out.println(val + "^2=" + val * val);
			}
		}
	}
}
