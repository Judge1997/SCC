package iocsample;

import java.util.HashMap;
import java.util.Map;

public class Hello {
	
	Map<String, String> languageMap;
	
	public Hello() {
		languageMap = new HashMap<String,String>();
	}
	
	public void setLanguageMap(Map<String,String> map) {
		this.languageMap = map;
	}
	
	public String toString() {
		String result = "";
		for (String key : languageMap.keySet()) {
			result += key + " : " + languageMap.get(key) + "\n";
		}
		return result;
	}
}
