package com.example.android.devbyteviewer.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\tJ\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/android/devbyteviewer/database/VideoDao;", "", "getVideos", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/devbyteviewer/database/DatabaseVideo;", "insertAll", "", "videos", "VideosDatabase", "app_debug"})
public abstract interface VideoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from databasevideo")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.android.devbyteviewer.database.DatabaseVideo>> getVideos();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.android.devbyteviewer.database.DatabaseVideo> videos);
    
    @androidx.room.Database(entities = {com.example.android.devbyteviewer.database.DatabaseVideo.class}, version = 1)
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/devbyteviewer/database/VideoDao$VideosDatabase;", "Landroidx/room/RoomDatabase;", "()V", "videoDao", "Lcom/example/android/devbyteviewer/database/VideoDao;", "getVideoDao", "()Lcom/example/android/devbyteviewer/database/VideoDao;", "app_debug"})
    public static abstract class VideosDatabase extends androidx.room.RoomDatabase {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.android.devbyteviewer.database.VideoDao getVideoDao();
        
        public VideosDatabase() {
            super();
        }
    }
}