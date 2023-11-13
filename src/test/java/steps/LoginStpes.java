package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStpes {
    @Dado("que tenha um payload valido da API de Login")
    public void queTenhaUmPayloadValidoDaAPIDeLogin() {
    }

    @Quando("envio uma requisição do tipo POST de Login")
    public void envioUmaRequisicaoDoTipoPOSTDeLogin() {
    }

    @Entao("valido que recebo status {int} no response")
    public void validoQueReceboStatusNoResponse(int arg0) {
    }

    @E("armazeno o token que recebo no response de Login")
    public void armazenoOTokenQueReceboNoResponseDeLogin() {
    }

    @Dado("que tenha um payload da API de Login com as seguintes imformações")
    public void queTenhaUmPayloadDaAPIDeLoginComAsSeguintesImformacoes() {
    }
}
