package pk.cui.sc.labfinal;

import java.util.List;

public abstract class HTMLTag {
	public HTMLTag(){
		
	}
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tag) {
		throw new UnsupportedOperationException("Unsupported Operation Exception");
	}
	public void addChildTag(HTMLTag tag) {
		throw new UnsupportedOperationException("Unsupported Operation Exception");
	}
	public void removeChildTag(HTMLTag tag) {
		throw new UnsupportedOperationException("Unsupported Operation Exception");
	}
	public List<HTMLTag> getChildren(){

		throw new UnsupportedOperationException("Unsupported Operation Exception");
	}
	
	public abstract void generateHtml();
	
}