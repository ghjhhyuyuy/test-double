package mock;

/**
 * Created by wzw on 2020/8/4
 *
 * @author wzw
 */
public class MockDoorPanel extends DoorPanel{
    static boolean isCalled = false;
    @Override
    void close(){
        isCalled = true;
    }
}
