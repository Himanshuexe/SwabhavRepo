package com.monocept.lsp.solution.test;

import com.monocept.lsp.solution.*;;

public class LSPSolutionTest {
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
