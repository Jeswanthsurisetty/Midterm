import static org.junit.Assert.*;
import org.junit.Test;
public class Midterm_test {


@Test
public void testAuthenticate() {
assertTrue(Midterm_test.authenticate("ram", 
"3025"));
assertFalse(Midterm_test.authenticate("invalidname", 
"invalidid"));
}

private static boolean authenticate(String string, String string2) {
	// TODO Auto-generated method stub
	return false;
}

}

