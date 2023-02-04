class Person {
    private int age;
    private String name;
    private int cmHeight;

    public Person(){
        this(20, "John Doe", 171);
    }

    public Person(int ageParam, String nameParam){
        age = ageParam;
        name = nameParam;

    }

    public Person(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
    }

    public void objectMethods (Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }






}