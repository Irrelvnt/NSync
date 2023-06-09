package com.irrelvnt.nsync.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.core.os.HandlerCompat;

import com.irrelvnt.nsync.ui.song.Song;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SessionSaver implements Serializable {
    public List<Song> nowPlaying;
    public Context context;

    public SessionSaver(List<Song> nowPlaying, Context context) {
        this.nowPlaying = nowPlaying;
        this.context = context;
    }

    public void saveNow() {
        SaveAndLoad saveAndLoad = new SaveAndLoad(context, nowPlaying);
        try {
            saveAndLoad.save();
        } catch (Exception e) {}
    }
}
