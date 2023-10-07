

public class Principal {
    static public void main(String argv[]) {


        /*
         * int x = 4;
         * bool y = true;
         * x = x+1;
         * return x;
         * */

        /*
        Simbolo simbolo = new Simbolo(Etiqueta.VARIABLE, "x", Etiqueta.INT, 0); // var x, tipo int, valor?
        Simbolo simbolo2 = new Simbolo(Etiqueta.VARIABLE, "y", Etiqueta.BOOL, 0); // var y, tipo bool, valor?
        Simbolo simbolo3 = new Simbolo(Etiqueta.VALORENTERO, "", Etiqueta.INT, 4); // valor entero 4
        Simbolo simbolo4 = new Simbolo(Etiqueta.VALORBOOLEANO, "", Etiqueta.BOOL, 1); // valor booleano true
        Simbolo simbolo5 = new Simbolo(Etiqueta.VALORENTERO, "", Etiqueta.INT, 1); // valor entero 4

        Simbolo progSim = new Simbolo(Etiqueta.PROGRAMA);

        Simbolo declsSim = new Simbolo(Etiqueta.DECLS);
        Simbolo declxSim = new Simbolo(Etiqueta.DECLARACION);
        Simbolo declySim = new Simbolo(Etiqueta.DECLARACION);

        Simbolo sentsSim = new Simbolo(Etiqueta.SENTS);
        Simbolo asigxSim = new Simbolo(Etiqueta.ASIGNACION);
        Simbolo sumaSim = new Simbolo(Etiqueta.SUMA);
        Simbolo retxSim = new Simbolo(Etiqueta.RETURN);

        Arbol hijoI = new Arbol(simbolo); // nodo arbol de x
        Arbol hijoD = new Arbol(simbolo3); //nodo arbol de 4
        Arbol padre = new Arbol(declxSim, hijoI, hijoD); // arbol de int x = 4;

        hijoI = new Arbol(simbolo2); // nodo arbol de x
        hijoD = new Arbol(simbolo4); //nodo arbol de 4
        Arbol padre1 = new Arbol(declySim, hijoI, hijoD); // arbol de bool y = true;

        Arbol padreDec = new Arbol(progSim, new Arbol(declsSim, padre, padre1),     // arbol de las declaraciones
                new Arbol(sentsSim, new Arbol(asigxSim, new Arbol(simbolo), new Arbol(sumaSim, new Arbol(simbolo), new Arbol(simbolo5))), // arbol de x=x+1;
                        new Arbol(retxSim, null, new Arbol(simbolo)))    // arbol de return x;
        );


        System.out.println(padreDec);
        */
        /* ----------------------------------------------------------------------------------------------------------------
           c = a + 5;
           return c;
         */

        Simbolo simbolo = new Simbolo(Etiqueta.VARIABLE, "c",Etiqueta.INT,0); //var c, tipo int, valor?
        Simbolo simbolo2 = new Simbolo(Etiqueta.VARIABLE, "a",Etiqueta.INT,0); //var a, tipo int, valor?
        Simbolo simbolo3 = new Simbolo(Etiqueta.VALORENTERO, "",Etiqueta.INT,5);//valor entero 5

        Simbolo progSim = new Simbolo(Etiqueta.PROGRAMA);

        Simbolo declasSim = new Simbolo(Etiqueta.DECLS);
        Simbolo declacSim = new Simbolo(Etiqueta.DECLARACION);
        Simbolo delcaaSim = new Simbolo(Etiqueta.DECLARACION);

        Simbolo sentsSim = new Simbolo(Etiqueta.SENTS);
        Simbolo asigxSim = new Simbolo(Etiqueta.ASIGNACION);
        Simbolo sumaSim = new Simbolo(Etiqueta.SUMA);
        Simbolo retcSim = new Simbolo(Etiqueta.RETURN);

        Arbol hijoI = new Arbol(simbolo); //nodo arbol de c
        Arbol hijoD = new Arbol(simbolo); // nodo suma
        Arbol padre = new Arbol(declacSim,hijoI,hijoD); // arbol c = +

        hijoI = new Arbol(simbolo2);//nodo arbol de a
        hijoD = new Arbol(simbolo3);//nodo arbol de 5
        Arbol padre1 = new Arbol(delcaaSim,hijoI,hijoD); //arbol de a + 5

        Arbol padreDec = new Arbol(progSim,new Arbol(declasSim, padre,padre1),
                new Arbol(sentsSim,new Arbol(asigxSim, new Arbol(simbolo),new Arbol(sumaSim,new Arbol(simbolo2),new Arbol(simbolo3))), // arbol de c=a=5;
                    new Arbol(retcSim,null,new Arbol(simbolo))) //arbol de return c;
        );

        System.out.println(padreDec);

        TablaSimbolo tabla = new TablaSimbolo();

        tabla.insertar(simbolo);
        tabla.insertar(simbolo2);

        Simbolo s = tabla.buscar("z");
        System.out.println("Simbolo:  " + s);

        s = tabla.buscar("x");
        System.out.println("Simbolo:  " + s);

        System.out.println(tabla);

    }

}
