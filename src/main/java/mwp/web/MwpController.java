package mwp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
//@RequestMapping("/")
public class MwpController {

    @RequestMapping(value = "/", method = GET)
    public String home(/*Model model*/) {
        return "form1";
    }

    @RequestMapping(value = "/", method = POST, params = "ok")
    public String showForm2() {
        return "redirect:/2";
    }

    @RequestMapping(value = "/2", method = GET)
    public String form2() {
        return "form2";
    }

    @RequestMapping(value = "/2", method = POST, params = "ok")
    public String form2Ok() {
        return "form2";
    }

    @RequestMapping(value = "/2", method = POST, params = "cancel")
    public String form2Cancel() {
        return "redirect:/";
    }
}
