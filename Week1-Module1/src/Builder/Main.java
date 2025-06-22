package Builder;

public class Main {
	public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();

        // Gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        // Workstation computer
        Computer workstation = new Computer.Builder("AMD Ryzen 9", "64GB")
                .setStorage("2TB NVMe SSD")
                .setOperatingSystem("Ubuntu Linux")
                .build();

        // Print configurations
        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Workstation: " + workstation);
	}
}
