import java.util.ArrayList;
import java.util.List;

public class Library {
		

		// Could use Long to avoid having negative
		public static <T> List<List<T>> partition(List<T> liste, int taille){// throws NombreNegatifException{
		    List<List<T>> parts = new ArrayList<List<T>>();
		    int len = liste.size();
		    int limite;
		    /*
		     * this is in comment to easier the use case of partition.
		     */
		    /*if (taille < 0)
		    {
		    	throw new NombreNegatifException(taille);
		    }
		    if (taille == 0)
		    	return parts;*/
		    if (taille <= 0)
		    	return parts;
		    
		    else
		    {
		    	for (int i = 0; i < len; i += taille) {
		    		if(i+taille > len)
		    			limite = len;
		    		else
		    			limite = i+taille;
		        	parts.add(new ArrayList<T>(liste.subList(i, limite)));	
		    	}
		    }
		    return parts;
	}
}
