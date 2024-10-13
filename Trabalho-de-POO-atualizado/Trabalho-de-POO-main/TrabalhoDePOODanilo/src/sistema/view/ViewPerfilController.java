package sistema.view;

import sistema.model.Model;

public class ViewPerfilController {
    Model model;
    ViewPerfil view;

    public ViewPerfilController(Model model, ViewPerfil view) {
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso){
        switch (caso){
            case 1: view.goLogin();
            case 2: view.goMenu(view.getEmail());
            case 3: model.setEmail(view.getEmail());
            case 4: model.setSenha(view.getEmail(),view.getSenha());
            case 5: model.setNome(view.getEmail(), view.getNome());
            case 6: model.setTelefone(view.getEmail(),view.getTelefone());
            case 7:model.setCep(view.getEmail(), view.getCep());
            

        }
    }



}