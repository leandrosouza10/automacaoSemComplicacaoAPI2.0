package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import maps.FilmesMap;

import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class FilmesSteps {


    @Dado("que tenha um payload valido da API de Filme")
    public void queTenhaUmPayloadValidoDaAPIDeFilme() {
        FilmesMap.initAll();
    }

    @Quando("enviar uma requisicao do tipo POST de Filme")
    public void enviarUmaRequisicaoDoTipoPOSTDeFilme() {
        RestUtils.post(FilmesMap.getHeader(), FilmesMap.getFilme(), ContentType.JSON, "filmes");
        
    }

    @Entao("armazenar o id que recebo no response de Filme")
    public void armazenarOIdQueReceboNoResponseDeFilme() {
        FilmesMap.id = RestUtils.getResponse().jsonPath().get("id");
    }

    @Quando("enviar uma requisicao do tipo GET de Filme atraves do nome")
    public void enviarUmaRequisicaoDoTipoGETDeFilmeAtravesDoNome() {
        Map<String, Object> param = new HashMap<>();
        String nome = FilmesMap.getFilme().get("nome").toString();
        param.put("nome",nome);
        RestUtils.get(FilmesMap.getHeader(),param,"filmes");

    }

    @E("alterar o tipo {int} da lista de categoria de filmes com os valores")
    public void alterarOTipoDaListaDeCategoriaDeFilmesComOsValores(int indice, Map<String, String>map) {
        FilmesMap.getListCategoria().get(indice).putAll(map);
        RestUtils.put(FilmesMap.getHeader(),FilmesMap.getFilme(),ContentType.JSON,"filmes/" + FilmesMap.id);

    }

    @Quando("realizar uma requisicao do tipo PUT de Filme")
    public void realizarUmaRequisicaoDoTipoPUTDeFilme() {
    }
}
