package gadgetShop;

public class MP3 extends Gadget {
    private int availableMemory;

    public MP3(String model, float price, int weight, String size, int availableMemory) {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }

    public void downloadMusic(int downloadSize) {
        if (downloadSize <= availableMemory) {
            availableMemory -= downloadSize;
            System.out.println("Music downloaded successfully.");
        } else {
            System.out.println("Insufficient memory to download the music.");
        }
    }

    public void deleteMusic(int memoryFreed) {
        availableMemory += memoryFreed;
        System.out.println("Music deleted successfully. Available memory is: " +  (availableMemory += memoryFreed));
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Available Memory: " + availableMemory + " MB\n");
    }
}