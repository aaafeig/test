public class Main {
    public static void main(String[] args) {
        var hoursOfWork = 640;
        var hoursOnWork = 8;
        var peopleFirstCompany = hoursOfWork / hoursOnWork;
        var peopleSecondCompany = peopleFirstCompany + 94;
        hoursOfWork = peopleSecondCompany * hoursOnWork;
        System.out.println("Если в компании работает " + peopleSecondCompany + " человек, то всего " + hoursOfWork + " часов работы может быть поделено между сотрудниками");
    }
}