package builder.demo2;

/**
 * @author RJZ
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = Phone.newBuilder()
                .cpu("cpu")
                .memory("memory")
                .screen("screen")
                .build();
        System.out.println(phone);

    }
}
