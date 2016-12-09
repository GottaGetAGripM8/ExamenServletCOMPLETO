package model;

public class Language {
		
		private int IdLanguage;
		private String NameLang, NameCountry;
		
		
		public String getNameLang(){
			return NameLang;
		}
		
		public void setNameLang(String n){
			NameLang = n;
		}
		
		public int getIdLanguage(){
			return IdLanguage; 
		}
		
		public void setIdLanguage(int i){
			IdLanguage = i;
		}

		public String getNameCountry(){
			return NameCountry;
		}
		
		public void setNameCountry(String p){
			NameCountry = p;
		}
	}
