package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {

	@FXML
	void OnClickCadastrar(ActionEvent event) throws IOException {
		AlterarTelaController.mudarTela(event, "/view/TelaCadastro.fxml", "Tela de Cadastro");
	}

	@FXML
	void OnClickEntrar(ActionEvent event) throws IOException {
		AlterarTelaController.mudarTela(event, "/view/TelaLogin.fxml", "Tela Login");
	}

}