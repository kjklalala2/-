package Sort;

import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class selectSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        List<Student> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String name = input.next();
            int score = input.nextInt();
            list.add(new Student(name,score));
        }

        Collections.sort(list);

        for(int i=0; i<n; i++){
            System.out.print(list.get(i).getName()+" ");
        }

    }
}