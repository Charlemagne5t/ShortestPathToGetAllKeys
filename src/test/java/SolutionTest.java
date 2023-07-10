import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void shortestPathAllKeysTest1() {
        String[] grid = {"@.a..", "###.#", "b.A.B"};
        int expected = 8;
        int actual = new Solution().shortestPathAllKeys(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shortestPathAllKeysTest2() {
        String[] grid = {"@..aA", "..B#.", "....b"};
        int expected = 6;
        int actual = new Solution().shortestPathAllKeys(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shortestPathAllKeysTest3() {
        String[] grid = {"@Aa"};
        int expected = -1;
        int actual = new Solution().shortestPathAllKeys(grid);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shortestPathAllKeysTest4() {
        String[] grid = {"@...a",".###A","b.BCc"};
        int expected = 10;
        int actual = new Solution().shortestPathAllKeys(grid);

        Assert.assertEquals(expected, actual);
    }

}
