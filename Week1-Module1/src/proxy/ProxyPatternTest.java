package proxy;

public class ProxyPatternTest {
	 public static void main(String[] args) {
	        // Create a proxy image for each image
	        Image image1 = new ProxyImage("image1.jpg");
	        Image image2 = new ProxyImage("image2.jpg");

	        // The images are displayed; lazy loading will be shown
	        image1.display();
	        image1.display(); // This should not trigger loading again due to caching

	        image2.display();
	        image2.display(); // This should not trigger loading again due to caching
	    }

}