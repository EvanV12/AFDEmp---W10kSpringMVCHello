package cb.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class FirstSpringMVCController {
    
    @RequestMapping(value = "welcome")
    public ModelAndView helloWorld() {
        
        String message="<br><div style='text-align:center;'>"
                + "<h3>******** Hello World, Spring MVC Tutorial *******</h3></div>";
        return new ModelAndView("welcome", "message", message);
    }
    
    
 
}