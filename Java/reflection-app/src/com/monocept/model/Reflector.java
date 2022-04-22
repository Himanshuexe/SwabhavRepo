package com.monocept.model;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.monocept.model.NeedToRefactor;

public class Reflector {
	public static void findNeedRefactoringMethods(Class classname) {
		Method[] methods = classname.getMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.print("Method:" + method.getName() + " Method: " + method.getReturnType().getName()
						+ " Method Parameters:");
				Parameter[] parameters = method.getParameters();
				for (Parameter parameter : parameters) {
					System.out.print(parameter.getType());
				}
				System.out.println();
			}
		}
	}
}
