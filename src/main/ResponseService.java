package main;

public class ResponseService {
    public String getResponse(int input) {
        String inputString = String.valueOf(input);
        if (isFizzWord(input, inputString))
        {
            if (isBuzzWord(input, inputString)) return "FizzBuzz";
            return "Fizz";
        }
        if (isBuzzWord(input, inputString)) return "Buzz";
        return inputString;
    }

    private boolean isFizzWord(int input, String inputString) {
        return input % 3 == 0 || inputString.contains("3");
    }

    private boolean isBuzzWord(int input, String inputString) {
        return input % 5 == 0 || inputString.contains("5");
    }
}
