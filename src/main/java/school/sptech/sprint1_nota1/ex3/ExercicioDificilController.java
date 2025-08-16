package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {


        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);

        } else {

            int anterior1 = 1;
            int anterior2 = 1;
            int total = 0;
            int enesimo = 0;
            for (int i = 1; i <= n; i++) {

                enesimo = anterior1;
                total += enesimo;

                int atual = anterior1 + anterior2;
                anterior1 = anterior2;
                anterior2 = atual;
            }

            return new ExercicioDificilResponse(enesimo, total);
        }
} }
