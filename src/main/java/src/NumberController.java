package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NumberController {

    @Autowired
    RandomNumberService randomNumberService;

    @RequestMapping("/random_number")
    public int numberGenerator() {
        return randomNumberService.RandomNumberGenerator();
    }

    @RequestMapping("/random_number_list")
    public int[] numberListGenerator() {
        return randomNumberService.RandomNumberArrayGenerator();
    }
    @RequestMapping("/random_number_list2")
    public List<Long> numberListGenerator2() {
        return randomNumberService.RandomNumberList2Generator();
    }
}