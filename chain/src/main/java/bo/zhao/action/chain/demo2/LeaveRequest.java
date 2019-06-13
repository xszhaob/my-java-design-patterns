package bo.zhao.action.chain.demo2;

/**
 * @author Bo.Zhao
 * @since 19/6/13
 */
public class LeaveRequest {

    private final LeaveType type;

    private final int leaveDays;

    private final String employeeName;

    public LeaveRequest(LeaveType type, int leaveDays, String employeeName) {
        this.type = type;
        this.leaveDays = leaveDays;
        this.employeeName = employeeName;
    }

    public LeaveType getType() {
        return type;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
