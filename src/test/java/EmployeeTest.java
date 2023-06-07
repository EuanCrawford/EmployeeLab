import Main.Employee;
import Main.management.Director;
import Main.management.Manager;
import Main.techStaff.DatabaseAdmin;
import Main.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;
    Manager manager;
    Developer developer;
    DatabaseAdmin databaseAdmin;
    Director director;

    @Before
    public void before(){
        manager = new Manager("Euan",29393,27000.00,"IT");
        developer = new Developer("Andy",14566, 30000.00);
        databaseAdmin = new DatabaseAdmin("Tom", 36718, 29000.00);
        director = new Director("Ross",7482,100000.00,"Upper Management",1000000);

    }

    @Test
    public void canRaiseSalary(){
        assertEquals(30000.00, manager.raiseSalary(3000.00),0.0);
    }

    @Test
    public void canGiveBonus(){
        assertEquals(270.00,manager.payBonus(),0.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Andy", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(14566, developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetAdminName() {
        assertEquals("Tom", databaseAdmin.getName());
    }

    @Test
    public void canGetAdminNINumber() {
        assertEquals(36718, databaseAdmin.getNINumber());
    }

    @Test
    public void canGetAdminSalary() {
        assertEquals(29000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetDirectorName(){
        assertEquals("Ross",director.getName());
    }

    @Test
    public void canGetDirectorNINumber(){
        assertEquals(7482,director.getNINumber());
    }

    @Test
    public void canGetDirectorSalary(){
        assertEquals(100000.00,director.getSalary(),0.0);
    }

    @Test
    public void canGetDirectorBudget(){
        assertEquals(1000000.00,director.getBudget(),0.0);
    }

    @Test
    public void cantRaiseSalary() {
        assertEquals(30000.00, developer.raiseSalary(-1000.00), 0.0);
    }

    @Test
    public void canSetName(){
        developer.setName("Gregor");
        assertEquals("Gregor", developer.getName());
    }

    @Test
    public void cantSetName(){
        developer.setName(null);
        assertEquals("Andy",developer.getName());
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000.00, director.payBonus(), 0.0);
    }
}
