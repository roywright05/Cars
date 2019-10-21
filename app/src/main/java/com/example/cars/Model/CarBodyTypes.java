package com.example.cars.Model;

public class CarBodyTypes {

    private int smallImage;
    private String carBodyType;
    private String carCategory;

    public CarBodyTypes() {

    }

    public CarBodyTypes(int smallImage, String carBodyType, String carCategory) {
        this.smallImage = smallImage;
        this.carBodyType = carBodyType;
        this.carCategory = carCategory;
    }

    public void changeText1(String text){

        carBodyType = text;
    }

    public int getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(int smallImage) {
        this.smallImage = smallImage;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }
}
