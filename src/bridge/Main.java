package bridge;

/**
 * 桥接模式
 *
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        Windows windows = new Windows(new MP4File());
        windows.play("video.mp4");

        Mac mac = new Mac(new AVIFile());
        mac.play("video.avi");
    }
}
