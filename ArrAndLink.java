package ArraysMetod;

import java.util.*;



public class ArrAndLink {


    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            arrayList.add(i);
            linkedList.add(i);
            int index = random.nextInt(arrayList.size());
            int index1 = random.nextInt(linkedList.size());
           // System.out.print(index + " ");
            //System.out.println();
           /// System.out.print(index1 + " ");

       /*     int sum =0;
            while (i<1000){
                sum =i*1000;
               i++;
             System.out.println();
             System.out.print(sum);

            }*/

        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
           arrayList.get(i);
        long end = System.currentTimeMillis();
           System.out.println("Время " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < linkedList.size(); i++)
                linkedList.get(i);
            end = System.currentTimeMillis();
                System.out.print("Время " + (end - start));



          }


        }



