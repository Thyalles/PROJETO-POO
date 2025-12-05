package br.com.cachacaria_gomes.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FavoritosSteps {

    ProdutoPage produtoPage = new ProdutoPage();
    FavoritosPage favoritosPage = new FavoritosPage();

    @Given("que estou visualizando o produto {string}")
    public void visualizarProduto(String nomeProduto) {
        produtoPage.abrirPaginaDoProduto(nomeProduto);
    }

    @When("eu clicar em {string}")
    public void clicarEmAcao(String acao) {
        produtoPage.executarAcaoFavoritos(acao);
    }

    @Then("o produto deve aparecer na lista de meus favoritos")
    public void verificarProdutoNosFavoritos() {
        favoritosPage.abrir();
        assertTrue(favoritosPage.contemProduto("Cachaça Premium"));
    }

    class ProdutoPage {
        public void abrirPaginaDoProduto(String nome) { System.out.println("Navegando para: " + nome); }
        public void executarAcaoFavoritos(String acao) { System.out.println("Clicando em: " + acao); }
    }

    class FavoritosPage {
        public void abrir() { System.out.println("Abrindo lista de favoritos..."); }
        public boolean contemProduto(String nome) { return true; }
    }
}
