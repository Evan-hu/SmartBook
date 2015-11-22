import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.util.*;


public class international {

	public static void main(String[] args) {
//		Locale locale = new Locale("en","US");
//		ResourceBundle rBundle = ResourceBundle.getBundle("international", locale);
		ResourceBundle rBundle = ResourceBundle.getBundle("international", Locale.getDefault());
//		System.out.println(chineseStringToUnicode(rBundle.getString("test")));
		System.out.println(rBundle.getString("test"));
//		System.out.println(new InputStreamReader(rBundle.getString("test"),"UTF-8"));
		
//read txt files
		try {
		String encoding = "UTF-8";
		File file = new File("D:/workspace/SmartBook/src/test.txt");
		if (file.isFile() && file.exists()) {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
				System.out.println(read);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while (null != (lineTxt =bufferedReader.readLine())) {
					System.out.println(chineseStringToUnicode(lineTxt));
				}
				read.close();
		} else {
			System.out.println("File is not exist !");
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static String chineseStringToUnicode(String s) {
		String str = "";
//		String test="有点坑人";
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			System.out.println(ch);
			if (ch >  255)
				str +="\\u" + Integer.toHexString(ch);
			else 
				str +="\\" + Integer.toHexString(ch);
		}
		return str;
	}

}
