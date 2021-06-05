package com.tang;

import com.tang.celling.LevelOneCelling;
import com.tang.celling.LevelTwoCelling;
import com.tang.coat.DuluxCoat;
import com.tang.coat.LiBangCoat;
import com.tang.floor.ShengXiangFloor;
import com.tang.impl.DecorationPackageMenu;
import com.tang.tile.DongPengTile;
import com.tang.tile.MarcoPoloTile;

public class Builder {
    
    public static Builder builder() {
        return new Builder();
    }
    
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华")
                .appendCelling(new LevelTwoCelling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }
    
    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCelling(new LevelTwoCelling())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }
    
    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCelling(new LevelOneCelling())
                .appendCoat(new LiBangCoat())
                .appendTile(new DongPengTile());
                
    }
    
}
