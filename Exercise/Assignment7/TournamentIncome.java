
public class TournamentIncome extends Player implements GradeBonus {
    private int grade;

    public int getGrade() {
        return grade;
    }

    private double rate;//tỉ lệ thắng
    private PlayerIncome playerIncome;

    public PlayerIncome getPlayerIncome() {
        return playerIncome;
    }

    @Override
    public double calculateGradeBonus() {
        return this.grade * GRADE_BONUS_PERCENT;
    }


    public TournamentIncome(PlayerIncome playerIncome, String name, int grade, double rate) {
        super(name);
        this.rate = rate;
        this.grade = grade;
        this.playerIncome = playerIncome;
    }



    @Override
    public void displayDetail() {
        System.out.println("Name: " + super.getName());
        System.out.println("Grade: " + grade);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Total Salary: " + calculateSalary());
    }

    private double calculateSalary() {
        return this.playerIncome.getSalary() + this.getPlayerIncome().getSalary() * calculateGradeBonus();
    }

}
