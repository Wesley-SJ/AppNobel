package com.example.appnobel;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "db_book4u.db";
    private static final int version = 1;

    public Conexao(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL ("CREATE TABLE tbLegend(" +
               "legendId int primary key auto_increment," +
               "bioName varchar(50) not null, " +
               "weaponOne varchar (20) not null, " +
               "weaponTwo varchar (20) not null, " +
               "biofrom varchar(60) not null)"
);
        db.execSQL("CREATE TABLE tbArma(
               "armaId int primary key auto_increment," +
               "weaponName varchar(50))"
);
        db.execSQL("CREATE TABLE tbLegendArma(
                "fkArmaID int not null, +
                "fkLegendID int not null, + 
                "primary key(fkArmaID, fkLegendID), +
                "foreign key(fkArmaID) references tbArma (ArmaId), +
                "foreign key(fkLegendID) references tbLegend (LegendId))" 
                  S);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbUsuario");
        db.execSQL("DROP TABLE IF EXISTS tbFavoritos");

        onCreate(db);
    }

    public Cursor getNovaQuery(String sql)
    {
        SQLiteDatabase database = getWritableDatabase();
        Cursor cursor = database.rawQuery(sql, null);
        return cursor;
    }
}
