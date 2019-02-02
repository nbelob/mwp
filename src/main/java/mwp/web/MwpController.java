package mwp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class MwpController {
    @RequestMapping(method = GET)
    public String home(Model model) {
        return "form1";
    }
}
