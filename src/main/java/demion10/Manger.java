package demion10;

import java.util.List;

public interface Manger extends Runnable, List {

    public static final int aa = 0;

    public abstract void show(Teacher teacher);


    public abstract void giveseater(Teacher teacher);

}
