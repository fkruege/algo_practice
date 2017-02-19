package permutations;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by fkruege on 2/18/2017.
 */
public class FindAllSubStringPermutationTests {

    @Test
    public void test_1(){
        FindAllSubStringsPermutations permutations =new FindAllSubStringsPermutations();
        List<String> results= permutations.findAllSubStringPermutations("abc");

        Assert.assertEquals(15, results.size());


    }
}
