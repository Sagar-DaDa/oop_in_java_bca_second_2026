public class ObserverDemo {

    public static void main(String[] args) {

        YouTubeChannel channel =
            new YouTubeChannel();

        User user1 = new User("Sorab");
        User user2 = new User("Nikesh");
        User user3 = new User("Shristi");
        User user4 = new User("Prakritee");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);
        channel.subscribe(user4);

        channel.uploadVideo("Java OOP Tutorial");
    }
}
