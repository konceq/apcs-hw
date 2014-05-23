/*==================================================
class GuessNumber -- fun fun fun!

eg, sample interaction with end user:
Guess a # fr 1-100: 50
Too high
Guess a # fr 1-49: 25
Too low
Guess a # fr 26-49: 38
Correct! It took 3 guesses
==================================================*/

/*==================================================
the Breakdown:
What is the max # of guesses if num is b/t 1&100? 99
What is the max # of guesses if num is b/t 1&200? 199
What is the max # of guesses if num is b/t 1&400? 399
What is the max # of guesses if num is b/t 1&1000? 999
What is the max # of guesses if num is b/t 1&n? n-1
==================================================*/


import cs1.Keyboard; /* must have cs1 dir in same dir as this file
                        for this to work */

public class GuessNumber {

    //instance vars
    private int _lo, _hi, _guessCtr, _target;



    /*==================================================
constructor -- initializes a guess-a-number game
pre:
post: _lo is lower bound, _hi is upper bound,
_guessCtr is 1, _target is random int on range [_lo,_hi]
==================================================*/
    public GuessNumber( int a, int b ) {
        _lo = a;
	_hi = b;
	_guessCtr = 1;
	_target = a + (int)(Math.random() * b);
    }


    /*==================================================
void playRec() -- Prompts a user to guess until guess is correct.
Uses recursion.
pre:
post:
==================================================*/
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


    /*==================================================
void playIter() -- Prompts a user to guess until guess is correct.
Uses iteration.
pre:
post:
==================================================*/
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


    /*==================================================
_ _(_) --
pre:
post:
==================================================*/
}//end class
