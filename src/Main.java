import Controller.ContactController;
import View.ContactView;

public class Main {
    public static void main(String[] args) {
        ContactView view = new ContactView();
        ContactController controller = new ContactController(view);
        controller.start();
    }
}
