package com.monocept.lsp.violation.test;

import com.monocept.lsp.violation.Rectangle;
import com.monocept.lsp.violation.Square;

public class LSPViolationTest {
	public static void main(String[] args) {
		shouldNotChangeWidthIfHeightIsChanged(new Rectangle(10, 20));
		shouldNotChangeWidthIfHeightIsChanged(new Square(30));
	}

	public static void shouldNotChangeWidthIfHeightIsChanged(Rectangle rectangle) {
		int before = rectangle.getWidth();
		rectangle.setHeight(rectangle.getHeight() + 10);
		int after = rectangle.getWidth();
		System.out.println(before == after);
		System.out.println("before: " + before + "\nafter: " + after);
	}
}
