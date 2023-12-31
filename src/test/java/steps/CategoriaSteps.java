package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import maps.LoginMap;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class CategoriaSteps {
    Map<String, String> header = new HashMap<>();

    @E("que tenha um payload da API de categoria")
    public void queTenhaUmPayloadDaAPIDeCategoria() {
        header.put("Authorization", "Bearer " + LoginMap.token);
    }

    @Quando("realizar uma requisicao do tipo GET de Categoria")
    public void realizarUmaRequisicaoDoTipoGETDeCategoria() {
        RestUtils.get(header, "categorias");

    }

    @Dado("que altero o campo {string} para {string} do header de categoria")
    public void queAlteroOCampoParaDoHeaderDeCategoria(String key, String value) {
        header.put(key,value);
    }
}
