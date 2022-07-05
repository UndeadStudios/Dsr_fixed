// Item Spawn Points by xerozcheez
import java.io.*;


public class itemspawnpoints {
    public int spawntimer = 0;

    public void LoadItems() {
        for (int i = 0; i <= 5000; i++) {
            if (spawntimer <= 1) {
                ItemHandler.addItem(5698, 2532, 3166, 1,
                        ItemHandler.globalItemController[i], false); // Dds




		spawntimer = 60;
            }
        }
    }

    public void process() {
        LoadItems();
        spawntimer -= 1;
    }
}
