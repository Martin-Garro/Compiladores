package codigo;

// para clasificar simbolos, nodos del arbol

public enum Etiqueta {
     PROGRAMA,
     DECLS,
     SENTS,   
     DECLARACION,  // declaracion de variable
     RETURN,       // sentencia return
     ASIGNACION,   // sentencia asignacion
     SUMA,         // operacion suma
     MULT,         // operacion multiplicacion
     DIV,         // operacion suma
     RESTA,         // operacion multiplicacion
     VARIABLE,      // una variable
     VALORENTERO,   // una constante entera
     VALORBOOLEANO // una constante booleana
}
