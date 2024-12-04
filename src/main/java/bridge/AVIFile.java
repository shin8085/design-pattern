package bridge;

/**
 * AVI视频文件（具体的实现化角色）
 *
 * @author RJZ
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI 视频文件：" + fileName);
    }
}
