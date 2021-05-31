package omg;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class test {
    Calcuator c1 = new Calcuator();
    @Test
//  Phương thức assert Equals: đúng
    public void Vd1() {
        assertEquals(6, c1.multi(3, 2));
    }

//    Phương thức assert Equals: sai
    @Test
    public void Vd2() {
        assertEquals(5, c1.multi(3, 2));

    }
//    Phương thức assernotEqual: đúng
    @Test
    public void Vd3() {
        assertNotEquals(7, c1.multi(3, 2));

    }
//  Phương thức assertnotEqual: sai
    @Test
    public void Vd4() {
        assertNotEquals(6, c1.multi(3, 2));

    }


//  Phương thức assertArrayEquals: đúng
    @Test
    public void Vd5()
    {
        assertArrayEquals(new int []{1,2,3}, new int []{1,2,3});
    }


    //  Phương thức assertArrayEquals: sai
    @Test
    public void Vd6()
    {
        assertArrayEquals(new int []{1,2,3}, new int []{1,2,3,5});
    }

    //  Phương thức asserNull: đúng
    @Test
    public void Vd7()
    {
//        String chuoia = c1.chuoi();
        String chuoia =null;
        assertNull(chuoia);
    }

    //  Phương thức asserNull: sai
    @Test
    public void Vd8()
    {
        String chuoia = "Java";
        assertNull(chuoia);
    }

    //  Phương thức asserNotNull: đúng
    @Test
    public void Vd9()
    {
//        String chuoia = c1.chuoi();
        String chuoia ="java";
        assertNotNull(chuoia);
    }

    //  Phương thức asserNotNull: sai
    @Test
    public void Vd10()
    {
        String chuoia = null;
        assertNull(chuoia);
    }

    //  Phương thức assertTrue: đúng
    @Test
    public void Vd11()
    {
        assertTrue (c1.sum(2,3)<c1.multi(2,3));
    }

    //  Phương thức assertTrue: sai
    @Test
    public void Vd12()
    {
        assertTrue (c1.sum(2,3)>c1.multi(2,3));
    }

    //  Phương thức assertFalse: đúng
    @Test
    public void Vd13()
    {
        assertFalse (c1.sum(2,3)>c1.multi(2,3));
    }

    //  Phương thức assertFalse: sai
    @Test
    public void Vd14()
    {
        assertFalse (c1.sum(2,3)<c1.multi(2,3));
    }


    //  Phương thức assertSame: đúng
        @Test
        public void Vd15()
        {
            int a =c1.sum(2,2);
            int b = c1.multi(2,2);
            assertSame(a,b);
        }

        //  Phương thức assertSame: fail
        @Test
        public void Vd16()
        {
            int a =c1.sum(2,2);
            int b = c1.multi (3,2);
            assertSame(a,b);
        }

    //  Phương thức assertNotSame: đúng
    @Test
    public void Vd17()
    {
        int a =c1.sum(2,2);
        int b = c1.multi(3,2);
        assertNotSame(a,b);
    }

    //  Phương thức assertSame: fail
    @Test
    public void Vd18()
    {
        int a =c1.sum(2,2);
        int b = c1.multi (2,2);
        assertNotSame(a,b);
    }

}

