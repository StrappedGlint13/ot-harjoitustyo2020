package studyclock.domain;

import java.util.Scanner;
import static javafx.application.Application.launch;
import studyclock.ui.timerUI;

/**
 *
 * @author mazaalto
 */
public class StudyClock {

    public static void main(String[] args) throws InterruptedException {
        Scanner lukija = new Scanner(System.in);
        Timer ajastin = new Timer();

        timerUI ui = new timerUI(lukija, ajastin);
        ui.start();

    }
}
