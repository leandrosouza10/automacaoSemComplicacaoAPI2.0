package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import maps.FilmesMap;

import utils.RestUtils;

public class FilmesSteps {


    @Dado("que tenha um payload valido da API de Filme")
    public void queTenhaUmPayloadValidoDaAPIDeFilme() {
        FilmesMap.initAll();
    }

    @Quando("envio uma requisicao do tipo POST de Filme")
    public void envioUmaRequisicaoDoTipoPOSTDeFilme() {
        RestUtils.post(FilmesMap.getHeader(), FilmesMap.getFilme(), ContentType.JSON, "filmes");
        
    }

    @Entao("armazeno o id que recebo no response de Filme")
    public void armazenoOIdQueReceboNoResponseDeFilme() {
        FilmesMap.id = RestUtils.getResponse().jsonPath().get("id");
    }

    @Quando("envio uma requisicao do tipo GET de Filme atraves do nome")
    public void envioUmaRequisicaoDoTipoGETDeFilmeAtravesDoNome() {

    }
}
