package main;

public class FizzBuzzMain {

    public static void main(String[] args){
        ResponseService service = new ResponseService();
        for (int i = 1; i <= 100; i++){
            System.out.println(service.getResponse(i));
        }
    }
}
