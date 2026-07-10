public class Tapsiriq2 {
    public static void main(String[] args) {
        int[] grades = { 50, 45, 88, 75, 90, 55, 60, 65, 95, 92 };
        double avarageGrade = 0;
        for(int i = 0; i < grades.length; i++){
            avarageGrade = avarageGrade + grades[i];
        }
        System.out.println(avarageGrade); //1 ci print

        avarageGrade = avarageGrade / grades.length;

        System.out.println(avarageGrade); //2 ci print

        if (avarageGrade > 70){
            System.out.println("Sinif ugurludur");
        }
        else{
            System.out.println("Elave ishe ehtiyac var");
        }
    }
}
