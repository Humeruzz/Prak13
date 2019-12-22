import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //var1();
        //var2();
        //var3();
        var5();
    }

    public static void var1(){
        Date date = new Date();
        System.out.println("Semenikhin A.O. Fri Dec 11 15:43:00 MSK 2019");
        System.out.println("Дата сдачи задания: "+date);
    }

    public static void var2(){
        Calendar date = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        System.out.println(date.getTime());
        String input = in.nextLine();
        if (date.getTime().toString() == input){
            System.out.println("Correct date");
        } else {
            System.out.println("Wrong date");
            System.out.println(input);
            System.out.println(date.getTime().toString());
        }
    }

    public static void var3(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату(дата месяц год час мин): ");
        String date = in.nextLine();
        String[] temp = date.split(" ");
        String strDate = temp[0] + "." + temp[1] + "." + temp[2] + " " + temp[3] + ":" + temp[4];
        SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        try {
            Date date1 = form.parse(strDate);
            Calendar calendar = new GregorianCalendar(Integer.parseInt(temp[2]), Integer.parseInt(temp[1])-1 , Integer.parseInt(temp[0]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]));
            System.out.println("Date: " + form.format(date1.getTime()));
            System.out.println("Calendar: " + form.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void var5(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long linkedListTime;
        long arrayListTime;
        for (int i = 0; i < 100000; i++) {
            arrayList.add((int)(Math.random()*9)+1);
            linkedList.add((int)(Math.random()*9)+1);
        }

        //LinkedListTime
        Date start = new Date();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        Date  finish = new Date();
        linkedListTime = finish.getTime() - start.getTime();
        //ArrayListTime
        start = new Date();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        finish = new Date();
        arrayListTime = finish.getTime() - start.getTime();

        System.out.println("Операция обращение по индексу\n" + "ArrayList: " + arrayListTime + "\nLinkedList: " + linkedListTime);


        //LinkedListTime
        start = new Date();
        for (int i = 25000; i < 75000; i++) {
            linkedList.add(i, (int)(Math.random()*9)+1);
        }
        finish = new Date();
        linkedListTime = finish.getTime() - start.getTime();
        //ArrayListTime
        start = new Date();
        for (int i = 25000; i < 75000; i++) {
            arrayList.add(i, (int)(Math.random()*9)+1);
        }
        finish = new Date();
        arrayListTime = finish.getTime() - start.getTime();

        System.out.println("Операция вставки в середину массива\n" + "ArrayList: " + arrayListTime + "\nLinkedList: " + linkedListTime);


        //LinkedListTime
        start = new Date();
        for (int i = 25000; i < 75000; i++) {
            linkedList.remove(i);
        }
        finish = new Date();
        linkedListTime = finish.getTime() - start.getTime();
        //ArrayListTime
        start = new Date();
        for (int i = 25000; i < 75000; i++) {
            arrayList.remove(i);
        }
        finish = new Date();
        arrayListTime = finish.getTime() - start.getTime();

        System.out.println("Операция удаления элемента из середины массива\n" + "ArrayList: " + arrayListTime + "\nLinkedList: " + linkedListTime);


        //LinkedListTime
        start = new Date();
        for (int i = 0; i < 5000; i++) {
            linkedList.indexOf(i);
        }
        finish = new Date();
        linkedListTime = finish.getTime() - start.getTime();
        //ArrayListTime
        start = new Date();
        for (int i = 0; i < 5000; i++) {
            arrayList.indexOf(i);
        }
        finish = new Date();
        arrayListTime = finish.getTime() - start.getTime();


        System.out.println("Операция поиска элемента по индексу\n" + "ArrayList: " + arrayListTime + "\nLinkedList: " + linkedListTime);
    }
}
