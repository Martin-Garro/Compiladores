package codigo;

public class Arbol {
     
     private Simbolo info;
     private Arbol HI;
     private Arbol HD;
     private int id;
     static private String resultado;
     
     static int idNro = 0;
     
     public Arbol(Simbolo s){
		 
	    info = s;
	    HI = null;
	    HD = null;	
	    id = idNro;
	    idNro+=1; 
            resultado = "Chequeo de tipos exitoso";
	 }
     
     public Arbol(Simbolo s, Arbol hi, Arbol hd){
	    info = s;
	    HI = hi;
	    HD = hd;	 
	    id = idNro;
	    idNro+=1;
            resultado = "Chequeo de tipos exitoso";
	 }
     
     public int getId() {
        return id;
     }
     public Simbolo getInfo() {
        return info;
     }

     public Arbol getHD() {
        return HD;
     }
     
     public Arbol getHI() {
        return HI;
     }
      
     public String getResultado(){
         return resultado;
     }
     
     public String toString(){
		String result = "( Nodo: "+id +" - "+info.toString()+" - ";
		if (HI!=null) result = result + "HI : "+ HI.getId()+" - ";
		if (HD!=null) result = result + "HD : "+ HD.getId(); 
		result+=" )\n";
		if (HI!=null) result = result + HI.toString();
		if (HD!=null) result = result + HD.toString(); 
  		return result;
	}  
     
   // metodo para recorrer el arbol y compara los nodos
   public Simbolo checkType() throws Exception {
      Simbolo S1 = null;
      Simbolo S2 = null;

      if (this.getInfo().getEtiqueta() == Etiqueta.PROGRAMA) {
         HI.checkType();
         HD.checkType();
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.SENTS) {
         HI.checkType();
         if (HD != null)
            HD.checkType();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.DECLS) {
         HI.checkType();
         if (HD != null)
            HD.checkType();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.DECLARACION) {
         S1 = HI.checkType();
         S2 = HD.checkType();
         if (S1.getTipo() == S2.getTipo()) {
            this.getInfo().setTipo(S1.getTipo());
            return this.getInfo();
         } else {
            resultado = "Error de tipos en la declaracion. Linea: " + this.getInfo().getNroLinea();
            throw new Exception();
         }
      } else if (this.getInfo().getEtiqueta() == Etiqueta.ASIGNACION) {
         S1 = HI.checkType();
         S2 = HD.checkType();
         if (S1.getTipo() == S2.getTipo()) {
            return this.getInfo();
         } else {
            resultado = "Error de tipos en la asignacion. Linea: " + this.getInfo().getNroLinea();
            throw new Exception();
         }
      } else if (this.getInfo().getEtiqueta() == Etiqueta.SUMA) {
         S1 = HI.checkType();
         S2 = HD.checkType();
         if (S1.getTipo() == S2.getTipo()) {
            this.getInfo().setTipo(S1.getTipo());
            return this.getInfo();
         } else {
            resultado = "Error de tipos en la suma. Linea: " + this.getInfo().getNroLinea();
            throw new Exception();
         }
      } else if (this.getInfo().getEtiqueta() == Etiqueta.MULT) {
         S1 = HI.checkType();
         S2 = HD.checkType();
         if (S1.getTipo() == S2.getTipo()) {
            this.getInfo().setTipo(S1.getTipo());
            return this.getInfo();
         } else {
            resultado = "Error de tipos en la multipicacion. Linea: " + this.getInfo().getNroLinea();
            throw new Exception();
         }
      } else if (this.getInfo().getEtiqueta() == Etiqueta.VALORBOOLEANO) {
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.VALORENTERO) {
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.VARIABLE) {
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.RETURN) {
         HD.checkType();

      }
      return null;
   }
   
