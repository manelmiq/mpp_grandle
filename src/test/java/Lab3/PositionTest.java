package Lab3;


import static org.junit.Assert.*;


import com.github.javafaker.Faker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class PositionTest {

    @Parameter
    public Position position1;

    @Parameter(1)
    public Position position2;

    @Parameter(2)
    public boolean expected;

    @Parameters
    public static Collection<Object[]>data(){

        Position position1 = new Position();
        position1.fillRandomData();
//        List<Position> positions = new ArrayList<>(100);

//
//        for(int i = 0; i < 100; i++){
//            positions.get(i).fillRandomData();
//        }
//
//        return Arrays.asList(positions);
//        Collection<Object[]> t = new ArrayList<Object[]>(positions);

//        return t;


        return Arrays.asList(new Object[][]{
                {new Position("a", "b", null ), new Position("a", "b", null) , true},
                {new Position("a", "b", null ), new Position("b", "b", null) , false},
                {new Position("a", "b" , null), new Position("c", "b", null) , false},
                {position1, position1.clone(),  true},
//                {positions}

        });

    }





    @Test
    public void testClone(){
        assertTrue(position1.hashCode() == position1.clone().hashCode());
    }


    @Test
    public void testHashCode() {
        assertTrue((position1.hashCode() == position2.hashCode()) == expected );


    }
}