package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class test {

    //   private static List<object> dataBase  = new ArrayList<>();
//   private static void storingData(person a) {
//     dataBase.add(a);
//   }
//   private void addPerson(person a) {
//     storingData(a);
//     //System.out.println(dataBase);
//  }


    public static Comparator<persontest> firstNameComparator = new Comparator<persontest>() {

        public int compare(persontest n1, persontest n2) {
            String firstName1 = n1.getFirstName().toUpperCase();
            String firstName2 = n2.getFirstName().toUpperCase();

            //ascending order
            return firstName1.compareTo(firstName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};

    private static Comparator<persontest> persontestZipComparator = new Comparator<persontest>() {

        public int compare(persontest n1, persontest n2) {

            int zip1 = n1.getZip();
            int zip2 = n2.getZip();

            /*For ascending order*/
            return zip1 - zip2;

            /*For descending order*/
            //zip2-zip1;
        }
    };

    public static void main(String[] args) {
        List<persontest> listoflist  = new ArrayList<>();
        persontest n1 = new persontest("Laura", "Wayne", "Birmingham", "Alabama", 2200033, 9087456321L);
        persontest n2 = new persontest("Smith", "Head", "Woodstockm", "Texas", 1100022, 1112224567L);
        persontest n3 = new persontest("Amy", "Wright", "Montreal", "Canada", 3300044, 222333456L);
        persontest n4 = new persontest("a", "ar", "asd", "wfhe",8, 908);
        persontest n5 = new persontest("b", "ar", "asd", "wfhe",3, 908);
        persontest n6 = new persontest("c", "ar", "asd", "wfhe",10, 908);
        persontest n7 = new persontest("d", "ar", "asd", "wfhe",4, 908);
        persontest n8 = new persontest("e", "ar", "asd", "wfhe",17, 908);
        persontest n9 = new persontest("f", "ar", "asd", "wfhe",89, 908);
        persontest n10 = new persontest("g", "ar", "asd", "wfhe",2, 908);


        //{ 2, 1, 3} ( 8, 3, 10, 4,  17, 89, 2)

        listoflist.add(n1);
        listoflist.add(n2);
        listoflist.add(n3);
        listoflist.add(n4);
        listoflist.add(n5);
        listoflist.add(n6);
        listoflist.add(n7);
        listoflist.add(n8);
        listoflist.add(n9);
        listoflist.add(n10);


        //System.out.println(listoflist);

        long phoneNumber = 1112224567;

        for (persontest temp1 : listoflist ) {
            if (temp1.getPhoneNumber() == phoneNumber) {
                System.out.println(temp1);
                //listoflist.remove(temp1);
                //System.out.println(listoflist);
                //System.out.println("Person with Phone Number "+phoneNumber+" is deleted");
            }
        }



//        System.out.println("ZipNum Sorting:");
//        Collections.sort(listoflist, persontestZipComparator);
//        for(persontest str: listoflist){
//            System.out.println(str);
//        }

        System.out.println("First Name Sorting:");
        Collections.sort(listoflist, firstNameComparator);

        for(persontest z: listoflist){
            System.out.println(z);
        }
    }
}

