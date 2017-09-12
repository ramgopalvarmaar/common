import java.lang.reflect.Method;

import org.apache.commons.lang.StringUtils;

import com.archmi.service.ldap.common.ServiceIOBean;

public class Test {

	public static void main(String[] args) {
		
		ServiceIOBean syndrome = new ServiceIOBean();
		Method[] methods = syndrome.getClass().getMethods();

		for (int index = 0; index < methods.length; index++) {

			if (methods[index].getName().contains("set")) {
				String temp = methods[index].getName().replace("set", "");
				System.out.println(StringUtils.uncapitalize(temp));
			}

			if (methods[index].getName().contains("set")) {
				System.out.println("serviceIOBean." + methods[index].getName() + "(\"Test\");");
			}

		}
	}

}
