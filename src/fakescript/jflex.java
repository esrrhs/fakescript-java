/* The following code was generated by JFlex 1.6.1 */

package fakescript;

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>jflex.flex</tt>
 */
public class jflex implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\2\1\0\1\0\1\1\22\0\1\0\1\50\1\5"+
    "\2\0\1\41\1\0\1\57\1\51\1\52\1\44\1\43\1\42\1\36"+
    "\1\35\1\3\12\34\1\45\1\0\1\47\1\46\1\37\2\0\4\33"+
    "\1\40\25\33\1\53\1\4\1\54\1\0\1\33\1\0\1\7\1\15"+
    "\1\20\1\27\1\11\1\17\1\31\1\22\1\23\1\33\1\16\1\24"+
    "\1\33\1\14\1\25\1\30\1\33\1\10\1\26\1\12\1\13\1\6"+
    "\1\21\1\33\1\32\1\33\1\55\1\0\1\56\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\1\2\1\3\21\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\1\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\1\1\26\1\27\1\30\1\4\2\0\17\4\1\31"+
    "\1\32\1\33\6\4\1\34\1\0\1\35\1\5\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\2\27\1\61\1\62\1\0\1\63\1\4"+
    "\1\64\3\4\1\65\4\4\1\66\12\4\1\67\1\70"+
    "\1\4\1\71\1\72\1\73\1\4\1\74\1\4\1\75"+
    "\1\76\12\4\1\0\2\4\1\77\1\100\1\4\1\101"+
    "\1\102\3\4\1\103\2\4\1\104\1\67\1\0\1\105"+
    "\1\106\2\4\1\107\1\110\3\4\1\111\1\112\1\113"+
    "\1\114";

  private static int [] zzUnpackAction() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\140\0\360\0\u0120"+
    "\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420"+
    "\0\u0450\0\u0480\0\u04b0\0\u04e0\0\140\0\u0510\0\u0540\0\u0570"+
    "\0\u05a0\0\u05d0\0\u0600\0\140\0\140\0\140\0\140\0\140"+
    "\0\140\0\u0630\0\u0660\0\140\0\u0690\0\140\0\u06c0\0\u06f0"+
    "\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870"+
    "\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0"+
    "\0\u01e0\0\u01e0\0\u01e0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0"+
    "\0\u0b10\0\140\0\u0b40\0\140\0\u0b70\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\140\0\140\0\140\0\140\0\140"+
    "\0\u0ba0\0\140\0\u01e0\0\u0bd0\0\u0c00\0\u01e0\0\u0c30\0\u01e0"+
    "\0\u0c60\0\u0c90\0\u0cc0\0\u01e0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80"+
    "\0\u01e0\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0"+
    "\0\u0f00\0\u0f30\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u01e0"+
    "\0\u01e0\0\u1050\0\u01e0\0\u1080\0\u01e0\0\u01e0\0\u10b0\0\u10e0"+
    "\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260"+
    "\0\u1290\0\u12c0\0\u12f0\0\u01e0\0\u01e0\0\u1320\0\u01e0\0\u01e0"+
    "\0\u1350\0\u1380\0\u13b0\0\u01e0\0\u13e0\0\u1410\0\u01e0\0\u1440"+
    "\0\u1440\0\u01e0\0\u01e0\0\u1470\0\u14a0\0\u01e0\0\u01e0\0\u14d0"+
    "\0\u1500\0\u1530\0\u01e0\0\u01e0\0\u01e0\0\u01e0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\3\1\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\14\1\17"+
    "\1\20\1\21\1\14\1\22\1\14\1\23\1\24\1\25"+
    "\1\26\1\14\1\27\1\14\1\30\1\31\1\32\1\33"+
    "\1\14\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\3"+
    "\1\52\2\3\1\52\1\53\1\54\52\52\62\0\1\3"+
    "\60\0\1\55\42\0\1\56\17\0\1\14\1\57\25\14"+
    "\1\60\1\61\1\0\1\14\25\0\6\14\1\62\20\14"+
    "\1\60\1\61\1\0\1\14\25\0\3\14\1\63\23\14"+
    "\1\60\1\61\1\0\1\14\25\0\6\14\1\64\7\14"+
    "\1\65\10\14\1\60\1\61\1\0\1\14\25\0\2\14"+
    "\1\66\11\14\1\67\12\14\1\60\1\61\1\0\1\14"+
    "\25\0\27\14\1\60\1\61\1\0\1\14\25\0\17\14"+
    "\1\70\7\14\1\60\1\61\1\0\1\14\25\0\2\14"+
    "\1\71\24\14\1\60\1\61\1\0\1\14\25\0\1\14"+
    "\1\72\3\14\1\73\11\14\1\74\7\14\1\60\1\61"+
    "\1\0\1\14\25\0\1\14\1\75\15\14\1\76\7\14"+
    "\1\60\1\61\1\0\1\14\25\0\14\14\1\77\12\14"+
    "\1\60\1\61\1\0\1\14\25\0\6\14\1\100\2\14"+
    "\1\101\6\14\1\102\6\14\1\60\1\61\1\0\1\14"+
    "\25\0\2\14\1\103\24\14\1\60\1\61\1\0\1\14"+
    "\25\0\4\14\1\104\6\14\1\105\2\14\1\106\10\14"+
    "\1\60\1\61\1\0\1\14\25\0\3\14\1\107\23\14"+
    "\1\60\1\61\1\0\1\14\25\0\1\14\1\110\25\14"+
    "\1\60\1\61\1\0\1\14\25\0\15\14\1\111\11\14"+
    "\1\60\1\61\1\0\1\14\32\0\1\112\20\0\1\30"+
    "\1\113\57\0\1\114\56\0\1\115\2\0\1\116\6\0"+
    "\1\117\57\0\1\120\57\0\1\121\54\0\1\122\2\0"+
    "\1\123\57\0\1\124\57\0\1\125\57\0\1\126\57\0"+
    "\1\127\57\0\1\130\11\0\1\52\2\0\1\52\2\0"+
    "\52\52\4\0\1\131\1\132\2\0\1\133\1\0\1\134"+
    "\1\0\1\135\1\136\1\0\1\137\37\0\1\140\1\55"+
    "\1\141\1\142\55\55\6\0\2\14\1\143\24\14\1\60"+
    "\1\61\1\0\1\14\25\0\26\144\4\0\1\144\56\0"+
    "\1\145\26\0\21\14\1\146\5\14\1\60\1\61\1\0"+
    "\1\14\25\0\4\14\1\147\22\14\1\60\1\61\1\0"+
    "\1\14\25\0\21\14\1\150\5\14\1\60\1\61\1\0"+
    "\1\14\25\0\20\14\1\151\6\14\1\60\1\61\1\0"+
    "\1\14\25\0\5\14\1\152\21\14\1\60\1\61\1\0"+
    "\1\14\25\0\3\14\1\153\23\14\1\60\1\61\1\0"+
    "\1\14\25\0\4\14\1\154\22\14\1\60\1\61\1\0"+
    "\1\14\25\0\3\14\1\155\23\14\1\60\1\61\1\0"+
    "\1\14\25\0\10\14\1\156\5\14\1\157\10\14\1\60"+
    "\1\61\1\0\1\14\25\0\6\14\1\160\20\14\1\60"+
    "\1\61\1\0\1\14\25\0\2\14\1\161\24\14\1\60"+
    "\1\61\1\0\1\14\25\0\20\14\1\162\6\14\1\60"+
    "\1\61\1\0\1\14\25\0\6\14\1\163\20\14\1\60"+
    "\1\61\1\0\1\14\25\0\15\14\1\164\11\14\1\60"+
    "\1\61\1\0\1\14\25\0\12\14\1\165\14\14\1\60"+
    "\1\61\1\0\1\14\25\0\2\14\1\166\24\14\1\60"+
    "\1\61\1\0\1\14\25\0\15\14\1\167\11\14\1\60"+
    "\1\61\1\0\1\14\25\0\3\14\1\170\23\14\1\60"+
    "\1\61\1\0\1\14\25\0\11\14\1\171\15\14\1\60"+
    "\1\61\1\0\1\14\25\0\12\14\1\172\14\14\1\60"+
    "\1\61\1\0\1\14\25\0\3\14\1\173\23\14\1\60"+
    "\1\61\1\0\1\14\53\0\1\174\57\0\1\115\1\113"+
    "\24\0\1\142\63\0\27\144\1\60\2\0\1\144\25\0"+
    "\26\175\4\0\1\175\25\0\5\14\1\176\21\14\1\60"+
    "\1\61\1\0\1\14\25\0\3\14\1\177\23\14\1\60"+
    "\1\61\1\0\1\14\25\0\3\14\1\200\23\14\1\60"+
    "\1\61\1\0\1\14\25\0\6\14\1\201\20\14\1\60"+
    "\1\61\1\0\1\14\25\0\1\14\1\202\25\14\1\60"+
    "\1\61\1\0\1\14\25\0\3\14\1\203\23\14\1\60"+
    "\1\61\1\0\1\14\25\0\20\14\1\204\6\14\1\60"+
    "\1\61\1\0\1\14\25\0\12\14\1\205\14\14\1\60"+
    "\1\61\1\0\1\14\25\0\3\14\1\206\23\14\1\60"+
    "\1\61\1\0\1\14\25\0\4\14\1\207\13\14\1\210"+
    "\6\14\1\60\1\61\1\0\1\14\25\0\16\14\1\211"+
    "\10\14\1\60\1\61\1\0\1\14\25\0\16\14\1\212"+
    "\10\14\1\60\1\61\1\0\1\14\25\0\5\14\1\213"+
    "\21\14\1\60\1\61\1\0\1\14\25\0\4\14\1\214"+
    "\22\14\1\60\1\61\1\0\1\14\25\0\3\14\1\215"+
    "\23\14\1\60\1\61\1\0\1\14\25\0\1\14\1\216"+
    "\25\14\1\60\1\61\1\0\1\14\25\0\10\14\1\217"+
    "\16\14\1\60\1\61\1\0\1\14\25\0\16\14\1\220"+
    "\10\14\1\60\1\61\1\0\1\14\30\0\1\221\22\0"+
    "\1\174\3\0\1\221\25\0\27\175\1\0\1\61\1\0"+
    "\1\175\25\0\2\14\1\222\24\14\1\60\1\61\1\0"+
    "\1\14\25\0\15\14\1\223\11\14\1\60\1\61\1\0"+
    "\1\14\25\0\10\14\1\224\16\14\1\60\1\61\1\0"+
    "\1\14\25\0\3\14\1\225\23\14\1\60\1\61\1\0"+
    "\1\14\25\0\15\14\1\226\11\14\1\60\1\61\1\0"+
    "\1\14\25\0\4\14\1\227\22\14\1\60\1\61\1\0"+
    "\1\14\25\0\3\14\1\230\23\14\1\60\1\61\1\0"+
    "\1\14\25\0\5\14\1\231\21\14\1\60\1\61\1\0"+
    "\1\14\25\0\12\14\1\232\14\14\1\60\1\61\1\0"+
    "\1\14\25\0\12\14\1\233\14\14\1\60\1\61\1\0"+
    "\1\14\25\0\22\14\1\234\4\14\1\60\1\61\1\0"+
    "\1\14\25\0\5\14\1\235\21\14\1\60\1\61\1\0"+
    "\1\14\25\0\1\14\1\236\25\14\1\60\1\61\1\0"+
    "\1\14\25\0\21\14\1\237\5\14\1\60\1\61\1\0"+
    "\1\14\53\0\1\240\1\0\1\241\27\0\6\14\1\242"+
    "\20\14\1\60\1\61\1\0\1\14\25\0\11\14\1\243"+
    "\15\14\1\60\1\61\1\0\1\14\25\0\6\14\1\244"+
    "\20\14\1\60\1\61\1\0\1\14\25\0\21\14\1\245"+
    "\5\14\1\60\1\61\1\0\1\14\25\0\4\14\1\246"+
    "\22\14\1\60\1\61\1\0\1\14\25\0\14\14\1\247"+
    "\12\14\1\60\1\61\1\0\1\14\25\0\16\14\1\250"+
    "\10\14\1\60\1\61\1\0\1\14\25\0\23\14\1\251"+
    "\3\14\1\60\1\61\1\0\1\14\53\0\1\240\31\0"+
    "\5\14\1\252\21\14\1\60\1\61\1\0\1\14\25\0"+
    "\3\14\1\253\23\14\1\60\1\61\1\0\1\14\25\0"+
    "\4\14\1\254\22\14\1\60\1\61\1\0\1\14\25\0"+
    "\3\14\1\255\23\14\1\60\1\61\1\0\1\14\25\0"+
    "\3\14\1\256\23\14\1\60\1\61\1\0\1\14\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5472];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\1\11\26\1\1\11\6\1\6\11"+
    "\2\1\1\11\1\1\1\11\1\1\2\0\30\1\1\11"+
    "\1\0\1\11\1\1\23\11\1\1\1\11\2\1\1\0"+
    "\53\1\1\0\17\1\1\0\15\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[174];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  StringBuilder string = new StringBuilder();
  
  private Symbol symbol(int type) {
	types.log("[JFLEX]: " + sym.terminalNames[type]);
    return new javasymbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
	types.log("[JFLEX]: " + sym.terminalNames[type] + "(" + value.toString() + ")");
    return new javasymbol(type, yyline+1, yycolumn+1, value);
  }

  /** 
   * assumes correct representation of a long value for 
   * specified radix in scanner buffer from <code>start</code> 
   * to <code>end</code> 
   */
  private long parseLong(int start, int end, int radix) {
    long result = 0;
    long digit;

    for (int i = start; i < end; i++) {
      digit  = Character.digit(yycharat(i),radix);
      result*= radix;
      result+= digit;
    }

    return result;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public jflex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 168) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case YYINITIAL: {
              return symbol(EOF);
            }
            case 175: break;
            default:
              {
                return symbol(EOF);
              }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 77: break;
          case 2: 
            { return symbol(DIVIDE);
            }
          case 78: break;
          case 3: 
            { yybegin(STRING); string.setLength(0);
            }
          case 79: break;
          case 4: 
            { return symbol(IDENTIFIER, yytext());
            }
          case 80: break;
          case 5: 
            { return symbol(NUMBER, yytext());
            }
          case 81: break;
          case 6: 
            { return symbol(MINUS);
            }
          case 82: break;
          case 7: 
            { return symbol(MORE);
            }
          case 83: break;
          case 8: 
            { return symbol(DIVIDE_MOD);
            }
          case 84: break;
          case 9: 
            { return symbol(ARG_SPLITTER);
            }
          case 85: break;
          case 10: 
            { return symbol(PLUS);
            }
          case 86: break;
          case 11: 
            { return symbol(MULTIPLY);
            }
          case 87: break;
          case 12: 
            { return symbol(COLON);
            }
          case 88: break;
          case 13: 
            { return symbol(ASSIGN);
            }
          case 89: break;
          case 14: 
            { return symbol(LESS);
            }
          case 90: break;
          case 15: 
            { return symbol(OPEN_BRACKET);
            }
          case 91: break;
          case 16: 
            { return symbol(CLOSE_BRACKET);
            }
          case 92: break;
          case 17: 
            { return symbol(OPEN_SQUARE_BRACKET);
            }
          case 93: break;
          case 18: 
            { return symbol(CLOSE_SQUARE_BRACKET);
            }
          case 94: break;
          case 19: 
            { return symbol(OPEN_BIG_BRACKET);
            }
          case 95: break;
          case 20: 
            { return symbol(CLOSE_BIG_BRACKET);
            }
          case 96: break;
          case 21: 
            { string.append( yytext() );
            }
          case 97: break;
          case 22: 
            { yybegin(YYINITIAL); return symbol(STRING_DEFINITION, string);
            }
          case 98: break;
          case 23: 
            { /* ignore */
            }
          case 99: break;
          case 24: 
            { return symbol(DIVIDE_ASSIGN);
            }
          case 100: break;
          case 25: 
            { return symbol(IF);
            }
          case 101: break;
          case 26: 
            { return symbol(IS);
            }
          case 102: break;
          case 27: 
            { return symbol(OR);
            }
          case 103: break;
          case 28: 
            { return symbol(FKUUID, yytext());
            }
          case 104: break;
          case 29: 
            { return symbol(STRING_CAT);
            }
          case 105: break;
          case 30: 
            { return symbol(RIGHT_POINTER);
            }
          case 106: break;
          case 31: 
            { return symbol(MINUS_ASSIGN);
            }
          case 107: break;
          case 32: 
            { return symbol(MORE_OR_EQUAL);
            }
          case 108: break;
          case 33: 
            { return symbol(DIVIDE_MOD_ASSIGN);
            }
          case 109: break;
          case 34: 
            { return symbol(INC);
            }
          case 110: break;
          case 35: 
            { return symbol(PLUS_ASSIGN);
            }
          case 111: break;
          case 36: 
            { return symbol(MULTIPLY_ASSIGN);
            }
          case 112: break;
          case 37: 
            { return symbol(NEW_ASSIGN);
            }
          case 113: break;
          case 38: 
            { return symbol(EQUAL);
            }
          case 114: break;
          case 39: 
            { return symbol(LESS_OR_EQUAL);
            }
          case 115: break;
          case 40: 
            { return symbol(NOT_EQUAL);
            }
          case 116: break;
          case 41: 
            { string.append( '\\' );
            }
          case 117: break;
          case 42: 
            { string.append( '\"' );
            }
          case 118: break;
          case 43: 
            { string.append( '\r' );
            }
          case 119: break;
          case 44: 
            { string.append( '\t' );
            }
          case 120: break;
          case 45: 
            { string.append( '\n' );
            }
          case 121: break;
          case 46: 
            { string.append( '\b' );
            }
          case 122: break;
          case 47: 
            { string.append( '\f' );
            }
          case 123: break;
          case 48: 
            { string.append( '\'' );
            }
          case 124: break;
          case 49: 
            { return symbol(VAR_BEGIN);
            }
          case 125: break;
          case 50: 
            { return symbol(IDENTIFIER_DOT, yytext());
            }
          case 126: break;
          case 51: 
            { return symbol(AND);
            }
          case 127: break;
          case 52: 
            { return symbol(END);
            }
          case 128: break;
          case 53: 
            { return symbol(NOT);
            }
          case 129: break;
          case 54: 
            { return symbol(FOR);
            }
          case 130: break;
          case 55: 
            { return symbol(FKFLOAT, yytext());
            }
          case 131: break;
          case 56: 
            { return symbol(IDENTIFIER_POINTER, yytext());
            }
          case 132: break;
          case 57: 
            { return symbol(ELSE);
            }
          case 133: break;
          case 58: 
            { return symbol(FTRUE);
            }
          case 134: break;
          case 59: 
            { return symbol(THEN);
            }
          case 135: break;
          case 60: 
            { return symbol(FAKE);
            }
          case 136: break;
          case 61: 
            { return symbol(FUNC);
            }
          case 137: break;
          case 62: 
            { return symbol(CASE);
            }
          case 138: break;
          case 63: 
            { return symbol(BREAK);
            }
          case 139: break;
          case 64: 
            { return symbol(FFALSE);
            }
          case 140: break;
          case 65: 
            { return symbol(FCONST);
            }
          case 141: break;
          case 66: 
            { return symbol(WHILE);
            }
          case 142: break;
          case 67: 
            { return symbol(SLEEP);
            }
          case 143: break;
          case 68: 
            { return symbol(YIELD);
            }
          case 144: break;
          case 69: 
            { return symbol(RETURN);
            }
          case 145: break;
          case 70: 
            { return symbol(ELSEIF);
            }
          case 146: break;
          case 71: 
            { return symbol(STRUCT);
            }
          case 147: break;
          case 72: 
            { return symbol(SWITCH);
            }
          case 148: break;
          case 73: 
            { return symbol(INCLUDE);
            }
          case 149: break;
          case 74: 
            { return symbol(DEFAULT);
            }
          case 150: break;
          case 75: 
            { return symbol(PACKAGE);
            }
          case 151: break;
          case 76: 
            { return symbol(CONTINUE);
            }
          case 152: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java jflex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        jflex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new jflex(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}