package h2;

public class DeleteFromTable {
	
	private static H2Query h2query = new H2Query();
	 
	public void deleteTableIdiomas(String nom) {
    	
    	String sql = "DELETE FROM Idiomas WHERE nomPais='" + nom + "'";
    	
		h2query.doSqlQuery(sql);

    } 
	
	public void deleteTablePaises(String nom) {
    	
    	String sql = "DELETE FROM Paises WHERE nomPais='" + nom + "'";
    	
		h2query.doSqlQuery(sql);

    } 
    
} 