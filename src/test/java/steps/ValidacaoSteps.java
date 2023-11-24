package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import utils.RestUtils;

import java.util.ArrayList;

public class ValidacaoSteps {

    @Entao("validar que recebo status {int} no response")
    public void validarQueReceboStatusNoResponse(int status) {
        Assert.assertEquals(status, RestUtils.getResponse().getStatusCode());
    }

    @E("validar que no campo {string} possui o valor {string}")
    public void validarQueNoCampoPossuiOValor(String key, String value) {
        Assert.assertEquals(value,RestUtils.getResponse().jsonPath().get(key));
    }

    @E("validar se a lista esta vazia no response")
    public void validarSeAListaEstaVaziaNoResponse() {
    Assert.assertEquals(new ArrayList<>(0),RestUtils.getResponse().jsonPath().get());
    }

}
