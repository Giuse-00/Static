package it.develhope.static1;

public class Tester {

    public static void main(String[] args) {

        Employee first = new Employee("Giuse", "Iacono", "Via Moro");

        Badge firstBadge = new Badge(first);

        firstBadge.showBadgeDetails();

        Employee second = new Employee("Gigi", "Rossi", "Via Verdi");

        Badge secondBadge = new Badge(second);

        secondBadge.showBadgeDetails();
    }
}
