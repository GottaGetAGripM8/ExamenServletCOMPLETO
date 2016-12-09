package h2;

public class DeleteFromTable {
	
	private static H2Query h2query = new H2Query();
	 
	public void deleteTableCountries(String name) {
    	String sql = "DELETE FROM Paises WHERE nomPais='" + name + "'";
    	
		h2query.doSqlQuery(sql);
    } 
	
	public void deleteTableLanguages(String name) {  	
    	String sql = "DELETE FROM Idiomas WHERE nomPais='" + name + "'";
    	
		h2query.doSqlQuery(sql);
    } 

} 