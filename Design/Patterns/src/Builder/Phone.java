package Builder;

public class Phone {
    private String OS;
    private String chipset;
    private String memory;

    private Phone(PhoneBuilder builder) {
        this.OS = builder.OS;
        this.chipset = builder.chipset;
        this.memory = builder.memory;
    }

    public String toString() {
        return this.OS + " " + this.chipset + " " + this.memory;
    }

    public static class PhoneBuilder {
        private String OS;
        private String chipset;
        private String memory;

        public PhoneBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public PhoneBuilder setChipset(String chipset) {
            this.chipset = chipset;
            return this;
        }

        public PhoneBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Phone getPhone() {
            return new Phone(this);
        }
    }
}
