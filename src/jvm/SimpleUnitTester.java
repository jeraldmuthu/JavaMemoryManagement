package jvm;

import java.lang.reflect.Method;

public class SimpleUnitTester {

	public static void main(String[] args) throws Exception {

		Class clazz = Class.forName("jvm.Reflection");

		int failureCount = execute(clazz);
		System.out.println(failureCount);

	}

	public static int execute(Class clazz) throws Exception {
		int failedCount = 0;

		Reflection refObject = null;
		try {
			refObject = (Reflection) clazz.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Can't instantiate ...");
		} catch (IllegalAccessException e) {
			System.out.println("Can't access ...");
		}

		for (Method m : clazz.getDeclaredMethods()) {
			if (m.getName().startsWith("test")) {
			if (m.getReturnType().getName().equals("boolean")) {
				Method method = clazz.getDeclaredMethod(m.getName());
				Object result = method.invoke(refObject);
				Boolean d = (Boolean) result;
				System.out.println(d);
				if (d == false) {
					failedCount++;
				}
			}
			}
		}
		return failedCount;
	}

}
