package org.example.BuilderDesignPattern;

public class Dog {
    private   String gender;
    private String breed;
    private double price;
    private String color;
    public Dog(DogBuilder dogBuilder)
    {
        this.gender=dogBuilder.gender;
        this.breed=dogBuilder.breed;
        this.price=dogBuilder.price;
    }

    static  class DogBuilder
    {
        private   String gender;
        private String breed;
        private double price;
        private String color;

        public DogBuilder Gender(String gender) {
            this.gender = gender;
            return this;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return  this;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public DogBuilder setColor(String color) {
            this.color = color;
            return this;
        }
         Dog build()
         {
            return new Dog(this);
         }

    }


    @Override
    public String toString() {
        return "Dog{" +
                "gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
