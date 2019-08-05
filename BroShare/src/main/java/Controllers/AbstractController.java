package Controllers;

import org.academiadecodigo.bootcamp.InputScanner;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class AbstractController {

    private Prompt prompt;
    private InputScanner inputScanner;


    public String showPrompt(){

        prompt = new Prompt(System.in,System.out);

        StringInputScanner input = new StringInputScanner();

        String answer = prompt.getUserInput(input);

        return answer;
    }

}
