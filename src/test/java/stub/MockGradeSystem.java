package stub;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wzw on 2020/8/4
 *
 * @author wzw
 */
public class MockGradeSystem extends GradeSystem{
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(80.0, 90.0, 100.0);
    }
}
