package com.monocept.model;

public class HtmlDomIndvElement implements IRenderTag {
	private String tagName;
	private String type;
	private String value;

	public HtmlDomIndvElement(String tagName, String type, String value) {
		this.tagName = tagName;
		this.type = type;
		this.value = value;
	}

	public String getTagName() {
		return tagName;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String render() {
		String dom = "";
		dom = "\n <" + tagName + " type=\"" + type + "\" value=\"" + value + "\">";
		return dom;
	}
}
