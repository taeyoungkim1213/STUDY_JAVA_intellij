package ch2_객체지향.Ex99_연습문제;

public class Ex99_2_VipCustomer extends Ex99_1_Customer {
//    private int custId;
//    private String custName;
    String custGrade;
//    private int bonusPoint;
    double bonusRatio;
    private int agentId;

    public Ex99_2_VipCustomer() {
        custGrade = "VIP";
        bonusRatio= 0.2;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public Ex99_2_VipCustomer(int custId, String custName, String custGrade, int bonusPoint, double bonusRatio, int agentId) {
        super(custId, custName, custGrade, bonusPoint, bonusRatio);
        this.agentId = agentId;
    }

//    @Override
//    public String toString() {
//        return "Ex99_2_VipCustomer{" +
//                "agentId=" + agentId +
//                ", custGrade='" + custGrade + '\'' +
//                ", bonusRatio=" + bonusRatio +
//                '}';
//    }

    public int totalPrice(int money) {
        return (int)(money - (money * bonusRatio) - 500);
//
    }

}
