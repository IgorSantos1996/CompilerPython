/*[]-----------------------------------------------------------------[]*/
/*|           					                          |*/
/*|*******************************************************************|*/
/*|  Disciplina.......: Linguagens Formais e Tradutores      	      |*/
/*|  Data........: 18/12/2018								          |*/
/*|  @Aluno......: Igor Terriaga                 |*/
/*|  Info........: Compilador para o reconhecimento    |*/
/*|   			   da linguagem Python. 							  |*/
/*[]-----------------------------------------------------------------[]*/

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;
import java.util.Stack;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char
%init{
	pilha.push(0);
%init}
%eofval{
return symbol ("EOF", sym.EOF, new String("Fim do arquivo"));

%eofval}
%{
	Integer contabrancos = 0;
	Integer elemento = 0;
	
	Stack<Integer> pilha = new Stack<Integer>();
	
    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
              
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


private StringBuffer str = new StringBuffer();

%}


%state IDENT
%state DEDENT
%state COMENTARIOS
%state STRING
%state COMENTARIO

  				/* ********** LITERALS ********* */


DIGIT_LITERAL = [0-9]
INTEGER_LITERAL = {DIGIT_LITERAL}+ | "+"{DIGIT_LITERAL}+ | "-"{DIGIT_LITERAL}+
NUMBERFLOAT_LITERAL =   {DIGIT_LITERAL}+"." {DIGIT_LITERAL}* | {DIGIT_LITERAL}* "." {DIGIT_LITERAL}+

  				/* ********** SEVERAL ********* */

SPACE      = " "
NEWLINE    = \r | \n | \r\n
Whitespace = {SPACE}|{NEWLINE}|[ \t\f]


  				/* ********** IDENTIFIER ********* */

IDENTIFIER       = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*

  				
  				
  				/* ********** RESERVED WORDS ********* */

//RESERVED_WORDS = "False"|"True"|"return" |"def"|"for"|"while"|"global"|"not"|"elif"|"if"|"else"

%%  

