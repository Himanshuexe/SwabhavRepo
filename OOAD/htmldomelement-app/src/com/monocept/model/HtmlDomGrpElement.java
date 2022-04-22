package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class HtmlDomGrpElement implements IRenderTag {
	private String tagName;
	private List<IRenderTag> childrenTag;

	public HtmlDomGrpElement(String tagName) {
		this.tagName = tagName;
		this.childrenTag = new ArrayList<IRenderTag>();
	}

	public String getTagName() {
		return tagName;
	}

	public List<IRenderTag> getChildrenTag() {
		return childrenTag;
	}

	public void addChild(IRenderTag tag) {
		childrenTag.add(tag);
	}

	@Override
	public String render() {
		String dom = "";
		dom = "<" + tagName + ">";
		for (IRenderTag tag : childrenTag) {
			dom += tag.render();
		}
		dom += "\n</" + tagName + ">";
		return dom;
	}

}
