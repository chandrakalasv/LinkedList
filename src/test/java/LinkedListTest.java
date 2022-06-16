import com.bridge.list.IList;
import com.bridge.list.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void searchNodeWithValue_WhenFind_ShouldReturnTrue() {
        IList<Integer> list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        boolean result = list.search(30);
        Assert.assertTrue(result);
    }
}
