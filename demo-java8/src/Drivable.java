// Annotation -> compiler will help verify if this interface contain one method only
// if there is more than one method, Lambda expression is not allowed
@FunctionalInterface
public interface Drivable {
  boolean drive(int x);

}

