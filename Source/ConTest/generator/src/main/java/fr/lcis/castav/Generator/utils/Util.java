package fr.lcis.castav.Generator.utils;

import java.util.Random;

import fr.lcis.castav.cdml.cDML.AtomicState;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.SuperState;

/**
 * Class containing utility functions
 * 
 * @author baheuxbi
 *
 */
public class Util {
	
	/**
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {

	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_BLACK = "\u001B[30m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_WHITE = "\u001B[37m";
	private static String[] color = new String[] {ANSI_RESET, ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE}; //inline i
	
	/**
	 * Prints the string x with the color chosen by colID
	 * Colors are :
	 * 1 - Black  5 - Blue
	 * 2 - Red    6 - Purple
	 * 3 - Green  7 - Cyan
	 * 4 - Yellow 8 - White
	 * 
	 * @param colID ID of color to use
	 * @param x String to print in color
	 */
	public static void colprint(Integer colID, String x) {
		if(colID > 0 && colID < 9) {
			System.out.print(color[colID]+x+color[0]);
		}
		else {
			System.out.print(x);
		}
	}
	
	
    public static String removeQuote(String str) {
    	String quotedStr = str;
		if(quotedStr.charAt(0) == '\"') quotedStr = quotedStr.substring(1);
		if(quotedStr.charAt(quotedStr.length() - 1) == '\"') quotedStr = quotedStr.substring(0, quotedStr.length()-1);
		return quotedStr;
    }
	
	
	public enum TypeOfState{
		Super,Atomic,AwareAtomic;
	}
	
	/**
	 * Checks the type of the state :
	 * 	SuperState  : TypeOfState.Super
	 * 	AtomicState : 
	 * 		if state isAware : TypeOfState.AwareAtomic
	 * 		else 			 : TypeOfState.Atomic
	 * 
	 *  TODO solve bug (States in adapter are considered StatesImpl and not AtomicSatesImpl or SuperStateImpl
	 *  
	 * 
	 * @param state State to check
	 * @return TypeOfState.Super, TypeOfState.Atomic or TypeOfState.AwareAtomic
	 */
	public static TypeOfState checkTypeOfState(State state) {
		TypeOfState t;
		//System.out.println("CASTING "+state.getClass());

		if (state instanceof SuperState) {
			t = TypeOfState.Super;
		}
		else if(state instanceof AtomicState){
			AtomicState atom = (AtomicState) state;
			//System.out.println("IS aware "+atom.isContextAware());
			if (atom.isContextAware()) {
				t = TypeOfState.AwareAtomic;
			}
			else {
				t = TypeOfState.Atomic;
			}
		}
		else {
			//TODO : Fix this strange bug -> States in adapter can be considered as stateImpl and not SuperStateImpl or AtomicStateImpl
			t = TypeOfState.Atomic;
		}
		return t;
	}

	
	/**
	 * Check if a string is a number
	 * source : baeldung (modified)
	 * 
	 * @param strNum string to check
	 * @return True if strNum can be parsed as a number
	 */
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
}
