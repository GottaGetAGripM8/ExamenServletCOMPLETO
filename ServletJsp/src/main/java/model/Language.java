package model;

public class Language {
		
		private int idLanguage;
		private String nameLang, nameCountry;
		
		
		public String getnameLang(){
			return nameLang;
		}
		
		public void setnameLang(String n){
			nameLang = n;
		}
		
		
		public int getIdLanguage(){
			return idLanguage; 
		}
		
		public void setidLanguage(int i){
			idLanguage = i;
		}

		
		public String getnameCountry(){
			return nameCountry;
		}
		
		public void setnameCountry(String p){
			nameCountry = p;
		}
	}
