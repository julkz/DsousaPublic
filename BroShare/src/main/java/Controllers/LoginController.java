package Controllers;

import org.academiadecodigo.bootcamp.Prompt;

public class LoginController extends AbstractController implements Controller{

    private Controller controller;
    private Prompt prompt;




    public void startLogin(){
            showPrompt();
    }

    public Controller nextController() {
        return null;
    }
}