<YYINITIAL> {
\' {str.setLength(0);yybegin(STRING);}
\" {str.setLength(0);yybegin(STRING);}

"'''" {str.setLength(0); yybegin(COMENTARIOS);}
"\"\"\"" {str.setLength(0); yybegin(COMENTARIOS);}
# { str.setLength(0) ; yybegin(COMENTARIO); }




 {Whitespace} {; }
 {NEWLINE}			{ yybegin(IDENT);}
  
    				/* ********** OPERATORS AND DELIMITERS ********* */
    
  ";"          { return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          { return symbolFactory.newSymbol("PLUS", PLUS); }
  "-"          { return symbolFactory.newSymbol("MINUS", MINUS); }
  "*"          { return symbolFactory.newSymbol("TIMES", TIMES); }
  "/"          { return symbolFactory.newSymbol("DIVISION", DIVISION); }
  "="          { return symbolFactory.newSymbol("EQUAL", EQUAL); }
  
  "=="         { return symbolFactory.newSymbol("EQUALTWO", EQUALTWO); }
  "!="         { return symbolFactory.newSymbol("NOTSAME", NOTSAME); }
  ">"          { return symbolFactory.newSymbol("BIGGER", BIGGER); }
  "<"          { return symbolFactory.newSymbol("SMALLER", SMALLER); }
  ">="         { return symbolFactory.newSymbol("GREATEREQUAL", GREATEREQUAL); }
  "<="         { return symbolFactory.newSymbol("LESSEQUAL", LESSEQUAL); }
  
  "("          { return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          { return symbolFactory.newSymbol("RPAREN", RPAREN); }  
  "["          { return symbolFactory.newSymbol("L_BRACKET", L_BRACKET); }  
  "]"          { return symbolFactory.newSymbol("R_BRACKET", R_BRACKET); }  
  "{"          { return symbolFactory.newSymbol("L_KEY", L_KEY); }  
  "}"          { return symbolFactory.newSymbol("R_KEY", R_KEY); }  
  
  ":"          { return symbolFactory.newSymbol("COLON_OP", COLON_OP); }  
  ","          { return symbolFactory.newSymbol("COMMA", COMMA); }  
  "."          { return symbolFactory.newSymbol("SCORE", SCORE); }  
  //";"          { return symbolFactory.newSymbol("SEMICOLON", SEMICOLON); }  
   
  				/* ********** RESERVED WORDS ********* */
  				
  "False"      { return symbolFactory.newSymbol("FALSE", FALSE); }  
  "True"       { return symbolFactory.newSymbol("TRUE", TRUE); }  
  "return"     { return symbolFactory.newSymbol("RETURN", RETURN); }  
  "def"        { return symbolFactory.newSymbol("DEF", DEF); }  
  "for"        { return symbolFactory.newSymbol("FOR", FOR); }  
  "while"      { return symbolFactory.newSymbol("WHILE", WHILE); }  
  "global"     { return symbolFactory.newSymbol("GLOBAL", GLOBAL); }  
  "not"        { return symbolFactory.newSymbol("NOT", NOT); }  
  "elif"       { return symbolFactory.newSymbol("ELIF", ELIF); }  
  "if"         { return symbolFactory.newSymbol("IF", IF); }  
  "else"       { return symbolFactory.newSymbol("ELSE", ELSE); }  
  "in"         { return symbolFactory.newSymbol("IN", IN); }  
  "range"      { return symbolFactory.newSymbol("RANGE", RANGE); }
  "or"		   { return symbolFactory.newSymbol("OR", OR); }
  "and"        { return symbolFactory.newSymbol("AND", AND); }
  
   
     			/* ********** ANOTHER WORDS ********* */
   
  {INTEGER_LITERAL}          { return symbolFactory.newSymbol("INTEGER_LITERAL", INTEGER_LITERAL, Integer.parseInt(yytext())); }
  {NUMBERFLOAT_LITERAL}      { return symbolFactory.newSymbol("NUMBERFLOAT_LITERAL", NUMBERFLOAT_LITERAL, Float.parseFloat(yytext())); }
  {IDENTIFIER}               { return symbolFactory.newSymbol("IDENTIFIER", IDENTIFIER, yytext()); }
  //{RESERVED_WORDS}           { return symbolFactory.newSymbol("RESERVED_WORDS", RESERVED_WORDS, yytext()); }
  
  
       			/* ********** STRINGS ********* */
  
 
 
     
}
<COMENTARIOS> {
    "'''" { { yybegin(YYINITIAL);  
             return symbol("COMENTARIOS", sym.COMENTARIOS,str.toString()); } }
	"\"\"\"" { { yybegin(YYINITIAL);  
             return  symbol("COMENTARIOS",sym.COMENTARIOS,str.toString()); } }	
    [ \n\r\t] { str.append(yytext()); }
    <<EOF>> {  yybegin(YYINITIAL); }
    . { str.append(yytext());  }
}

<COMENTARIO> {
	"\n" { yybegin(YYINITIAL);
	return  symbol("COMENTARIO", sym.COMENTARIO,str.toString()); } 
	<<EOF>> {  yybegin(YYINITIAL); 
	return  symbol("COMENTARIO", sym.COMENTARIO,str.toString());}
	
    . { str.append(yytext()); }
}

<STRING> {
	 
	
	
    \" {
    	char a = yycharat(0);
    	if (a == '"'){
    		yybegin(YYINITIAL); 
    		return symbol("STRING",sym.STRING,str.toString()); 
    		}else{
    			str.append(yytext());}
    	}
    	
    \'  {    	
    	char a = yycharat(0);
    	if (a == '\''){
    		yybegin(YYINITIAL); 
    		return symbol("STRING",sym.STRING,str.toString()); 
    		}else{
    			str.append(yytext());} 
    			}
    			
    [^\n\r\"\'\\]+ { str.append(yytext()); }
    <<EOF>> { yybegin(YYINITIAL);  }
    . { yybegin(YYINITIAL);  }
    
}

<IDENT> {
	
	" "  {contabrancos = contabrancos + 1;}
	
	"\t" {contabrancos = (8 - contabrancos % 8) + contabrancos;}     
	   
	[^ \t] { //System.out.println("^ \t" + contabrancos);
		//	System.out.println(pilha);
	        if (contabrancos > pilha.peek()){
				//System.out.println("[IDENT] contabrancos > pilha.peek()");				
				pilha.push(contabrancos);
				contabrancos = 0;	
				yypushback(1);
				yybegin(YYINITIAL);
			    //System.out.println(pilha);	
				return symbol("IDENT", sym.IDENT);
			} else if (contabrancos < pilha.peek()){			
				 yybegin(DEDENT);
				 yypushback(1);
			}
			  else {		
			  yypushback(1);
			  yybegin(YYINITIAL);
			  contabrancos = 0;
			  }
			}
}

<DEDENT> {
[^ \t] {
        //System.out.println(pilha);
        
	while (contabrancos <= pilha.peek()){
		elemento = pilha.peek(); 
         
		if(contabrancos == elemento){		
	 
			contabrancos = 0;			
			yybegin(YYINITIAL);
			yypushback(1);
					    
			return symbol("DEDENT", sym.DEDENT);	
		}else if(contabrancos > elemento ){	System.exit(0);}
		else if (contabrancos < elemento){
		
				pilha.pop();
					if(contabrancos < pilha.peek()){
						
						return symbol("DEDENT", sym.DEDENT);
					}			
				}				
	  }	System.exit(0);
	 	
    }
	
}
.|\n          { emit_warning("Caracter não reconhecido... '" +yytext()+"' -- ignored"); }