   // Evaluador del arbol
   public Simbolo evaluador() {
      Simbolo S1 = null;
      Simbolo S2 = null;

      if (this.getInfo().getEtiqueta() == Etiqueta.PROGRAMA) {
         HI.evaluador();
         HD.evaluador();
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.SENTS) {
         HI.evaluador();
         if (HD != null)
            HD.evaluador();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.DECLS) {
         HI.evaluador();
         if (HD != null)
            HD.evaluador();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.DECLARACION) {
         S1 = HI.evaluador();
         S2 = HD.evaluador();
         S1.setValor(S2.getValor());
         return S1;
      } else if (this.getInfo().getEtiqueta() == Etiqueta.ASIGNACION) {
         S1 = HI.evaluador();
         S2 = HD.evaluador();
         S1.setValor(S2.getValor());
         return S1;
      } else if (this.getInfo().getEtiqueta() == Etiqueta.SUMA) {
         S1 = HI.evaluador();
         S2 = HD.evaluador();
         if (this.getInfo().getTipo() == Tipos.INT) {
            this.getInfo().setValor(S1.getValor() + S2.getValor());
            return this.getInfo();
         } else if (this.getInfo().getTipo() == Tipos.BOOL) {
            this.getInfo().setValor(S1.getValor() + S2.getValor());
            return this.getInfo();
         }
      } else if (this.getInfo().getEtiqueta() == Etiqueta.MULT) {
         S1 = HI.evaluador();
         S2 = HD.evaluador();
         if (this.getInfo().getTipo() == Tipos.INT) {
            this.getInfo().setValor(S1.getValor() * S2.getValor());
            return this.getInfo();
         } else if (this.getInfo().getTipo() == Tipos.BOOL) {
            this.getInfo().setValor(S1.getValor() * S2.getValor());
            return this.getInfo();
         }
      } else if (this.getInfo().getEtiqueta() == Etiqueta.VALORBOOLEANO) {
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.VALORENTERO) {
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.VARIABLE) {
         return this.getInfo();
      } else if (this.getInfo().getEtiqueta() == Etiqueta.RETURN) {
         HD.evaluador();
         resultado =(resultado + "El valor de retorno es: " + HD.getInfo().getValor());
         return HD.getInfo();
      }
      return null;
   }
   
public String getCodigo() {
    String codigoEnsamblador = "";

    if (this.getInfo().getEtiqueta() == Etiqueta.PROGRAMA) {
        System.out.println("PROGRAM");
        // Inicializar la pila
        codigoEnsamblador += "main:\n";
        codigoEnsamblador += "pushq %rbp\n";
        codigoEnsamblador += "movq %rsp, %rbp\n";
        codigoEnsamblador += "subq $" + this.getInfo().getOffset() + ", %rsp\n";
        
        // Generar código para las declaraciones
        
        codigoEnsamblador += HI.getCodigo();
        codigoEnsamblador += HD.getCodigo();
        
        // Generar código para la operación de retorno
        codigoEnsamblador += "leave\n";
        codigoEnsamblador += "ret\n";
        
        return codigoEnsamblador;
        
    } else if (this.getInfo().getEtiqueta() == Etiqueta.SENTS) {
        System.out.println("SENTS");
         codigoEnsamblador += HI.getCodigo();
         if (HD != null)
            codigoEnsamblador += HD.getCodigo();
         
         return codigoEnsamblador;
      } else if (this.getInfo().getEtiqueta() == Etiqueta.DECLS) {
          System.out.println("DECLS");
         codigoEnsamblador += HI.getCodigo();
         if (HD != null)
            codigoEnsamblador += HD.getCodigo();
         
         return codigoEnsamblador;
      }else if ((this.getInfo().getEtiqueta() == Etiqueta.DECLARACION)||(this.getInfo().getEtiqueta() == Etiqueta.ASIGNACION)){
          System.out.println("DECLARACION");
          
        // Generar código para la declaración de variable
        codigoEnsamblador += HD.getCodigo();
        if (HD.getInfo().getEtiqueta() == Etiqueta.VALORENTERO){
            System.out.println("valorentero");
            codigoEnsamblador += "movl $" + HD.getInfo().getValor() + ", -" + HI.getInfo().getOffset() + "(%rbp)\n";
        } else{
            System.out.println("valorNOentero");
            codigoEnsamblador += "movl -" +HD.getInfo().getOffset() + "%(rbp) , %eax\n";
            codigoEnsamblador += "movl %eax" + ", -" + HI.getInfo().getOffset() + "(%rbp)\n";
        }
        return codigoEnsamblador;
    } else if (this.getInfo().getEtiqueta() == Etiqueta.SUMA) {
        // Generar código para la operación de suma
        codigoEnsamblador += HI.getCodigo();
        codigoEnsamblador += HD.getCodigo();
        String ob1 = "";
        String ob2 = "";
        
        if(HI.getInfo().getEtiqueta() == Etiqueta.VALORENTERO){
            ob1 = "$" + HI.getInfo().getValor();
        }
        else{
            ob1 = "-" + HI.getInfo().getOffset() + "(%rbp)";
        }
        
        if(HD.getInfo().getEtiqueta() == Etiqueta.VALORENTERO){
            ob2 = "$" + HD.getInfo().getValor();
        }
        else{
            ob2 = "-" + HD.getInfo().getOffset() + "(%rbp)";
        }
        codigoEnsamblador += "movl " + ob1 + ", %eax\n";
        codigoEnsamblador += "movl " + ob2 + ", %ecx\n";
        codigoEnsamblador += "addl %ecx, %eax\n";
        codigoEnsamblador += "movl %eax,  -" + this.getInfo().getOffset() + "(%rbp)\n";
        
        return codigoEnsamblador;
    } else if (this.getInfo().getEtiqueta() == Etiqueta.RETURN) {
        // Generar código para la operación de asignacion
        codigoEnsamblador += HD.getCodigo();
        String ob1 = "";
        
        if(HD.getInfo().getEtiqueta() == Etiqueta.VALORENTERO){
            ob1 = "$" + HD.getInfo().getValor();
        }
        else{
            ob1 = "-" + HD.getInfo().getOffset() + "(%rbp)";
        }   
        
        codigoEnsamblador += "movl " + ob1 + ", %eax\n";
        
        return codigoEnsamblador;
    }

    return codigoEnsamblador;
}

}
