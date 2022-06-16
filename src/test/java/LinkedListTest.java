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

    @Test
    public void searchGivenNode_WhenFind_ShouldInsertDataAsNextNode() {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.insert((list.index(30) + 1), 40);
        boolean result = list.search(40);
        Assert.assertEquals(true, result);
    }

    @Test
    public void searchGivenNode_WhenFind_ShouldDeleteNodeAndReturnSize() {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.insert((list.index(30) + 1), 40);
        list.search(40);
        list.remove(40);
        int size = list.size();
        Assert.assertEquals(size,3);
    }
}
