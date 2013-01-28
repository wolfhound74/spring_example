package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/jsonexample")
public class JsonController {

    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody HashMap getData(@PathVariable String name) {
        HashMap map = new HashMap();
        map.put("object1", "test");
        map.put("object2", "test");
        map.put("object3", "test");
        return map;
    }
}
