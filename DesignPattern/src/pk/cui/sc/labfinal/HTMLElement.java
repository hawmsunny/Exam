package pk.cui.sc.labfinal;

public class HTMLElement extends HTMLTag{

	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;
	
	public HTMLElement(String tagName) {
        this.tagName = tagName;
    }
	
	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String s) {
		this.startTag = s;
	}

	@Override
	public void setEndTag(String s) {
		this.endTag = s;
		
	}
	
	@Override
	public void generateHtml() {
		System.out.println(startTag + "" + tagBody + "" + endTag);
	}

	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	
}
