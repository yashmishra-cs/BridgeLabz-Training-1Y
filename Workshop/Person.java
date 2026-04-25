class Person (
int x=10;
person () {
system.out.println("Perso constructor Called");
void show() {
system.out.println("Person Method Called");
}}
class Employee extends Person(
int x =20;
Employee () {
super():
system.out.println("Parent variable x="+super,x);
super.show();
system.out.println("Employee Constructor Called");
}
public static void main (String[] args) {
Employee new Employee();
}
}
