package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import maps.LoginMap;
import utils.RestUtils;

import java.util.Map;

public class LoginStpes {


    @Dado("que tenha um payload valido da API de Login")
    public void queTenhaUmPayloadValidoDaAPIDeLogin() {
        LoginMap.initLogin();

    }

    @Quando("envio uma requisicao do tipo POST de Login")
    public void envioUmaRequisicaoDoTipoPOSTDeLogin() {
        RestUtils.post(LoginMap.getLogin(), ContentType.JSON,"auth");
    }

    @E("armazeno o token que recebo no response de Login")
    public void armazenoOTokenQueReceboNoResponseDeLogin() {
        LoginMap.token = RestUtils.getResponse().jsonPath().get("token");
    }


    @Dado("que tenha um payload da API de Login com as seguintes imformações")
    public void queTenhaUmPayloadDaAPIDeLoginComAsSeguintesImformacoes(Map<String, String>map) {
        LoginMap.initLogin();
        LoginMap.getLogin().putAll(map);
    }

    @Dado("que tenha realizado o login com dados validos")
    public void queTenhaRealizadoOLoginComDadosValidos() {
        queTenhaUmPayloadValidoDaAPIDeLogin();
        envioUmaRequisicaoDoTipoPOSTDeLogin();
        armazenoOTokenQueReceboNoResponseDeLogin();

    }
}

