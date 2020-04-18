public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        User user = new User(100, "Deat Jiao");
        String filePath = "d:/user.txt";

        try {
            /****序列化******/
            // NativeSerializaTools.write(filePath, user);

            /****反序列化******/
            User user1 = (User)NativeSerializaTools.read(filePath);
            System.out.println(user1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
