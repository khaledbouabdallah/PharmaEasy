package com.example.pharmaeasy;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class MyAppDataBase extends RoomDatabase {

    public  abstract MyDao mydao ();
}
