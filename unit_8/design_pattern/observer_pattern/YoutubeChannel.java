import java.util.ArrayList;

class YouTubeChannel {

    private ArrayList<ObserverInterface> subscribers =
        new ArrayList<>();

    public void subscribe(ObserverInterface observer) {
        subscribers.add(observer);
    }

    public void uploadVideo(String title) {

        System.out.println("New video: " + title);

        for (ObserverInterface observer : subscribers) {
            observer.update(title);
        }
    }
}
