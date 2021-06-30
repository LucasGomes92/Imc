package br.com.imc.resource;

import br.com.imc.utils.Imc;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/imc")
public class ImcResource {
    @CrossOrigin

    @PostMapping("/calcular")

    public String calcular(@RequestBody(required = true) ImcResourceInput input) {
        Imc imc = new Imc();
        imc.setPeso(input.getPeso());
        imc.setAltura(input.getAltura());
        imc.setSexo(input.getSexo());
        String resultado = imc.calcularImc();

        return resultado;
    }


}
