package observer;

/**
 * @author YNZ
 */
public class UsingObserverPattern {

    public static void main(String[] args) {

        DbWriter dbWriter = new DbWriter();
        GuiPlotter guiPlotter = new GuiPlotter();

        DataSource dataSource = new DataSource();
        dataSource.addObserver(dbWriter);
        dataSource.addObserver(guiPlotter);

        dataSource.setValue(66.66);

        System.out.println(dbWriter.getValue());

    }
}
