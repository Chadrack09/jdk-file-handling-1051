package za.ac.cput.fileHandling;

/**
 *
 * @since: 04 Jun 2021
 */
public class MainMethod {
  
  public static void main(String[] args) {
    
    /**
     * @mainMethod
     * @note: Three(3) methods [ readFile(), writeCustomerToFile(), writeSupplierToFile() ]  
     *        must be called in the main method to well implement the application        
     * 
     */
    
    FileHandle fileHandle = new FileHandle();
    fileHandle.readFile();
    fileHandle.writeCustomerToFile();
    fileHandle.writeSupplierToFile();
    
  }
  
}