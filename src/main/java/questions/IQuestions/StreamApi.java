package questions.IQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamApi {

    public static void main(String[] args) {

        List<Integer> test = Arrays.asList(10,20,55,30,30,70);
        List<String>  tests = Arrays.asList("aab","aah","dtt");
        List<Integer> evens = test.stream().filter(t->t%2==0).toList();
        List<String> upper = tests.stream().map(String::toUpperCase).toList();
        Set<Integer> set = new HashSet<>();

        System.out.println(evens);
        System.out.println(upper);

        List<Integer> duplicate = test.stream().filter(x->!set.add(x)).toList();

        System.out.println(duplicate);

        int max = test.stream().max(Integer::compare).get();

        System.out.println(max);


    }
}
