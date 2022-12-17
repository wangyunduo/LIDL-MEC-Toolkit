package common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import core.common.ch.LineBuffer;

import static org.junit.jupiter.api.Assertions.*;

class LineBufferTest
{
	LineBuffer buffer;

	@BeforeEach
	void setUp()
	{
		buffer = new LineBuffer();
		buffer.append("test 1");
	}

	@Test
	void getNextChar()
	{
		// start with 't'
		assertEquals('t', buffer.getNextChar());
		// continue with 'e'
		assertEquals('e', buffer.getNextChar());
		// won't continue before moveNext is called
		assertNotEquals('s', buffer.getNextChar());
		assertEquals('e', buffer.getNextChar());

		// move Next
		buffer.moveNext();
		assertEquals('e', buffer.getNextChar());
		// move Next
		buffer.moveNext();
		assertEquals('s', buffer.getNextChar());
		// move Next
		buffer.moveNext();
		assertEquals('t', buffer.getNextChar());
		// move Next
		buffer.moveNext();
		assertEquals(' ', buffer.getNextChar());
		// move Next
		buffer.moveNext();
		assertEquals('1', buffer.getNextChar());
		// move Next
		buffer.moveNext();
		assertEquals(0, buffer.getNextChar());
	}

	@Test
	void isEOF()
	{
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertFalse(buffer.isEOF());
		buffer.moveNext();
		buffer.getNextChar();
		assertTrue(buffer.isEOF());
	}

	@Test
	void append()
	{
		LineBuffer buf = new LineBuffer();
		buf.append("a simple program");
		buf.append("another line");
		assertEquals("a simple program", buf.getBuffer().get(0));
		assertEquals("another line", buf.getBuffer().get(1));
		assertEquals('a', buf.getBuffer().get(0).charAt(0));
	}

	@Test
	void testToString()
	{
		assertEquals("test 1", buffer.toString());
	}
}