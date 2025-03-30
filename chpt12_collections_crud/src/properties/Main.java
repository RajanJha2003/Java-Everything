package properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Properties properties=new Properties();
		
		
		properties.put("username", "rajan2345");
		properties.put("password", "Rajan3409");
		
		Set set=properties.keySet();
		Iterator iterator=set.iterator();
		
		while (iterator.hasNext()) {
			String str=(String) iterator.next();
			System.out.println(str + " : "+properties.getProperty(str));
			
		}
		
		String str=properties.getProperty("username","Not found");
		String str1=properties.getProperty("password","Not found");
		System.out.println(str);
		System.out.println(str1);
	}

}
