package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ContaTest {

    Cliente batman;
    Cliente mulherGato;
    Conta contaBatman;
    Conta contaMulherGato;


    @BeforeEach
    void setUp() {
        batman = new Cliente("Batman", "123458785458", "12545878");
        mulherGato = new Cliente("Mulher Gato", "2222222222", "123456789");

        contaBatman = new Conta("0024", "2254", 2500.00, batman);
        contaMulherGato = new Conta("0021", "1254587825", 3500.00, mulherGato);

    }

    @Test
    public void realizarTransacao() {
        contaBatman.realizarTransferencia(1000.00, contaMulherGato);
        assertEquals(1500.00, contaBatman.getSaldo());
        assertEquals(4500.00, contaMulherGato.getSaldo());
    }

    @Test
    public void validarTransferenciaInvalida() {
        Boolean resultado = contaBatman.realizarTransferencia(3500.00, contaMulherGato);
        assertFalse(resultado);
    }

    @Test
    public void valdarAgencia() {
        assertEquals("0024", contaBatman.getAgencia());
    }

    @Test
    public void valdarConta() {
        assertEquals("2254", contaBatman.getNumConta());
    }

    @Test
    public void valdarProprietario() {
        assertEquals(contaBatman.getProprietario(),batman);
    }

    @Test
    public void valdarNomeCliente() {
        assertEquals("Mulher Gato", mulherGato.getNome());
    }

    @Test
    public void valdarCpfCliente() {
        assertEquals("2222222222", mulherGato.getCpf());
    }

    @Test
    public void valdarRgCliente() {
        assertEquals("123456789", mulherGato.getRg());
    }


}