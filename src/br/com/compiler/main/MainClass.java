package br.com.compiler.main;

import br.com.compiler.exceptions.IsiLexicalException;
import br.com.compiler.lexico.IsiScanner;
import br.com.compiler.lexico.Token;

public class MainClass {
	public static void main(String[] args) {
		
	try {
		IsiScanner sc = new IsiScanner("input.isi");
		Token token = null;
		do {
			token = sc.nextToken();
			if (token != null) {
				System.out.println(token);
			}
			
		} while (token != null);
	} catch (IsiLexicalException ex) {
			System.out.println("Lexical ERROR " + ex.getMessage());
		}
		catch (Exception ex) {
			System.out.println("Generic Error!!");
		}
	}
}
