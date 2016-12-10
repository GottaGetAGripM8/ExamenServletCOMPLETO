package model;

public class Language {
		
		private int idLanguage;
		private String NameLang, NameCountry;
		
		
		public String getNameLang(){
			return NameLang;
		}
		
		public void setNameLang(String n){
			NameLang = n;
		}
		
		public int getidLanguage(){
			return idLanguage; 
		}
		
		public void setidLanguage(int i){
			idLanguage = i;   
		}

		public String getNameCountry(){
			return NameCountry;
		}
		
		public void setNameCountry(String p){
			NameCountry = p;
		}
	}
