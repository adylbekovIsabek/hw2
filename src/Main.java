public class Main {
    public static void main(String[] args) {
        System.out.println(temp(37,-5));
        System.out.println(temp(69,32));
        System.out.println(temp(20,28));
        System.out.println(temp(32,39));
        System.out.println(temp(39,-7));
    }
    public static String temp(int age,int temperature){
        String home1="можно идти гулять";
        String home2="оставайтесь дома";
        if (age>=20&&age<=45&&-20<=temperature&&temperature<=30){
            return home1;
        } else if (age<20&&temperature>=0&&temperature<=28) {
            return home1;
        } else if (age>45&&temperature>-10&&temperature<=25) {
            return home1;
        }else {
            return home2;
        }
    }

}
