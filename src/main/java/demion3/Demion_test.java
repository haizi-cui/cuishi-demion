package demion3;

public class Demion_test {
    public static void main(String[] args) {
        Cell  c = new Cell();
        c.setCellRl(80);
        c.getCellRl();
        Phone ph = new Phone();
        ph.setPhoneType("vivo");
        String a=ph.getPhoneType();
        ph.setCell(c);
        ph.getCell();
        ph.xudian();
        ph.playMusic("狼爱上羊");
    }
}
