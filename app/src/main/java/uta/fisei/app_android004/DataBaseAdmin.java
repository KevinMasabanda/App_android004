package uta.fisei.app_android004;

import android.content.Context;
import android.content.SyncRequest;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseAdmin extends SQLiteOpenHelper {

    //Creacion de la estructura de las tablas
    private static final String TABLE_CLIENTS = "CREATE TABLE Clients " +
                                                "(Code INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT," +
                                                " LastName TEXT, Phone TEXT, Email TEXT)";

    private static final String  DROP_TABLE = "DROP TABLE IF EXISTS Clients";

    public DataBaseAdmin(@Nullable Context context,
                         @Nullable String name,
                         @Nullable SQLiteDatabase.CursorFactory factory,
                         int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Creacion de la estructura de las tablas
        sqLiteDatabase.execSQL(TABLE_CLIENTS);
        //INSERT INTO Clients(.......)
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        //Los comandos requeridos cuando hay cambios en la estructura de las tablas

        sqLiteDatabase.execSQL(DROP_TABLE);

        sqLiteDatabase.execSQL(TABLE_CLIENTS);



    }
}
