

import cs1.Keyboard; /* must have cs1 dir in same dir as this file
                        for this to work */

public class GuessNumber {

    //instance vars
    private int _lo, _hi, _guessCtr, _target;

    public GuessNumber( int a, int b ) {
        _lo = a;
	_hi = b;
	_guessCtr = 1;
	_target = a + (int)(Math.random() * b);
    }

    public void playRec() {
	System.out.println("Guess a number between " + _lo + " and " + _hi + ":");
        int guess = Keyboard.readInt();
	if (guess > _target) {
	    _hi = guess;
	    _guessCtr++;
	    System.out.println("Too high! Guess again!");
	    this.playRec();
	}
	else if(guess < _target) {
	    _lo = guess;
	    _guessCtr++;
	    System.out.println("Too low! Guess again!");
	    this.playRec();
	}
	else {
	    System.out.println("YAY I'M SO PROUD, YOU GOT IT IN " + _guessCtr + " TRIES!");

	}
    }

    public void playIter() {
       int guess = 0;
	while(guess != _target) {
	System.out.println("Guess a number between " + _lo + " and " + _hi);
 guess = Keyboard.readInt ();
	if (guess > _target) {
	    _hi = guess;
	    _guessCtr++;
	    System.out.println("Too high! Guess again!");
	}
	else if(guess < _target) {
	    _lo = guess;
	    _guessCtr++;
	    System.out.println("Too low! Guess again!");
	}
	else {
	    System.out.println("YAY I'M SO PROUD, YOU GOT IT IN " + _guessCtr + " TRIES!");

	}
      }
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() {
        //use one or the other below:
        //playRec();
        playIter();
    }


    //main method to run it all
    public static void main( String[] args ) {

        //instantiate a new game
        GuessNumber g = new GuessNumber(1,100);

        //start the game
        g.play();
    }

}//end class
