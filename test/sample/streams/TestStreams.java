package sample.streams;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * Author: glaschenko
 * Created: 11.09.2018
 */
public class TestStreams extends TestCase {
    public void testStreams(){
        ArrayList<String> strings = createArray();

//        Integer sum = 0;
//        for (String string : strings) {
//            sum+=Integer.parseInt(string);
//        }
        Optional<Integer> res = strings.stream()
                .map((Integer::parseInt))
                .reduce((i1, i2) -> i1 + i2);
        res.ifPresent(r->System.out.println("res = " + r));




    }

    public void testStreams2(){
        ArrayList<String> strings = createArray();
        long count = strings.stream().filter(s -> s.startsWith("7")).count();
        System.out.println("count = " + count);
    }

    public void testStreams3(){
        ArrayList<String> strings = createArray();
        List<Integer> collect = strings.stream()
                .map(Integer::parseInt)
                .filter(i -> i <= 0)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

    private ArrayList<String> createArray() {
        ArrayList<String> strings = new ArrayList<>();
        Random random = new Random(9789);
        for (int i = 0; i < 1000 ; i++) {
            strings.add(Integer.toString(random.nextInt()));
        }
        return strings;
    }

}
