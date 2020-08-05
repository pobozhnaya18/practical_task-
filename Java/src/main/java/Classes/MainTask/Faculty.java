package Classes.MainTask;

public enum Faculty {

    COMPUTER_AIDED_DESIGN("Computer-aided Design"),
    INFORMATION_TECHNOLOGIES_AND_CONTROL("Information Technologies and Control"),
    RADIOENGINEERING_AND_ELECTRONICS("Radioengineering and Electronics"),
    COMPUTER_SYSTEMS_AND_NETWORKS("Computer Systems and Networks"),
    INFOCOMMUNICATIONS("Infocommunications"),
    ENGINEERING_AND_ECONOMICS("Engineering and Economics");
    private String realName;

    Faculty(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}

