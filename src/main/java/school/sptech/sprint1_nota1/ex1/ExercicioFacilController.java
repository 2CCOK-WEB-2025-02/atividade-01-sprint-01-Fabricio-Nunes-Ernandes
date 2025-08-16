package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        palavra = palavra.replaceAll(" ", "").toLowerCase();

        String palavraInvertida = "";
        Integer quantidade = palavra.length();
        for (int i = quantidade - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        for (int i = 0; i < quantidade; i++) {
            if (palavra.charAt(i) != palavraInvertida.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
