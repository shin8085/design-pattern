package bridge;

/**
 * mac操作系统（扩展抽象化角色）
 *
 * @author RJZ
 */
public class Mac extends OperationSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
