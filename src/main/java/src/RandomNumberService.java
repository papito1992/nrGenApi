package src;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RandomNumberService {


    public int RandomNumberGenerator() {

        Random randomNr = new Random();
        return randomNr.ints(1, (100 + 1)).findFirst().getAsInt();
    }

    public int[] RandomNumberArrayGenerator() {
        Random randomNr = new Random();
        int[] random_number_array = randomNr.ints(50, 1,10+1).toArray();

        return random_number_array;
    }

    public List<Long> RandomNumberList2Generator() {
        Random random = new Random();
        List<Long> longs = random.longs( 5 ,1,100).boxed().collect( Collectors.toList() );
        return longs;
    }
}
