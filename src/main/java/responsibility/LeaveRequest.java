package responsibility;

/**
 * 请假条
 *
 * @author RJZ
 */
public class LeaveRequest {

    /**
     * 姓名
     */
    private final String name;
    /**
     * 天数
     */
    private final Integer num;
    /**
     * 内容
     */
    private final String content;

    public LeaveRequest(String name, Integer num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
