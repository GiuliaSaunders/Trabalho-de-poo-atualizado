package sistema.view;

import sistema.model.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewMenuController {
	private ViewMenu view;
	private Model model;
	
	public void initViewMenuController(Model model, ViewMenu view) {
		//this.model = model;
		this.view = view;
	}
	
	public void interacao(int caso) throws IOException {
		switch (caso) {
			 case 1:
				 Map<String, String> eventos = new HashMap<>();
				 eventos = model.mostrarEventos();
				for (Map.Entry<String, String> evento : eventos.entrySet()) {
					System.out.println(evento.getValue());
				view.menu();
				}
				break;
			case 2: view.goPerfil();break;
			case 3: view.goCriarEvento(); break;
			case 4: view.goEvento(view.getEvento()); break;
			case 5: view.goLogin(model); break;
			case 6: view.menu(); break;
			case 7:
				view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
				System.in.read();
				view.menu();
				break;

		}
	}
}
