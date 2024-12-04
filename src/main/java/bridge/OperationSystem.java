package bridge;

/**
 * 抽象的操作系统类（抽象化角色）
 *
 * @author RJZ
 */
public abstract class OperationSystem {

    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
