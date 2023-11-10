package codigo;

// Información de un simbolo interviniente en el programa

public class Simbolo {

   private Etiqueta flag;  // clasificacion del simbolo	
   private String nombre;  // nombre del simbolo 
   private Tipos tipo;  // tipo del simbolo (int o boolean)
   private int valor;     //  valor asociado al simbolo (para int es un numero; para bool es true=0 y false=1
   private int nrolinea;
   private int offset;
   private static int offset_aux = 8;

// constructores
    public Simbolo(Etiqueta flag) {
        this.flag = flag;
        this.nombre = "";
        this.tipo = Tipos.NOTTYPE;
        this.valor = 0;
        this.offset = offset_aux;
        
        if((flag == Etiqueta.VARIABLE) || (flag == Etiqueta.SUMA)){
            this.offset_aux += 8;
        }
        
    }
    
    public Simbolo(Etiqueta flag, String nombre, Tipos tipo, int valor, int nrolinea) {
        this.flag = flag;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.nrolinea = nrolinea;
        this.offset = offset_aux;     
        if((flag == Etiqueta.VARIABLE) || (flag == Etiqueta.SUMA)){
            this.offset_aux += 8;
        }
    }
    
    public int getOffset(){
        return offset;
    }

    public Etiqueta getEtiqueta() {
        return flag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNroLinea() {
        return nrolinea;
    }

    public void setNroLinea(int nrolinea) {
        this.nrolinea = nrolinea;
    }

    public String toString(){
	    return "("+this.getEtiqueta()+" , "+this.getNombre()+" , "+this.getTipo()+" , "+this.getValor()+" , "+this.getNroLinea()+")\n";
	}     
    
}
