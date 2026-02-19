public class Practice {
    public static void main(String[] args) {
        Human Ayush = new Human(24, "male", "Indian");
        System.out.println(Ayush.age);

    }


    static class Human {
        int age;
        String gender;
        String nationality;


        public Human(int age, String gender, String nationality) {
            this.age = age;
            this.gender = gender;
            this.nationality = nationality;
        }
    }


}
