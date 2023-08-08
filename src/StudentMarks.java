import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
    private int math;
    private int physics;

    public StudentMarks(int math, int physics) {
        this.math = math;
        this.physics = physics;
    }

    public int getMath() {
        return math;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "math=" + math +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        // Comparison Logic
        /*
            current Object (this) < other object
                   return -Value
            current Object (this) > other object
                    return +Value
            current Object (this) == other object
                    return 0
         */

//        if(this.math<o.getMath()) return -1;
//        if (this.math > o.getMath()) return 1;
//        if (this.math == o.getMath()) return 0;

//        Below line will give result in Ascending order
//        return this.math - o.math;

//        For Descending Order
        return o.math - this.math;
    }

    /*
    @Override: Indicates that the method is overriding a superclass or interface method.

    public boolean equals(Object o): Start of the overridden equals method that takes
    an Object parameter and returns a boolean.

    if (this == o) return true;: Checks if the object reference is the same. If true,
    both objects are the same, and the method returns true.

    if (!(o instanceof StudentMarks marks)) return false;: Checks if the object o is an
    instance of the StudentMarks class using pattern matching. If it's not an instance, the
    method returns false. If it is an instance, the object o is automatically cast to StudentMarks,
    and a pattern variable marks is introduced.

    return getMath() == marks.getMath() && getPhysics() == marks.getPhysics();: Compares the math
    and physics marks of the current object and marks using their getter methods. If both conditions
    are true, it means the objects are equal, and the method returns true. Otherwise, it returns false.
     */
    @Override
    public boolean equals(Object o) {
        // Check if the object reference is the same
        if (this == o) return true;

        // Check if the object is an instance of StudentMarks using pattern matching
        // and introduce a pattern variable 'marks'
        if (!(o instanceof StudentMarks marks)) return false;

        // Compare the math and physics marks of the current object and 'marks'
        // using getter methods
        return getMath() == marks.getMath() && getPhysics() == marks.getPhysics();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getMath(), getPhysics());
    }
}
