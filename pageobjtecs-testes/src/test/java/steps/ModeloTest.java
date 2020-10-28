package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.ElementosTest;
import pages.MetodosTest;

public class ModeloTest {

	MetodosTest metodos = new MetodosTest();
	ElementosTest el = new ElementosTest();

	@Given("^acessar o \"([^\"]*)\"$")
	public void acessar_o(String site) throws Throwable {
		metodos.abrirnavegador(site, "CHROME");
	}

	@When("^pesquisar \"([^\"]*)\" teste$")
	public void pesquisar_teste(String text) throws Throwable {
		metodos.preencher(el.getPesquisar(), text);
		metodos.submit(el.getPesquisar());
	}

	@Then("^eu valido \"([^\"]*)\" apos a busca$")
	public void eu_valido_apos_a_busca(String arg1) throws Throwable {
		System.out.println("Teste ok " + arg1);
		metodos.screnShoot("./Evidencias/" + arg1 + ".png");
		metodos.fecharpagina();

	}

}
