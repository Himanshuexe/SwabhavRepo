package com.monocept.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.monocept.product.factory.IAutoFactory;

public class Test3 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {

		loadInstanceFromPropFile();
	}

	public static IAutoFactory loadInstanceFromPropFile()
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
		Properties prop = new Properties();
		InputStream input = null;

		input = new FileInputStream("resources/factory.properties");
		prop.load(input);
		String string = prop.getProperty("name");
		System.out.println(string);

		IAutoFactory aFactory = (IAutoFactory) Class.forName(string).getMethod("make", null).invoke(, null);

//			Class clazz=aFactory;
//			
//			Method method=aFactory.getMethod("getInstance",String.class);

//			String classPath=string.substring(string.lastIndexOf(".") + 1);
//			System.out.println(classPath);
//			
//			Class c=Class.forName(classPath);
//			System.out.println(c.getClassLoader());

		return aFactory;
	}
}
