/*
********* Yousaf Omar Azabi*********
This code is to correct spelling mistakes in words with the letters i and e when
they are adjacent. The rule used is "ie except c", there are an array contains
exception words. It is a demo and does need more work as adding more exception
words.
The class TextReader is in charge of reading a line form keyboard letter by
letter and call CIE class for every word to check if there is "ie" or "ei" and
correct any misspilling of "ie" and "ei".
*/

class TextReader {

	public static void main(String args[]) throws java.io.IOException {
		//define parameters CIE class defined in this file
		CIE cie = new CIE();
		// ch used to save character read from keyboard
		char ch;
		//'s' used to hold line read from keyboard, 'word' used to save every word from
		//'s' and 'correct' to hold returned correct word from CIE class.
		String s = "", word = "", correct = "";

		//loop to read a line from keyboard, one character at a time
		while ( (ch = (char) System.in.read()) != '\n') {
			s = s + ch;
		}
		s = s + ' ';

		for (int k = 0; k < s.length(); k++) //loop through line
			if (s.charAt(k) != ' ') { //check space to start new word
				word = word + s.charAt(k); //constuct words
			} else { //
				if (word.length() > 2) { //check length of word
					correct = cie.checkSpell(word);  //call spelling checker from CIE class
					if (word.compareTo(correct) != 0) //compare word for misspelling
						System.out.println("There is a misspelling in \'" + word + "\' at position "+ s.indexOf(word) +
									". The correct spelling is: " + correct);
						s = s.replaceFirst(word, correct); //replace misspelled word.
				}
				word = ""; //reset word variable for next iteration
			}
		System.out.println("\n The text after correction is: \n \t " + s); //print correct sentance
	}

}

//class to check misspelled words using rule "ie except c".
class CIE {
//array of irrigular words
private String[] irrigular = {"science","neighbour","species","sufficient","receive","ceiling","receipt","ceilidh"};

public String checkSpell(String s) { //check against irrigular words
	for (int k = 0; k < irrigular.length; k++) { //loop through array
		if (s.equals(irrigular[k])) return s; // if equal return
	}
	return checkIE(s.toLowerCase()); //call ie checker
}

private String checkIE(String s) {
		for (int k = 1; k < s.length(); k++) { //loop through characters in word
			if ((s.charAt(k) == 'i') & (s.charAt(k-1) == 'e')) { //check 'ei'
				if (s.charAt(k-2) != 'c') { //check if 'ei' not preceded by 'c'
					 s = s.replace("ei","ie"); //relplace 'ei' with 'ie'
				}
			}
			if ((s.charAt(k) == 'e') & (s.charAt(k-1) == 'i')) { //check 'ie'
				if (s.charAt(k-2) == 'c') { //check if 'ei' is preceded by 'c'
					s = s.replace("ie","ei"); //relplace 'ie' with 'ei'
				}
			}
		}
		return s; //return corrected word
	}

}
