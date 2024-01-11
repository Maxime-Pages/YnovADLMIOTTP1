public class Sag extends ArbreBinaire {

    public Sag(boolean empty, boolean leaf) {
        super(empty, leaf);
        //TODO Auto-generated constructor stub
    }

    public String getSag(String message) {
        if (isEmpty()) {
            message = "Arbre inexistant";
        } else {
            message = "Arbre existant";
        }
        return message;
    }
}
