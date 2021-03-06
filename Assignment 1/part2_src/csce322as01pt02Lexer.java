// Generated from csce322as01pt02.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322as01pt02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGINNING_OF_SECTION=2, END_OF_SECTION=3, BOARD=4, LADDERS=5, 
		CHUTES=6, POSITIONS=7, VALUE_ASSIGNMENT=8, NUMBER=9, ROW_SEPARATOR=10, 
		BEGINNING_OF_BOARD=11, END_OF_BOARD=12, BEGINNING_OF_LIST=13, END_OF_LIST=14, 
		WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__0", "BEGINNING_OF_SECTION", "END_OF_SECTION", "BOARD", "LADDERS", 
		"CHUTES", "POSITIONS", "VALUE_ASSIGNMENT", "NUMBER", "ROW_SEPARATOR", 
		"BEGINNING_OF_BOARD", "END_OF_BOARD", "BEGINNING_OF_LIST", "END_OF_LIST", 
		"WS"
	};


		int players_counter;
		int chutes_counter;
		int ladders_counter;
		int rows_counter;
		int columns_counter;
		int isValidGame = 1;
		
		 // List that stores all the semantic errors found in the input file
		java.util.List<Integer> errorRules = new java.util.ArrayList<Integer>();
		
		/*
		 * Function that prints all semantic errors found in the input file
		 */
		private void printErrRules(java.util.List list) {
			
			java.util.Collections.sort(list);
			
			for(int i = 0; i < list.size(); i++)
				System.out.println("Semantic Error: Rule " + list.get(i) + " Violated");
		}
		
		/*
		 * Function that prints one invalid token and the line in which it was found
		 */
		private void printInvalidToken(String token, int line) {
			
			System.out.println(token + " in Line "+ line + " is an Invalid Token");
		}


	public csce322as01pt02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322as01pt02.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\6\nQ\n\n\r\n\16\nR\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\6\20`\n\20\r\20\16\20a\3\20\3\20\2\2\21"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21\3\2\4\3\2\62;\5\2\13\f\17\17\"\"f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7&\3\2\2\2\t)\3\2\2\2\13\63"+
		"\3\2\2\2\r;\3\2\2\2\17B\3\2\2\2\21L\3\2\2\2\23P\3\2\2\2\25T\3\2\2\2\27"+
		"V\3\2\2\2\31X\3\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37_\3\2\2\2!\"\7.\2\2\""+
		"\4\3\2\2\2#$\7>\2\2$%\7?\2\2%\6\3\2\2\2&\'\7?\2\2\'(\7@\2\2(\b\3\2\2\2"+
		")*\7I\2\2*+\7c\2\2+,\7o\2\2,-\7g\2\2-.\7D\2\2./\7q\2\2/\60\7c\2\2\60\61"+
		"\7t\2\2\61\62\7f\2\2\62\n\3\2\2\2\63\64\7N\2\2\64\65\7c\2\2\65\66\7f\2"+
		"\2\66\67\7f\2\2\678\7g\2\289\7t\2\29:\7u\2\2:\f\3\2\2\2;<\7E\2\2<=\7j"+
		"\2\2=>\7w\2\2>?\7v\2\2?@\7g\2\2@A\7u\2\2A\16\3\2\2\2BC\7R\2\2CD\7q\2\2"+
		"DE\7u\2\2EF\7k\2\2FG\7v\2\2GH\7k\2\2HI\7q\2\2IJ\7p\2\2JK\7u\2\2K\20\3"+
		"\2\2\2LM\7>\2\2MN\7/\2\2N\22\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\24\3\2\2\2TU\7`\2\2U\26\3\2\2\2VW\7]\2\2W\30\3\2\2\2"+
		"XY\7_\2\2Y\32\3\2\2\2Z[\7}\2\2[\34\3\2\2\2\\]\7\177\2\2]\36\3\2\2\2^`"+
		"\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\20\2\2"+
		"d \3\2\2\2\5\2Ra\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}