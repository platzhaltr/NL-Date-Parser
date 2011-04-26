package com.platzhaltr.util.date;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import com.platzhaltr.util.date.lexer.Lexer;
import com.platzhaltr.util.date.lexer.LexerException;
import com.platzhaltr.util.date.node.Start;
import com.platzhaltr.util.date.parser.Parser;
import com.platzhaltr.util.date.parser.ParserException;

public class GrammarExecuter {

	public static void main(String[] args) {

		try {
			// Create a Parser instance.
			Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024)));

			// Parse the input.
			Start tree = p.parse();

			// Apply the translation.
			tree.apply(new Translation());

			// tree.apply( new ASTDisplay() );
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LexerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
