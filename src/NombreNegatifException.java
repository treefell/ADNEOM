
public class NombreNegatifException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NombreNegatifException(int taille){
	    System.out.println("Vous essayez de partitionner avec un nombre négatif !");
	  }  
}