package pl.michalchmiel.generatorLotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.michalchmiel.generatorLotto.model.Lotto;

@Controller
public class HomeController {

    @GetMapping("/lotto")
    public String generateLotto(ModelMap modelMap){
        Lotto lotto = new Lotto();
        modelMap.put("lotto", lotto.generateLotto());
        return "lotto";
    }
}
