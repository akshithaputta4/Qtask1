import java.util.*;
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }
    @Override
    public int compareTo(Student other) {
        if (Double.compare(other.cgpa, this.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa);
        }
        if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        }
        return Integer.compare(this.id, other.id);
    }
}
class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        List<Student> remainingStudents = new ArrayList<>();
        for (String event : events) {
            String[] eventDetails = event.split(" ");
            if (eventDetails[0].equals("ENTER")) {
                String name = eventDetails[1];
                double cgpa = Double.parseDouble(eventDetails[2]);
                int id = Integer.parseInt(eventDetails[3]);
                queue.add(new Student(id, name, cgpa));
            } else if (eventDetails[0].equals("SERVED")) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
        }
        while (!queue.isEmpty()) {
            remainingStudents.add(queue.poll());
        }
        return remainingStudents;
    }
}
