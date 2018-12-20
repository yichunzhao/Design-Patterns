package observer;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author YNZ
 */
public class DataSourceTest {

    @Test
    public void testObserverPattern() {

        //observers
        DbWriter dbWriter = new DbWriter();
        GuiPlotter guiPlotter = new GuiPlotter();

        //observable
        DataSource dataSource = new DataSource();
        dataSource.addObserver(dbWriter);
        dataSource.addObserver(guiPlotter);

        //data source having new data
        dataSource.setValue(1.66);

        assertThat(dbWriter.getValue(), is(1.66));
        assertThat(guiPlotter.getValue(),is(1.66));


    }

}