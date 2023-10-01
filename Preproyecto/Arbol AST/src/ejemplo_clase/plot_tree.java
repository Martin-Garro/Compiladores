/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_clase;

/**
 *
 * @author marcosmayen
 */
public class plot_tree {
    String nodo="";
    public void agregarNodo(String nodo){
        this.nodo=this.nodo+"\n"+nodo;
    }
    public void crearArchivo(){
        String grafo = "digraph G{"+this.nodo+"}";
    }
    public void generar(String cadena){
        try{
            String ruta = " /usr/local/bin/dot ";
            String acciones=" -Tpng -O ";
            Runtime rt = Runtime.getRuntime();
            String accion =ruta+acciones+cadena;
            rt.exec(accion);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
