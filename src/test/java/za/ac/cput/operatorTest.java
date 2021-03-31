package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class operatorTest {
    operator obj1 = new operator("Two Object");
    operator obj2 = new operator("Object");

    @Test
    public void test(){
        assertEquals(obj1.equals(obj2),false);
    }


    @Test
    public void test1(){
        assertEquals(obj1.equals2(obj2),false);
    }

}