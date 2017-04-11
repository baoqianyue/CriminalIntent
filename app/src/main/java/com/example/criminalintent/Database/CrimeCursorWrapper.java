package com.example.criminalintent.Database;

import android.database.Cursor;
import android.database.CursorWrapper;

/**
 * Created by 鲍骞月 on 2017/4/11.
 */

public class CrimeCursorWrapper extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }
}
