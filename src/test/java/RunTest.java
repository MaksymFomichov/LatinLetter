import latin.ReverseLatin;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RunTest {
    @Test
    public void GetReverseTextTest() throws Exception{
        ReverseLatin reverseLatin = new ReverseLatin("a1bcd efg!h");
        // Проверяемый метод
        assertEquals("\"a1bcd efg!h\" => \"d1cba hgf!e\"", "d1cba hgf!e", reverseLatin.getReverseText());
    }
}
