package demo1;

public class Test {
    public static void main(String[] args) {
        Student gj = new Student("郭靖",19,"0001");
        Teacher hys = new Teacher();
        hys.setName("黄药师");
        hys.setAge(50);
        hys.setEmployeeNumber("x001");

        gj.display();
        System.out.println(gj.getName() + "的奖励是\"" + gj.reward() + "\"");
        System.out.println(gj.getName() + "的处罚是\"" + gj.punish()  + "\"");
        hys.display();
        System.out.println(hys.getName() + "的奖励是\"" + hys.reward() + "\"");
        System.out.println(hys.getName() + "的处罚是\"" + hys.punish() + "\"");


        int[] arr = {1,6,7,9};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        for (int b:arr){
            System.out.println(b);
        }

    }
}
