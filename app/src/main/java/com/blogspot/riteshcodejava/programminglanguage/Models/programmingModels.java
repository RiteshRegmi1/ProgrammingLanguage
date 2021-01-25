package com.blogspot.riteshcodejava.programminglanguage.Models;

public class programmingModels {
    int imageId;
    String programmingTitle;

    public programmingModels(int imageId, String programmingTitle) {
        this.imageId = imageId;
        this.programmingTitle = programmingTitle;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getProgrammingTitle() {
        return programmingTitle;
    }

    public void setProgrammingTitle(String programmingTitle) {
        this.programmingTitle = programmingTitle;
    }
}
