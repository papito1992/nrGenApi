package src;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class RandomNumberService {

    private List<Integer> listOfRandomIntegers;

    public int RandomNumberGenerator() {

        Random randomNr = new Random();
        return randomNr.ints(1, (100 + 1)).findFirst().getAsInt();
    }
}
