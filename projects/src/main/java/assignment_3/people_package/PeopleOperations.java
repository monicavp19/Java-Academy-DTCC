package src.main.java.assignment_3.people_package;


import java.util.*;

import assignment_3.people_package.Person;


public class PeopleOperations {
    public static void main (String args []) throws Exception {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */


        ArrayList<Person> peoplesCollection = new ArrayList<Person>();
        Random r=new Random();
        for(int i=0; i<=10; i++){
            int randomId = r.nextInt(1000);
            int randomAge= r.nextInt(99);

            Person M= new Person();
            M.setName("A-"+i);
            M.setAge(randomAge);
            M.setId(randomId);
            System.out.println("value "+ M.toString());
            peoplesCollection.add(M);
        }
        Person youngestPerson = getYoungestPerson(peoplesCollection);
        Person oldestPerson = getOldestPerson(peoplesCollection);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(peoplesCollection);
        ArrayList<Person> sortedByNameList = getSortedListByName(peoplesCollection, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        for(Person p : sortedByNameList) {
            System.out.println(p);
        }
    }

    public static Person getYoungestPerson(ArrayList<Person> list) throws Exception {
        return Collections.min(list, getAgeComparator());

        //throw new Exception("Please implement this method");
    }

    public static Person getOldestPerson(ArrayList<Person> list) throws Exception {
        return Collections.max(list, getAgeComparator());
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list) throws Exception{
      Collections.sort(list, getAgeComparator());
      return list;
    }

    private static Comparator<Person> getAgeComparator() {
        return new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws Exception {
         Collections.sort(list);
         return list;
    }


}
