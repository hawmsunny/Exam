package pk.cui.sc.labfinal;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag{
	
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HTMLTag> childrenTag;
	
	public HTMLParentElement(String s) {
		this.tagName = s;
		this.childrenTag = new ArrayList<HTMLTag>();
	}
	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return tagName;
	}
	@Override
	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}
	@Override
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}
	@Override
	public void generateHtml() {
		// TODO Auto-generated method stub
		System.out.println(startTag);		
		for (HTMLTag tag : childrenTag) {
            tag.generateHtml();
		}
		System.out.println(endTag);	
	}

    public void addChildTag(HTMLTag tag) {
        childrenTag.add(tag);
    }


    public void removeChildTag(HTMLTag tag) {
        childrenTag.remove(tag);
    }


    public List<HTMLTag> getChildren() {
        return childrenTag;
    }
	
	
	
	

}
