package com.example.cars.Model;

public class CarDetails {
    private int imageResource;
    private String carModel;
    private String modelDescription;

    public CarDetails() {
    }

    public CarDetails(int imageResource, String carModel, String modelDescription) {
        this.imageResource = imageResource;
        this.carModel = carModel;
        this.modelDescription = modelDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }
}
