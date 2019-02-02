package Lab3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import java.util.Collection;
import java.util.Arrays;

import java.util.List;

import static org.junit.Assert.*;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class DepartmentTest {

    @Parameter
    public Department department1;
    @Parameter(1)
    public Department department2;
    @Parameter(2)
    public Boolean expected;

    @Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
                {new Department("dep1", "x" ), new Department("dep1", "x") , true},
                {new Department("dep2", "x" ), new Department("dep1", "x") , false},
                {new Department("dep1", "z" ), new Department("dep1", "x") , false}

        });

    }





    @Test
    public void testEquals() {
        assertEquals(department1.equals(department2), expected);
    }
}