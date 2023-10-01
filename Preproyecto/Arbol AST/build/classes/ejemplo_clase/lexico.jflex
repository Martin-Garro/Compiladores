package ejemplo_clase;
import java_cup.runtime.Symbol;


%%

%public
%class Scanner
%cupsym Simbolo
%cup
%unicode
%line
%column
%ignorecase

digito  =   [0-9]
decimal  =   {digito}+('.'{digito}+)?
espacio =   (" " | \r | \n | \t | \f)+
cadena  =   ([a-zA-Z]+[0-9]*)+


%%

<YYINITIAL>{
 "int"
{   return new Symbol(Simbolo.INT, yyline, yycolumn);    }
 "string"
{   return new Symbol(Simbolo.STRING, yyline, yycolumn);    }
    "+"
{   return new Symbol(Simbolo.MAS, yyline, yycolumn);    }

    ","
{   return new Symbol(Simbolo.COMA, yyline, yycolumn);    }
    "-"
{   return new Symbol(Simbolo.MENOS, yyline, yycolumn);    }
    "*"
{   return new Symbol(Simbolo.POR, yyline, yycolumn);    }
    "/"
{   return new Symbol(Simbolo.DIV, yyline, yycolumn);    }
 
    ";"
{   return new Symbol(Simbolo.PCOMA,yyline, yycolumn);                  }
    "="
{   return new Symbol(Simbolo.IGUAL,yyline, yycolumn);                  }
    {cadena}
{   return new Symbol(Simbolo.CADENA,yyline,yycolumn, yytext());       }
    {decimal}
{   return new Symbol(Simbolo.ENTERO, yyline, yycolumn, yytext());      }

    [\"] ~[\"]
{
String t = yytext();
return new Symbol(Simbolo.TXTCOMILLA, yyline, yycolumn, t.substring(1, t.length() - 1));
}


    {espacio}
{ }

    "/*" ~"*/"
{ }

    .
{   return new Symbol(Simbolo.error, yyline, yycolumn, yytext());       }

}