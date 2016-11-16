package utilpackage;

public class Idioma {
		
		private int idIdioma;
		private String nomIdioma, nomPais;
		
		
		public String getnomIdioma(){
			return nomIdioma;
		}
		
		public void setnomIdioma(String n){
			nomIdioma = n;
		}
		
		//---------------------------------//
		
		public int getIdIdioma(){
			return idIdioma; 
		}
		
		public void setidIdioma(int i){
			idIdioma = i;
		}

		//---------------------------------//
		
		public String getnomPais(){
			return nomPais;
		}
		
		public void setnomPais(String p){
			nomPais = p;
		}
	}
