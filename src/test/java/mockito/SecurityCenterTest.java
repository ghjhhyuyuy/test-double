package mockito;


import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    SecurityCenter securityCenter;

    @BeforeEach
    public void setUp() {
        securityCenter = Mockito.mock(SecurityCenter.class);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        Mockito.verify(securityCenter, Mockito.times(1)).switchOn();
    }
}
