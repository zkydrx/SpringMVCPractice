package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-15
 * Time: 02:28
 * Description:
 */
@Controller
public class GreetingController
{
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name",required = false,defaultValue = "World")String name, Model model)
    {
        model.addAttribute("name",name);
        return "greeting";
    }
}
