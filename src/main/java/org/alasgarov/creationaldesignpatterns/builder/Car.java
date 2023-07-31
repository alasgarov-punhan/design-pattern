package org.alasgarov.creationaldesignpatterns.builder;

public class Car {
    //required
    private String brand;
    private String model;
    private Integer year;
    //optional
    private String color;
    private String type;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.type = builder.type;
    }

    //Builder Class
    public static class Builder{
        //required
        private String brand;
        private String model;
        private Integer year;
        //optional
        private String color;
        private String type;

        public Builder(String brand, String model, Integer year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }


        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setType(String type){
            this.type = type;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
