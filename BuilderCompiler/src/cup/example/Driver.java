package cup.example;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import java_cup.runtime.*;

 class Driver {

	
	public static void main(String[] args) throws Exception {
		
		//LÉXICO
		Lexer lex = new Lexer(new FileInputStream(new File("C:\\Users\\igsan\\eclipse-workspace\\testando\\input.txt")));
		/*Symbol symb = lex.next_token();
				
		while(symb.sym != sym.EOF) {
			System.out.println(sym.terminalNames[symb.sym] + ": " + symb.sym);
			symb = lex.next_token();
		}*/
		
		// SINTÁTICO
		parser parser = new parser(lex);
		try {
			
			parser.debug_parse();	
			
			System.out.println("Executado com sucesso!!!");
			
		}catch(Exception e) {
			Symbol s = parser.getS();
			if (s.sym == 0) {
				System.err.println("Erro de sintaxe. Linha: " + 1 + ". Texto: \"" + s.value + "\"");
				}else {
				System.err.println("Erro de sintaxe. Linha: " + 1 + ". Texto: \"" + s.value + "\"");
			}
			e.getMessage();
		}
		
	}
}