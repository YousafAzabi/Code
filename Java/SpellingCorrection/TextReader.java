class TextReader{

	public static void main(String args[]) throws java.io.IOException{

		CIE cie = new CIE();
		char ch;
		String s = "", word = "", correct = "";

		//loop to read a line from keyboard, one character at a time
		while( (ch = (char) System.in.read()) != '\n'){
			s = s + ch;
		}
		s = s + ' ';

		for (int i=0 ; i < s.length() ; i++) //loop through line
			if(s.charAt(i) != ' ') { //check space to strat new word
				word = word + s.charAt(i); //constuct words
			} else { //
				if (word.length() > 2){  //check length of word
					correct = cie.checkSpell(word);  //call spelling checker from CIE class
					if (word.compareTo(correct) != 0) //compare word for misspelling
						System.out.println("There is a misspelling in \'" + word + "\' correct spelling is: " + correct);
						s = s.replace(word, correct); //replace misspelled word.
				}
				word = ""; //reset word variable for next iteration
			}
		System.out.println("\n The text after correction is: \n \t " + s); //print correct sentance
	}

}

//class to check misspelled words using rule "ie except c".
class CIE{
//array of irrigular words
private String[] irrigular = {"science","neighbour","species","sufficient","receive","ceiling","receipt","ceilidh"};

public String checkSpell(String s){						//check against irrigular words
	for(int i=0 ; i < irrigular.length ; i++){	//loop through array
		if (s.equals(irrigular[i])) return s;			// if equal return
	}
	return checkIE(s);													//call ie checker
}

private String checkIE(String s){
		for(int i=1 ; i < s.length() ; i++){
			if ( (s.charAt(i) == 'i' | s.charAt(i) == 'I') & (s.charAt(i-1) == 'e' | s.charAt(i-1) == 'E')){
				if( (s.charAt(i-2) != 'c' & s.charAt(i-2) != 'C')){
					 s = s.replace("ei","ie");
				}
			}
			if ((s.charAt(i) == 'e' | s.charAt(i) == 'E') && (s.charAt(i-1) == 'i' | s.charAt(i-1) == 'I')){
				if((s.charAt(i-2) == 'c' | s.charAt(i-2) == 'C')){
					s = s.replace("ie","ei");
				}
			}
		}
		return s;
	}

}
