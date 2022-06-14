package dummy_test;

import java.util.Objects;

public class Employee implements Comparable {

    public String name;
    public String age;

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        return this.name.compareTo(e.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
