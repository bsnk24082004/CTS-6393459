
package proxy;

//ProxyImage.java
public class ProxyImage implements Image {
 private String fileName;
 private RealImage realImage;

 public ProxyImage(String fileName) {
     this.fileName = fileName;
 }

 @Override
 public void display() {
     // Lazy initialization: load the real image only when it's needed
     if (realImage == null) {
         realImage = new RealImage(fileName);
     }
     // Cache the image after it's loaded
     realImage.display();
 }
}
