package Builder;

public class Computer {

    // Required attributes
    private String CPU;
    private String RAM;

    // Optional attributes
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor accepts Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Getters
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getOperatingSystem() { return operatingSystem; }

    // For displaying configuration
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
               ", GraphicsCard=" + graphicsCard + ", OS=" + operatingSystem + "]";
    }

    // 🔧 Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        // Required parameters constructor
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String os) {
            this.operatingSystem = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

