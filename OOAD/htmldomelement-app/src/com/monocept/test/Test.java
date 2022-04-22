package com.monocept.test;

import java.io.FileWriter;
import java.io.IOException;

import com.monocept.model.HtmlDomGrpElement;
import com.monocept.model.HtmlDomIndvElement;

public class Test {
	public static void main(String[] args) throws IOException {
		HtmlDomGrpElement root = new HtmlDomGrpElement("div");
		HtmlDomIndvElement txt = new HtmlDomIndvElement("input", "text", "himanshusaraswat31@mail.com");
		HtmlDomIndvElement txt2 = new HtmlDomIndvElement("input", "password", "himanshu123");
		HtmlDomIndvElement btn = new HtmlDomIndvElement("input", "button", "login");

		root.addChild(txt);
		root.addChild(txt2);
		root.addChild(btn);
		System.out.println(root.render());
		generateHtmlFile(root.render());
	}

	public static void generateHtmlFile(String text) throws IOException {
		String file = "data\\login.html";
		FileWriter out = new FileWriter(file);
		String writeText = "<html>\n<head>\n<title>title</title>\n</head>\n<body>\n" + text + "\n</body>\n</html>";
		out.write(writeText);
		out.close();
		System.out.println("Html Generated");
	}
}
