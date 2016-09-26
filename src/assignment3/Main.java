/* WORD LADDER Main.java
 * EE422C Project 3 submission by
 * <Ashvin Roharia>
 * <ar34426>
 * <16475>
 * <Minkoo Park>
 * <mp32454>
 * <16480>
 * Slip days used: <0>
 * Git URL: https://github.com/aroharia/hw3
 * Fall 2016
 */

package assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	// static variables and constants only here.
	public static Scanner kb;	// input Scanner for commands
	public static ArrayList<String> start_end_wordList; //array list containing start word and end word
	public static String startWord; //first word for the word ladder
	public static String endWord; //last word for the word ladder
	public static Set<String> dictionaryWords; //all the words in the given dictionary
	
	public static void main(String[] args) throws Exception {
		
		
		PrintStream ps;	// output file
		// If arguments are specified, read/write from/to files instead of Std IO.
		if (args.length != 0) {
			kb = new Scanner(new File(args[0]));
			ps = new PrintStream(new File(args[1]));
			System.setOut(ps);			// redirect output to ps
		} else {
			kb = new Scanner(System.in);// default from Stdin
			ps = System.out;			// default to Stdout
		}
		
		// Reads user input and sets startWord and endWord
		initialize();
		
		//Ashvin is working on currently
		ArrayList<String> testingBFS = getWordLadderBFS(startWord, endWord);
		
		//TO DO
		//printLadder(testingBFS);
		
		//TO DO
		//ArrayList<String> testingDFS = getWordLadderDFS(startWord, endWord);
		
		//TO DO
		//printLadder(testingDFS);

	}
	
	public static void initialize() {
		// initialize your static variables or constants here.
		// We will call this method before running our JUNIT tests.  So call it 
		// only once at the start of main.
		dictionaryWords = makeDictionary();
		start_end_wordList = parse(kb);
		startWord = start_end_wordList.get(0).toString();
		endWord = start_end_wordList.get(1).toString();
	}
	
	/**
	 * @param keyboard Scanner connected to System.in
	 * @return ArrayList of 2 Strings containing start word and end word. 
	 * If command is /quit, return empty ArrayList. 
	 */
	public static ArrayList<String> parse(Scanner keyboard) {
		System.out.println("Enter two words here:");
		String input = keyboard.nextLine();
		
		//Check if "/quit" was entered
		if (input.equals("/quit"))
			return null;
		
		//ArrayList<String> start_end_wordList = (ArrayList<String>) Arrays.asList(input.split(" "));
		ArrayList<String> start_end_wordList = new ArrayList<String>(Arrays.asList(input.split(" ")));
		return start_end_wordList;
	}
	
	public static ArrayList<String> getWordLadderDFS(String start, String end) {
		
		// Returned list should be ordered start to end.  Include start and end.
		// Return empty list if no ladder.
		// TODO some code
		Set<String> dict = makeDictionary();
		// TODO more code
		
		return null; // replace this line later with real return
	}
	
    public static ArrayList<String> getWordLadderBFS(String start, String end) {
		
		// TODO some code
		Set<String> dict = makeDictionary();
		// TODO more code
		
		return null; // replace this line later with real return
	}
    
	public static Set<String>  makeDictionary () {
		Set<String> words = new HashSet<String>();
		Scanner infile = null;
		try {
			infile = new Scanner (new File("five_letter_words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary File not Found!");
			e.printStackTrace();
			System.exit(1);
		}
		while (infile.hasNext()) {
			words.add(infile.next().toUpperCase());
		}
		return words;
	}
	
	public static void printLadder(ArrayList<String> ladder) {
		
	}
	// TODO
	// Other private static methods here
}
