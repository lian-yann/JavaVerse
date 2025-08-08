public class sample {
    public static void
    main(String[] args) {
        QuizList quiz = new QuizList();
        quiz.quizzes[0] = 21;
        quiz.quizzes[1] = 10;
        quiz.quizzes[2] = 15;
        quiz.quizzes[3] = 25;
        quiz.quizzes[4] = 25;
        quiz.quizyy();

        System.out.println();

        ActivityList activity = new ActivityList();
        activity.activities[0] = 25;
        activity.activities[1] = 26;
        activity.activities[2] = 34;
        activity.displayActivity();
        
        System.out.println();

        Recitation recitationResult = new Recitation();
        recitationResult.recitationScore = 20;
        recitationResult.displayRecitation();

        System.out.println();

        Exam examResult = new Exam();
        examResult.examScore = 30;
        examResult.displayExam();

        System.out.println();

        PassorFail gradeResult = new PassorFail();
        gradeResult.check();


    }
}


class QuizList {                                                                                 //20% fix quiz grade 
    int[] quizzes = new int[5];                                                                    //5 quizzes, each is total to 25
    double sum;
    double quizTotal = 125.0;
    double quizResult = 0.20;
    double quizGrade;
    double quizPercent;                                                 //so 125 total

        public double quizyy() {
        for(int i = 0; i < quizzes.length; ++i) {
            System.out.printf("Quiz #%d = %d\n", i + 1, quizzes[i]);
        }
        for(int x = 0; x < quizzes.length; ++x) {
            sum += quizzes[x];
        }
        quizGrade = (sum / quizTotal) * 100.0;                                                                 //to get the grade max. 100.00
        quizPercent = quizGrade * quizResult;                                                                 // to get percentage max. 20.00%
        System.out.println("Quiz grade Percentage = " + quizPercent);

    
        return quizPercent;
    
    }
}


class ActivityList {
    int[] activities = new int[3];
    double actsum;
    double actTotal = 90.0, actAverage, actPercent;
    double actResult = 0.20;


    void displayActivity() {
        for(int i = 0; i < activities.length; ++i) {
            System.out.printf("Activity #%d = %d\n", i + 1, activities[i]);
        }
        for(int j = 0; j < activities.length; ++j) {
            actsum += activities[j];
        }
        actAverage = (actsum / actTotal) * 100.0;
        actPercent = actAverage * actResult;
        System.out.println("Activity grade Percentage = " + actPercent);
    }
}

class Recitation{
    int recitationScore;
    double reciTotal = 25.0;
    double reciPercent = 0.20;
    double reciGrade;
    double reciResult;

    void displayRecitation() {
        System.out.println("Recitation = " + recitationScore);

        reciGrade = (recitationScore / reciTotal) * 100.0;
        reciResult = reciGrade * reciPercent;
        System.out.println("Recitation grade Percentage = " + reciResult);
    }
}

class Exam {
    int examScore;
    double examPercent = 0.20;
    double examTotal = 50.0;
    double examResult;
    double examGrade;

    void displayExam() {
        System.out.println("Exam = " + examScore);
        examGrade = (examScore / examTotal) * 100;
        examResult = examGrade * examPercent;
        System.out.println("Exam grade Percentage = " + examResult);
    }
}

class PassorFail {
    public void check() {
        QuizList qz = new QuizList();      // Step 1: Create an object
        double value = qz.quizyy();
        System.out.println("the valued = " + value);
        
      // Step 2: Must call this to calculate quizPercent
         // Step 3: Now we can get the result

    }
}


    
    


