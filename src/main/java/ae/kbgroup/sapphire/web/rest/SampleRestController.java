package ae.kbgroup.sapphire.web.rest;

import ae.kbgroup.sapphire.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by karthikeyan.mani on 3/24/2017.
 */
@RestController
@RequestMapping("/test")
public class SampleRestController {

    @RequestMapping("/testService")
    public String testService(){
        return "Test Service Successful";
    }

    @RequestMapping(value="/testJson",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer testJson(){
        return new Customer("Karthik","TEST",1L);
    }
}
