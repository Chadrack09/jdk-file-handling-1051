package za.ac.cput.fileHandling;

import java.io.Serializable;

/**
 *
 * @since: 04 Jun 2021
 */
public class Stakeholder implements Serializable {
    private String stHolderId;

    public Stakeholder() {
    }
    
    public Stakeholder(String stHolderId) {
        this.stHolderId = stHolderId;
    }
    
    public String getStHolderId() {
        return stHolderId;
    }
    public void setStHolderId(String stHolderId) {
        this.stHolderId = stHolderId;
    }

    @Override
    public String toString() {
       return stHolderId;
    }
}