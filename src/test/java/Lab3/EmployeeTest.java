package Lab3;

import Lab3.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import java.util.Collection;
import java.util.Arrays;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class EmployeeTest {



    @Parameter
    public Employee employee1;

     @Parameter(1)
    public Employee employee2;

     @Parameter(2)
     public boolean expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                { new Employee(1,"Emmanuell", "123"), new Employee(1,"Emmanuell", "123"), Boolean.TRUE},
                { new Employee(1,"Emmanuell", "123"), null, Boolean.FALSE},
                { new Employee(1,"Emmanuell", "223"), new Employee(1,"Emmanuell", "123"), Boolean.FALSE},
                { new Employee(1,"Emmanuell", "123"), new Employee(1,"Jose", "123"), Boolean.FALSE},
                { new Employee(0,"jose", "999"), new Employee(1,"Emmanuell", "123"), Boolean.FALSE},
                { new Employee(0,"Emmanuell", "123"), new Employee(1,"Emmanuell", "123"), Boolean.FALSE},
        });
    }


    @Test
    public void testHash(){
        if(expected){
            assertEquals(employee1.hashCode(),employee2.hashCode());
        }else
             assertTrue ( employee1.hashCode()!=  employee2.hashCode() );
    }



    @Test
    public void testEquals() {
        assertEquals(employee1.equals(employee2), expected);
    }
}