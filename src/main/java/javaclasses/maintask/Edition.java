package javaclasses.maintask;

import java.util.StringJoiner;

public class Edition {
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private BindingType bindingType;

    public Edition() {
    }

    public Edition(String publishingHouse, int yearOfPublishing, int numberOfPages, double price, BindingType bindingType) {
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Edition.class.getSimpleName() + "[", "]")
                .add("publishingHouse='" + publishingHouse + "'")
                .add("yearOfPublishing=" + yearOfPublishing)
                .add("numberOfPages=" + numberOfPages)
                .add("price=" + price)
                .add("bindingType=" + bindingType)
                .toString();
    }
}
