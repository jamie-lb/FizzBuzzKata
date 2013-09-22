package main;

public class ResponseService {

    private int inputValue;
    private String inputString;

    public String getResponse(int input) {
        inputValue = input;
        inputString = String.valueOf(input);
        if (isFizzBuzzWord()){
            return "FizzBuzz";
        } else if (isFizzWord()){
            return "Fizz";
        } else if (isBuzzWord()){
            return "Buzz";
        } else{
            return inputString;
        }
    }

    private boolean isFizzWord() {
        return inputValue % 3 == 0 || inputString.contains("3");
    }

    private boolean isBuzzWord() {
        return inputValue % 5 == 0 || inputString.contains("5");
    }

    private boolean isFizzBuzzWord(){
        return isFizzWord() && isBuzzWord();
    }
}
