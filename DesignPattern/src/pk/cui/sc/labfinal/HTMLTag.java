package pk.cui.sc.labfinal;

import java.awt.List;
import java.util.ArrayList;

public abstract class HTMLTag {
	public HTMLTag(){
		
	}
	public abstract String getTagName();
	public abstract void setStartTag();
	public abstract void setEndTag();
	public void setTagBody(String s) {
	
	}
	
	public void addChildTag(String s) {
		
	}
	
	public void removeChildTag(HTMLTag h) {
		
	}
	
	public ArrayList<HTMLTag> getChildren(){
		
		return null;
	}
	
	public abstract void generateHTML();
}