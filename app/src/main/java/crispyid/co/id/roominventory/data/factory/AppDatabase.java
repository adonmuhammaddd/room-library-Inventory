package crispyid.co.id.roominventory.data.factory;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import crispyid.co.id.roominventory.data.BarangDAO;
import crispyid.co.id.roominventory.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BarangDAO barangDAO();

}