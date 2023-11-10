
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Nov 10 11:09:39 ART 2023
//----------------------------------------------------

package codigo;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Nov 10 11:09:39 ART 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\003\000\002\005\007\000\002\007\003" +
    "\000\002\007\003\000\002\004\004\000\002\004\003\000" +
    "\002\006\005\000\002\006\006\000\002\010\005\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\010\003\000\002\010\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\006\014\011\015\010\001\002\000\006\016" +
    "\042\021\040\001\002\000\004\002\037\001\002\000\004" +
    "\021\013\001\002\000\012\014\011\015\010\016\ufffe\021" +
    "\ufffe\001\002\000\004\021\ufffb\001\002\000\004\021\ufffc" +
    "\001\002\000\006\016\uffff\021\uffff\001\002\000\004\013" +
    "\014\001\002\000\014\011\022\017\017\020\021\021\016" +
    "\022\020\001\002\000\016\004\ufff1\005\ufff1\006\ufff1\007" +
    "\ufff1\010\ufff1\012\ufff1\001\002\000\016\004\ufff0\005\ufff0" +
    "\006\ufff0\007\ufff0\010\ufff0\012\ufff0\001\002\000\016\004" +
    "\uffee\005\uffee\006\uffee\007\uffee\010\uffee\012\uffee\001\002" +
    "\000\016\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef\012" +
    "\uffef\001\002\000\016\004\uffed\005\uffed\006\uffed\007\uffed" +
    "\010\uffed\012\uffed\001\002\000\014\011\022\017\017\020" +
    "\021\021\016\022\020\001\002\000\014\004\026\005\024" +
    "\006\025\007\030\010\027\001\002\000\014\011\022\017" +
    "\017\020\021\021\016\022\020\001\002\000\014\011\022" +
    "\017\017\020\021\021\016\022\020\001\002\000\012\014" +
    "\ufffd\015\ufffd\016\ufffd\021\ufffd\001\002\000\014\011\022" +
    "\017\017\020\021\021\016\022\020\001\002\000\014\011" +
    "\022\017\017\020\021\021\016\022\020\001\002\000\016" +
    "\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\012\ufff4\001" +
    "\002\000\016\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3" +
    "\012\ufff3\001\002\000\016\004\ufff5\005\ufff5\006\ufff5\007" +
    "\030\010\027\012\ufff5\001\002\000\016\004\ufff6\005\ufff6" +
    "\006\ufff6\007\030\010\027\012\ufff6\001\002\000\014\005" +
    "\024\006\025\007\030\010\027\012\036\001\002\000\016" +
    "\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\012\ufff2\001" +
    "\002\000\004\002\000\001\002\000\004\013\047\001\002" +
    "\000\004\002\001\001\002\000\014\011\022\017\017\020" +
    "\021\021\016\022\020\001\002\000\010\002\ufff9\016\042" +
    "\021\040\001\002\000\004\002\ufffa\001\002\000\014\004" +
    "\046\005\024\006\025\007\030\010\027\001\002\000\010" +
    "\002\ufff8\016\ufff8\021\ufff8\001\002\000\014\011\022\017" +
    "\017\020\021\021\016\022\020\001\002\000\014\004\051" +
    "\005\024\006\025\007\030\010\027\001\002\000\010\002" +
    "\ufff7\016\ufff7\021\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\012\002\004\003\003\005\006\007\005\001" +
    "\001\000\006\004\040\006\042\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\003\011\005\006\007\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\010\022\011\014\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\010\034\011\014\001" +
    "\001\000\002\001\001\000\006\010\033\011\014\001\001" +
    "\000\006\010\032\011\014\001\001\000\002\001\001\000" +
    "\006\010\031\011\014\001\001\000\006\010\030\011\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\010\044\011\014\001\001\000\006\004\043\006\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\010\047\011\014\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {


    
    public void report_error(String message, Object info) {
   
        /* Create a StringBuffer called 'm' with the string 'Error' in it. */
        StringBuffer m = new StringBuffer("Error");
   
        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuffer error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));   
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuffer error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right+1));
            }
        }
   
        /* Add to the end of the StringBuffer error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);
   
        /* Print the contents of the StringBuffer 'm', which contains
           an error message, out on a line. */
        System.err.println(m);
    }
   
    /* Change the method report_fatal_error so when it reports a fatal
       error it will display the line and column number of where the
       fatal error occurred in the input as well as the reason for the
       fatal error which is passed into the method in the object
       'message' and then exit.*/
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(0);  // 1 return trace exception
    }
    
    TablaSimbolo tabla= new TablaSimbolo();

  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // const ::= FALSE 
            {
              Arbol RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.VALORBOOLEANO,"",Tipos.BOOL,0,fleft)); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("const",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // const ::= TRUE 
            {
              Arbol RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.VALORBOOLEANO,"",Tipos.BOOL,1,tleft)); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("const",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // const ::= NUMBER 
            {
              Arbol RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.VALORENTERO,"",Tipos.INT,n.intValue(),nleft)); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("const",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= ID 
            {
              Arbol RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 Simbolo simbolo = tabla.buscar(i); 
                    if (simbolo==null){ 
                       report_fatal_error("Variable no declarada: "+i+" (Línea "+ileft+").\n",null);
                    } 
                    else{
                       RESULT = new Arbol(simbolo);  
                    }  
                    
                 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= const 
            {
              Arbol RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol c = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		  RESULT = c; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= LPAREN expr RPAREN 
            {
              Arbol RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		 RESULT = e; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr DIVIDE expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.DIV,"",Tipos.NOTTYPE,0,oleft),e1,e2); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr TIMES expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.MULT,"",Tipos.NOTTYPE,0,oleft),e1,e2); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr MINUS expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.RESTA,"",Tipos.NOTTYPE,0,oleft),e1,e2); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr PLUS expr 
            {
              Arbol RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Arbol e1 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object o = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol e2 = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.SUMA,"",Tipos.NOTTYPE,0,oleft),e1,e2); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // sentencia ::= ID EQUAL expr SEMI 
            {
              Arbol RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		 Simbolo simbolo = tabla.buscar(i); 
                                              if (simbolo==null){ 
                                                 report_fatal_error("Variable no declarada: "+i+" (Línea "+ileft+").\n",null);
                                              } 
                                              else{
                                                 RESULT = new Arbol(new Simbolo(Etiqueta.ASIGNACION),new Arbol(simbolo),e);  
                                              }  
                                           
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("sentencia",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // sentencia ::= RETURN expr SEMI 
            {
              Arbol RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object r = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.RETURN),null,e); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("sentencia",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sentencias ::= sentencia 
            {
              Arbol RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol s = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = s; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("sentencias",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // sentencias ::= sentencia sentencias 
            {
              Arbol RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol s = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int ssleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int ssright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol ss = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.SENTS),s,ss); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("sentencias",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // tipo ::= BOOL 
            {
              Tipos RESULT =null;
		 RESULT = Tipos.BOOL; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("tipo",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // tipo ::= INT 
            {
              Tipos RESULT =null;
		 RESULT = Tipos.INT; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("tipo",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaracion ::= tipo ID EQUAL expr SEMI 
            {
              Arbol RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).right;
		Tipos t = (Tipos)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol e = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		 Simbolo simbolo = new Simbolo(Etiqueta.VARIABLE,i,t,0,ileft); 
                                                       if (tabla.insertar(simbolo)==null){ 
                                                           report_fatal_error("Variable redeclarada: "+simbolo.getNombre()+" (Línea "+simbolo.getNroLinea()+").\n",null);
                                                       } 
                                                       else{
                                                            RESULT = new Arbol(new Simbolo(Etiqueta.DECLARACION),new Arbol(simbolo),e);  
                                                       }   
                                                    
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("declaracion",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaraciones ::= declaracion 
            {
              Arbol RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol d = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = d; 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("declaraciones",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declaraciones ::= declaracion declaraciones 
            {
              Arbol RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol d = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int dsleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int dsright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol ds = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.DECLS),d,ds); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("declaraciones",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol start_val = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= declaraciones sentencias 
            {
              Arbol RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Arbol d = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()).right;
		Arbol s = (Arbol)((java_cup.runtime.Symbol) CUP$Sintax$stack.peek()).value;
		 RESULT = new Arbol(new Simbolo(Etiqueta.PROGRAMA),d,s); 
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

