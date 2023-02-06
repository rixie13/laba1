import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest2 {

    @Test
    public void sumTrue() {
       int a=5;
        int b=5;
        int c=5;
        assertEquals(10, Main.sum(a,b,c));
    }
}