package h2;

public class DeleteFromTable {
	
	private static H2Query h2query = new H2Query();
	 
	public void deleteTableIdiomas(String name) {
    	
    	String sql = "DELETE FROM Idiomas WHERE nomPais='" + name + "'";
    	
		h2query.doSqlQuery(sql);

    } 
	
	public void deleteTablePaises(String name) {
    	
    	String sql = "DELETE FROM Paises WHERE nomPais='" + name + "'";
    	
		h2query.doSqlQuery(sql);

    } 
    
} 