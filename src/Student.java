public class Student {
    private String name;
    private int[] grades;
    // FIX_ME: нет необходимости в gpa, когда есть метод
    //private double gpa;

//    public Student(String name, int[] grades) {
//
//        /*
//        this.name = name;
//        */
//
//        // FIX_ME: отсутствует валидация имени
//        if (Validation.isValidName(name)) {
//            this.name = name;
//        } else {
//            this.name = "Иван";
//        }
//
//        // FIX_ME: отсутствует валидация оценок
//        /*
//        this.grades = grades;
//        */
//
//        if (Validation.isValidGrades(grades)) {
//            if (grades == null) {
//                this.grades = new int[0];
//            } else {
//                this.grades = grades;
//            }
//        } else {
//            this.grades = new int[0];
//        }
//    }

    public Student(String name, int[] grades){
        setName(name);
        setGrades(grades);
    }
//    public Student(String name, int[] grades){
//        this.name = name;
//        if(grades == null){
//            this.grades = new int[0];
//        }else{
//            this.grades = grades;
//        }
//    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        String errorName = Validation.nameError(name);
        if(errorName == null){
            this.name = name;
        }else {
            System.out.println("Данные введены неккоректно, заменяю на базовые: Иван");
            this.name = "Иван";
        }

    }

    public void setGrades(int[] grades) {
        int errorGrades = Validation.errorInArray(grades);
        if(errorGrades == 0 ) {
            this.grades = grades;
        } else {
            System.out.println("Ошибка в веденном массиве! Массив изменен.");
            this.grades = new int[] {3,4,5,3};
        }
    }

    public double getAverage() {
        // FIX_ME: не обробатывается null
        //if (grades.length == 0) return 0;
        if (grades == null || grades.length == 0) return 0;

        double sum = 0;
        for (int g : grades) sum += g;

        return sum / grades.length;
    }

    public boolean isExcellent() {
        if (grades.length == 0) return false;

        for (int g : grades) {
            if (g != 5) return false;
        }
        return true;
    }

    // FIX_ME: убрано
    //@Override
    //    public String toString(){
    //        if(grades.length ==0){
    //            return "Студент " + name + " без оценок";
    //        }else{
    //            return "Студент " + name + " " + Arrays.toString(grades);
    //        }
    //    }
    //    public  String toString(){
    //        if (gpa == 5) {
    //            return "У студента " + name + " средний балл: " + gpa + ". Он отличник";
    //        } else {
    //            return "У студента " + name + " средний балл: " + gpa + ". Он не отличник";
    //        }
    //    }

    //новый код
    @Override
    public String toString() {
        if (grades == null || grades.length == 0) {
            return "Студент " + name + " без оценок";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");

        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i < grades.length - 1) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }
}