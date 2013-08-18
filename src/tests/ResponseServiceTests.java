package tests;

import main.ResponseService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResponseServiceTests {

    @Test
    public void PassingOneShouldReturnOne(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(1);
        assertEquals("1", result);
    }

    @Test
    public void PassingThreeShouldReturnFizz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void PassingFiveShouldReturnBuzz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void PassingSixShouldReturnFizz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void PassingTenShouldReturnBuzz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void PassingFifteenShouldReturnFizzBuzz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void PassingEighteenShouldReturnFizz()
    {
        ResponseService service = new ResponseService();
        String result = service.getResponse(18);
        assertEquals("Fizz", result);
    }

    @Test
    public void PassingThirteenShouldReturnFizz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(13);
        assertEquals("Fizz", result);
    }

    @Test
    public void PassingThirtyOneShouldReturnFizz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(31);
        assertEquals("Fizz", result);
    }

    @Test
    public void PassingFiftyTwoShouldReturnBuzz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(52);
        assertEquals("Buzz", result);
    }

    @Test
    public void PassingFiftyThreeShouldReturnFizzBuzz(){
        ResponseService service = new ResponseService();
        String result = service.getResponse(53);
        assertEquals("FizzBuzz", result);
    }
}