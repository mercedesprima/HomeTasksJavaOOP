package Task2;

public abstract class Animal implements Size, LifeDuration{
    protected String name;

    public Animal(String name) {this.name = name;}
    public abstract String nutrition();
    public abstract String habitat();

    public String toString() {
        return String.format("%s: среда обитания: %s, питание: %s, размер (метр): %s , живут (год): %s ", name, habitat(),
                nutrition(), getSize(), getLifeDuration());
}
}

