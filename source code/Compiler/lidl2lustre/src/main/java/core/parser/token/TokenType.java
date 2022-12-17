package core.parser.token;

public enum TokenType
{
	/**
	 * lidl predefined
	 */
	// 'Predefined'
	KW_Predefined,

	/**
	 * lidl program header
	 */
	// 'package'
	KW_Package,
	// 'import'
	KW_Import,
	// xx.xx.xx / xx.xx.*
	// identifier
	ID_Qualified,

	/**
	 * lidl definition
	 */
	// 'with'
	KW_With,
	// 'is'
	KW_Is,

	/**
	 * lidl data
	 */
	// 'data'
	KW_Data,
	// '->'


	/**
	 * lidl interface
	 */
	// 'interface'
	KW_Interface,
	// 'in',
	KW_DirIn,
	// 'out'
	KW_DirOut,

	/**
	 * lidl interaction
	 */
	// 'interaction'
	KW_Interaction,

	/**
	 * lidl common
	 */
	// end of file
	EOF,
	// comment
	Comment,
	// empty
	Nil,
	// '('
	LParen,
	// ')'
	RParen,
	// '{'
	LBrace,
	// '}'
	RBrace,
	// '['
	LBrack,
	// ']'
	RBrack,
	// ':'
	Colon,
	// ';'
	SemiColon,
	// ','
	Comma,
	// '->'
	RightArrow,

	/**
	 * lidl literal
	 */
	// Text literal
	L_String,
	// Number literal
	L_Number,
	// Boolean literal
	L_Boolean,
	// Activation literal
	L_Activation,
}
