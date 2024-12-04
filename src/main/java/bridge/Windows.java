package bridge;

/**
 * windows操作系统（扩展抽象化角色）
 *
 * @author RJZ
 */
public class Windows extends OperationSystem {


    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
