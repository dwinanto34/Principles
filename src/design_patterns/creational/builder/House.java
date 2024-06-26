package design_patterns.creational.builder;

public class House {
    // Required parameters
    private String walls;
    private String roof;

    // Optional parameters
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", roof=" + roof + ", rooms=" + rooms +
                ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden + "]";
    }

    // Builder class
    public static class HouseBuilder {
        // Required parameters
        private String walls;
        private String roof;

        // Optional parameters
        private int rooms;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder(String walls, String roof) {
            this.walls = walls;
            this.roof = roof;
        }

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
