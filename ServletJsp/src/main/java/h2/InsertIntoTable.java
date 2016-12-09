package h2;

public class InsertIntoTable {
	
	private static H2Query h2query = new H2Query();
	
    public void insertTableCountries(String name) {      
    	final String sql = "REPLACE INTO Paises (nomPais) VALUES ('" + name + "')";
    	
    	h2query.doSqlQuery(sql);
    } 
    
    public void insertTableLanguages(String lang, String nameC) {    
    	final String sql = "REPLACE INTO Idiomas (nomIdioma, nomPais) VALUES ('" + lang + "', '" + nameC +"')";
    	
    	h2query.doSqlQuery(sql);	
    } 
    
} 