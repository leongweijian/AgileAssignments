/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.io.ObjectOutputStream;

/**
 *
 * @author ThisPc
 */
public class JobQueue implements java.io.Serializable{
    private String id;
    private String style;
    private String size;
    private String flower;
    private String accessory;
    private String priority;

    public JobQueue(String id, String style, String size, String flower, String accessory, String priority) {
        this.id = id;
        this.style = style;
        this.size = size;
        this.flower = flower;
        this.accessory = accessory;
        this.priority = priority;
        
        
    }

    public JobQueue() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
}
