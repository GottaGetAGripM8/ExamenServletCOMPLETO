package h2;

public class InsertIntoTable {
	
	private static H2Query h2query = new H2Query();
	
	public static void main(String[] args) {
		
	}
	
    public static void insertTablePaises(String nom) {
        
    	String sql = "REPLACE INTO Paises (nomPais) VALUES ('" + nom + "')";
    	
    	h2query.doSqlQuery(sql);
    	
    } 
    
    public static void insertTableIdiomas(String idi, String nomp) {
        
    	String sql = "REPLACE INTO Idiomas (nomIdioma, nomPais) VALUES ('" + idi + "', '" + nomp +"')";
    	
    	h2query.doSqlQuery(sql);
    	
    } 
    
} 