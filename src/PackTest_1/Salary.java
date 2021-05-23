package PackTest_1;

public class Salary implements Vocabulary{
    private final String salaryFrom;
    private final String salaryTo;
    private final int valueSalary;

    public Salary(String salaryFrom, String salaryTo, int valueSalary) {
        this.salaryFrom = salaryFrom;
        this.salaryTo = salaryTo;
        this.valueSalary = valueSalary;
    }

    @Override
    public String getFrom() {
        return salaryFrom;
    }

    @Override
    public String getTo() {
        return salaryTo;
    }

    @Override
    public Object getContent() {
        return valueSalary;
    }
}
