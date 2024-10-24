package As6;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new RegularUser(chatRoom, "Damir");
        User user2 = new RegularUser(chatRoom, "Adil");
        User user3 = new PremiumUser(chatRoom, "Ershuaq");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("I love Albeni!");
        user2.sendMessage("Hi, Im addicted with gf!");
        user3.sendMessage("Let's go eat!");
    }
}

