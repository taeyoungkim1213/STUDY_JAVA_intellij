package ch2_객체지향.Ex99_연습문제;

public class Ex99_1_Customer {
    private int custId;
    private String custName;
    String custGrade;
    private int bonusPoint;
    double bonusRatio;
    
    public Ex99_1_Customer() {
        custGrade = "일반";
        bonusRatio= 0.1;
    }

    public Ex99_1_Customer(int custId, String custName, int bonusPoint) {
        this.custId = custId;
        this.custName = custName;
        this.bonusPoint = bonusPoint;
    }

    public Ex99_1_Customer(int custId, String custName, String custGrade, int bonusPoint, double bonusRatio) {
        this.custId = custId;
        this.custName = custName;
        this.custGrade = custGrade;
        this.bonusPoint = bonusPoint;
        this.bonusRatio = bonusRatio;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustGrade() {
        return custGrade;
    }

    public void setCustGrade(String custGrade) {
        this.custGrade = custGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {

        this.bonusRatio = bonusRatio;
    }
//
//    @Override
//    public String toString() {
//        return "Ex99_1_Customer{" +
//                "custId=" + custId +
//                ", custName='" + custName + '\'' +
//                ", custGrade='" + custGrade + '\'' +
//                ", bonusPoint=" + bonusPoint +
//                ", bonusRatio=" + bonusRatio +
//                '}';
//    }

        @Override
    public String toString() {
        return custName+"("+custGrade+")\r\n" +
                "보너스포인트: " +bonusPoint +"점\r\n" +
                "할인율:" + (int)(bonusRatio * 100) +"%";
    }
    public int totalPrice(int money) {
        return (int)(money - (money * bonusRatio));
//
    }
}
