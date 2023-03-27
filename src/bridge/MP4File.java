package bridge;

/**
 * MP4视频文件（具体的实现化角色）
 *
 * @author RJZ
 */
public class MP4File implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("MP4 视频文件：" + fileName);
    }
}
