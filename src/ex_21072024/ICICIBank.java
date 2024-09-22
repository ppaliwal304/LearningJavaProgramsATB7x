package ex_21072024;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
      this.bal = bal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed!");
        }
    }


    public long getBal(boolean isAdmin) {
        if (isAdmin) {
            return bal;
        } else {
            return 0;
        }
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed!");
        }
    }





}

