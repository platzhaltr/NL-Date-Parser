package com.platzhaltr.test;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import org.junit.Test;

import com.platzhaltr.util.date.lexer.Lexer;
import com.platzhaltr.util.date.lexer.LexerException;
import com.platzhaltr.util.date.parser.Parser;
import com.platzhaltr.util.date.parser.ParserException;

public class DateGrammarTest {

	private void parse( String stringToParse ) throws ParserException, LexerException, IOException {
		// Create a Parser instance.
		Parser p = new Parser( new Lexer( new PushbackReader( new StringReader( stringToParse ), 1024 ) ) );

		// Parse the input.
		p.parse();
	}

	@Test
	public void testWeekday01() throws ParserException, LexerException, IOException {
		parse( "Am Sonntag" );
		parse( "Am sonntag" );
		parse( "Am So" );
		parse( "Am so" );
	}

	@Test
	public void testWeekdayTime01() throws ParserException, LexerException, IOException {
		parse( "Am Sonntag um 13Uhr" );

	}

	@Test
	public void testWeekdayTime02() throws ParserException, LexerException, IOException {
		parse( "Am Sonntag um 13:30Uhr" );
	}

	@Test
	public void testAbsoluteDate01() throws ParserException, LexerException, IOException {
		parse( "Am 21.05." );
	}

	@Test
	public void testAbsoluteDate02() throws ParserException, LexerException, IOException {
		parse( "Am 20.Dezember" );
		parse( "Am 20.dezember" );
		parse( "Am 20.Dez" );
		parse( "Am 20.dez" );
	}

	@Test
	public void testAbsoluteDateYear01() throws ParserException, LexerException, IOException {
		parse( "Am 21.05.2011" );
	}

	@Test
	public void testAbsoluteDateYear02() throws ParserException, LexerException, IOException {
		parse( "Am 21.Sep 2011" );
	}

	@Test
	public void testAbsoluteDateTime01() throws ParserException, LexerException, IOException {
		parse( "Am 21.05. um 13:30Uhr" );
	}

	@Test
	public void testAbsoluteDateTime02() throws ParserException, LexerException, IOException {
		parse( "Am 21.August um 13:30Uhr" );
	}

	@Test
	public void testAbsoluteDateTimeYear01() throws ParserException, LexerException, IOException {
		parse( "Am 21.05.2011 um 13:30Uhr" );
	}

	@Test
	public void testAbsoluteDateTimeYear02() throws ParserException, LexerException, IOException {
		parse( "Am 21.Sep 2011 um 13:30Uhr" );
	}

	@Test
	public void testAbsoluteDateEvening01() throws ParserException, LexerException, IOException {
		parse( "Am 21.05. Abends" );
	}

	@Test
	public void testAbsoluteDateEvening02() throws ParserException, LexerException, IOException {
		parse( "Am 21.okt abends" );
	}

	@Test
	public void testWeekdayEvening() throws ParserException, LexerException, IOException {
		parse( "Am Sonntag Abend" );
	}

	@Test
	public void testNextWeekday01() throws ParserException, LexerException, IOException {
		parse( "Nächsten Sonntag" );
		parse( "nächsten sonntag" );
	}

	@Test
	public void testNextWeekdayTime01() throws ParserException, LexerException, IOException {
		parse( "Nächsten Sonntag um 13Uhr" );
	}

	@Test
	public void testNextWeekdayTime02() throws ParserException, LexerException, IOException {
		parse( "Nächsten Sonntag um 13:30Uhr" );
	}

	@Test
	public void testNextWeekdayEvening() throws ParserException, LexerException, IOException {
		parse( "Nächsten Samstag Abend" );
	}

	@Test
	public void testNextMonth() throws ParserException, LexerException, IOException {
		parse( "Nächsten Monat" );
	}

	@Test
	public void testNextWeekend() throws ParserException, LexerException, IOException {
		parse( "Nächstes Wochenende" );
	}

	@Test
	public void testEveryWeekday() throws ParserException, LexerException, IOException {
		parse( "Jeden Montag" );
	}

	@Test
	public void testEveryXWeekday() throws ParserException, LexerException, IOException {
		parse( "Jeden 2. Montag" );
	}

	@Test
	public void testEveryWeekend() throws ParserException, LexerException, IOException {
		parse( "Jedes Wochenende" );
	}

	@Test
	public void testEveryXWeekend() throws ParserException, LexerException, IOException {
		parse( "Jedes 2. Wochenende" );
	}

	@Test
	public void testEveryWorkdayEvening() throws ParserException, LexerException, IOException {
		parse( "Jeden Dienstag Abend" );
	}

	@Test
	public void testEveryXWorkdayEvening() throws ParserException, LexerException, IOException {
		parse( "Jeden 3.Montag Abend" );
	}

}
