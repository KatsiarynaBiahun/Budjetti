package com.mycompany.budjetti;


import javax.swing.ImageIcon;

public class Image {
    
  
    
    public Image(){
        
    }
/**
     * Loads an image from the disk and returns it as an ImageIcon
     *
     * @param filename name of the image file
     * @return the image file packaged as an ImageIcon
     */
    public ImageIcon loadIcon(String filename) {
        try {
            return new ImageIcon(getClass().getResource(filename));           
        } catch (Exception e) {
            return new ImageIcon();
        }
    }
}