import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
    //  s.addStudent(new Student("Krzysztof", 20));
    //  s.addStudent(new Student("Janusz", 40));
      Service1 metoda = new Service1();
      
      Scanner scanner = new Scanner (System.in);
       System.out.println("Wybierz co chcesz zrobić\n1. Dodać studenta\n2. Wyświetlić listę studentów");
      int opcja = scanner.nextInt();
     
      switch(opcja)
      {
          
        case 1:
        
          scanner.nextLine();
          System.out.println("Wpisz imie");
          String imie = scanner.nextLine();
           System.out.println("Wpisz wiek");
          int wiek = scanner.nextInt();
          System.out.println("Dodano studenta - powrot do menu");
          metoda.addStudent(new Student(imie, wiek));
          break;
          
        case 2:
          var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
        }
          break;
      
      }
      }
      catch (IOException e) {
     
        }

  }
}