import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;


class PowerArrayTest {
    PowerArray myArray = new PowerArray();
    PowerArray myMax = new PowerArray();
    PowerArray myPower = new PowerArray();
    double expected;
    double actual;

    @BeforeEach
    void setUp(){
        System.out.println("Testing");
    }
    @Test
    void powerArray(){
    expected = 32.0;
    actual = myArray.powerArray();
    assertEquals(expected, actual);
    }
    @Test
    void maxArray(){
        int expected = 2;
        actual = myMax.maxArray();
        assertEquals(expected, actual);
    }
 //still working on final test
//    @Test
//    void toPower(){
//        int[] expectedInt = new int[4];
//        int[] actualInt = myPower.toPower();
//    }


}