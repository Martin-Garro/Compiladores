import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TablaSimbolo {
     private final  List<Simbolo>  tablaSimbolo = new ArrayList<>();
     int i=0;

    public TablaSimbolo() {
       
    }
     
     
     public Simbolo buscar (String nombre){
        // System.out.println("llego  "+nombre);
         Iterator<Simbolo> it= tablaSimbolo.iterator();
             for(; it.hasNext();){
                Simbolo a =it.next();
                //Iteratator para recorrer una lista de elementos y para realizar esto dispone de hasNext que nos permite devolver si existe un siguiente elemento a la hora de iterar   
                 if( a.getNombre().equals(nombre)){
                     return a;
                    
                 }
             }
        
             return null;

     }
     
     public void insertar (Simbolo s){
         if (this.buscar(s.getNombre())==null){
             tablaSimbolo.add(s);
         }else System.out.println("simbolo existente");
         
     }
     
     public String toString(){
		  String result = ""; 
		  Iterator<Simbolo> it= tablaSimbolo.iterator();
             for(; it.hasNext();){
				Simbolo a =it.next(); 
                result+=a.toString();
                    
                 
             }
		 return result;
	}     
}
