package utp.edu.pe.ssmmindware.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import jakarta.validation.Valid;
import utp.edu.pe.ssmmindware.Model.Contacto;

@Controller
public class ContactoController {

    @GetMapping("")
    public String showIndex() {
        return "index";
    }


    @GetMapping("/contacto")
    public String showIndex(Contacto contacto, Model model) {
        model.addAttribute("contacto", contacto);
        return "contacto";
    }

    @PostMapping("/contacto")
    public String submitForm(@Valid Contacto contacto, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            model.addAttribute("contacto", contacto);
            return "contacto";
        }
        redirectAttributes.addFlashAttribute("success", true);
        return "redirect:/index.html";
    }
}
