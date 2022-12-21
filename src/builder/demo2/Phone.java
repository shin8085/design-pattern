package builder.demo2;

/**
 * @author RJZ
 */
public class Phone {
    private String cpu;
    private String memory;
    private String screen;

    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public static final class Builder{
        private String cpu;
        private String memory;
        private String screen;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
